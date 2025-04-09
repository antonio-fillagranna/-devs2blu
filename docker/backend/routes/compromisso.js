const express = require('express');
const router = express.Router();
const pool = require('../db');

router.get('/', async (req, res) => {
  const result = await pool.query('SELECT * FROM compromisso');
  res.json(result.rows);
});

router.post('/', async (req, res) => {
  const { titulo, descricao, data, hora, contatoId, localId, usuarioId } = req.body;
  const result = await pool.query(
    'INSERT INTO compromisso (titulo, descricao, data, hora, contatoId, localId, usuarioId) VALUES ($1, $2, $3, $4, $5, $6, $7) RETURNING *',
    [titulo, descricao, data, hora, contatoId, localId, usuarioId]
  );
  res.status(201).json(result.rows[0]);
});

router.put('/:id', async (req, res) => {
  const { id } = req.params;
  const { titulo, descricao, data, hora, contatoId, localId, usuarioId } = req.body;
  const result = await pool.query(
    'UPDATE compromisso SET titulo = $1, descricao = $2, data = $3, hora = $4, contatoId = $5, localId = $6, usuarioId = $7 WHERE id = $8 RETURNING *',
    [titulo, descricao, data, hora, contatoId, localId, usuarioId, id]
  );
  res.json(result.rows[0]);
});

router.delete('/:id', async (req, res) => {
  const { id } = req.params;
  const result = await pool.query('DELETE FROM compromisso WHERE id = $1 RETURNING *', [id]);
  res.json({ message: 'Compromisso deletado', compromisso: result.rows[0] });
});

module.exports = router;
