const express = require('express');
const router = express.Router();
const pool = require('../db');

router.get('/', async (req, res) => {
  const result = await pool.query('SELECT * FROM local');
  res.json(result.rows);
});

router.post('/', async (req, res) => {
  const { nome, endereco } = req.body;
  const result = await pool.query(
    'INSERT INTO local (nome, endereco) VALUES ($1, $2) RETURNING *',
    [nome, endereco]
  );
  res.status(201).json(result.rows[0]);
});

router.put('/:id', async (req, res) => {
  const { id } = req.params;
  const { nome, endereco } = req.body;
  const result = await pool.query(
    'UPDATE local SET nome = $1, endereco = $2 WHERE id = $3 RETURNING *',
    [nome, endereco, id]
  );
  res.json(result.rows[0]);
});

router.delete('/:id', async (req, res) => {
  const { id } = req.params;
  const result = await pool.query('DELETE FROM local WHERE id = $1 RETURNING *', [id]);
  res.json({ message: 'Local deletado', local: result.rows[0] });
});

module.exports = router;