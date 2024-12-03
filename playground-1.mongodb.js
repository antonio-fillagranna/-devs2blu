/* global use, db */
// MongoDB Playground
// To disable this template go to Settings | MongoDB | Use Default Template For Playground.
// Make sure you are connected to enable completions and to be able to run a playground.
// Use Ctrl+Space inside a snippet or a string literal to trigger completions.
// The result of the last command run in a playground is shown on the results panel.
// By default the first 20 documents will be returned with a cursor.
// Use 'console.log()' to print to the debug output.
// For more documentation on playgrounds please refer to
// https://www.mongodb.com/docs/mongodb-vscode/playgrounds/

// Select the database to use.
use('ecommerce2');

// Insert a few documents into the sales collection.
db.getCollection('produtos').insertMany([
  { 'item': 'Notbook', 'preco': 3500, 'quantidade': 100, 'data': new Date('2024-11-25') },
  { 'item': 'Smartphone', 'preco': 2500.00, 'quantidade': 100, 'data': new Date('2024-11-29') },
  { 'item': 'Headset', 'preco': 200.00, 'quantidade': 100, 'data': new Date('2024-11-30') },
  { 'item': 'Monitor', 'preco': 1200.00, 'quantidade': 100, 'data': new Date('2024-12-01') },
]);

db.getCollection('clientes').insertMany([
  {
    nome: 'Ana Silva',
    endereco: 'Rua das Flores, 123',
    email: 'ana.silva@gmail.com',
    dataNascimento: new Date('1990-04-15'),
    telefone: '11987654321'
  },
  {
    nome: 'João Oliveira',
    endereco: 'Avenida Paulista, 987',
    email: 'joao.oliveira@yahoo.com',
    dataNascimento: new Date('1985-09-20'),
    telefone: '11912345678'
  },
  {
    nome: 'Carla Souza',
    endereco: 'Rua do Carmo, 45',
    email: 'carla.souza@hotmail.com',
    dataNascimento: new Date('1992-12-05'),
    telefone: '11999887766'
  },
]);

// Cria e insere documentos na collection "carrinhos".
db.getCollection('carrinhos').insertMany([
  {
    codigo: 1,
    nomeCliente: 'Ana Silva',
    nomeProduto: 'Notebook',
  },
  {
    codigo: 2,
    nomeCliente: 'João Oliveira',
    nomeProduto: 'Smartphone',
  },
  {
    codigo: 3,
    nomeCliente: 'Carla Souza',
    nomeProduto: 'Headset',
  },
]);


// Pesquisa em todas as collections.

// Pesquisa todos os produtos e exibe seus campos.
const produtos = db.getCollection('produtos').find().toArray();
console.log('Produtos:');
console.log(produtos);

// Pesquisa todos os clientes e exibe seus campos.
const clientes = db.getCollection('clientes').find().toArray();
console.log('Clientes:');
console.log(clientes);

// Pesquisa todos os carrinhos e exibe seus campos.
const carrinhos = db.getCollection('carrinhos').find().toArray();
console.log('Carrinhos:');
console.log(carrinhos);
