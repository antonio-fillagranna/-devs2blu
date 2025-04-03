const express = require('express');
const app = express();
const PORT = 3000;

const contatos = [
    { id: 1, nome: "João Silva", telefone: "99999-9999" },
    { id: 2, nome: "Maria Oliveira", telefone: "98888-8888" },
    { id: 3, nome: "Carlos Souza", telefone: "97777-7777" }
];

app.get('/contatos', (req, res) => {
    res.json(contatos);
});

app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});
