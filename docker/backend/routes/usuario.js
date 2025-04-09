const express = require('express');
const router = express.Router();
const pool = require('../db');

router.get('/', async (req, res) => {
  const result = await pool.query('SELECT * FROM usuario');
  res.json(result.rows);
});

router.post('/', async (req, res) => {
  const { nome, email, senha, nivelAcesso } = req.body;
  const result = await pool.query(
    'INSERT INTO usuario (nome, email, senha, nivelAcesso) VALUES ($1, $2, $3, $4) RETURNING *',
    [nome, email, senha, nivelAcesso]
  );
  res.status(201).json(result.rows[0]);
});

router.put('/:id', async (req, res) => {
  const { id } = req.params;
  const { nome, email, senha, nivelAcesso } = req.body;
  const result = await pool.query(
    'UPDATE usuario SET nome = $1, email = $2, senha = $3, nivelAcesso = $4 WHERE id = $5 RETURNING *',
    [nome, email, senha, nivelAcesso, id]
  );
  res.json(result.rows[0]);
});

router.delete('/:id', async (req, res) => {
  const { id } = req.params;
  const result = await pool.query('DELETE FROM usuario WHERE id = $1 RETURNING *', [id]);
  res.json({ message: 'Usuário deletado', usuario: result.rows[0] });
});

module.exports = router;
