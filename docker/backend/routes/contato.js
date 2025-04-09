const express = require('express');
const router = express.Router();
const pool = require('../db');

router.get('/', async (req, res) => {
  const result = await pool.query('SELECT * FROM contato');
  res.json(result.rows);
});

router.post('/', async (req, res) => {
  const { nome, telefone, email } = req.body;
  const result = await pool.query(
    'INSERT INTO contato (nome, telefone, email) VALUES ($1, $2, $3) RETURNING *',
    [nome, telefone, email]
  );
  res.status(201).json(result.rows[0]);
});

router.put('/:id', async (req, res) => {
  const { id } = req.params;
  const { nome, telefone, email } = req.body;
  const result = await pool.query(
    'UPDATE contato SET nome = $1, telefone = $2, email = $3 WHERE id = $4 RETURNING *',
    [nome, telefone, email, id]
  );
  res.json(result.rows[0]);
});

router.delete('/:id', async (req, res) => {
  const { id } = req.params;
  const result = await pool.query('DELETE FROM contato WHERE id = $1 RETURNING *', [id]);
  res.json({ message: 'Contato deletado', contato: result.rows[0] });
});

module.exports = router;