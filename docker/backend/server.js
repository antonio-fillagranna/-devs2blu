const express = require('express');
require('dotenv').config();
const app = express();
const port = process.env.PORT || 3000;

app.use(express.json());

app.use('/usuarios', require('./routes/usuario'));
app.use('/contatos', require('./routes/contato'));
app.use('/locais', require('./routes/local'));
app.use('/compromissos', require('./routes/compromisso'));

app.listen(port, () => {
  console.log(`Servidor rodando em http://localhost:${port}`);
});