CREATE TABLE IF NOT EXISTS usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    nivelAcesso VARCHAR(10) NOT NULL CHECK (nivelAcesso IN ('admin', 'usuario'))
);

CREATE TABLE IF NOT EXISTS contato (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    email VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS local (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    endereco TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS compromisso (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    data DATE NOT NULL,
    hora TIME NOT NULL,
    contatoId INT,
    localId INT,
    usuarioId INT NOT NULL,
    CONSTRAINT fk_contato
       FOREIGN KEY (contatoId)
       REFERENCES contato (id)
       ON DELETE SET NULL,
    CONSTRAINT fk_local
       FOREIGN KEY (localId)
       REFERENCES local (id)
       ON DELETE SET NULL,
    CONSTRAINT fk_usuario
       FOREIGN KEY (usuarioId)
       REFERENCES usuario (id)
);

INSERT INTO usuario (nome, email, senha, nivelAcesso)
VALUES
  ('João Silva', 'joao@exemplo.com', 'senha123', 'admin'),
  ('Maria Souza', 'maria@exemplo.com', 'senha456', 'usuario');

INSERT INTO contato (nome, telefone, email)
VALUES
  ('Carlos Pereira', '11999999999', 'carlos@exemplo.com'),
  ('Ana Paula', '11988888888', 'ana@exemplo.com');

INSERT INTO local (nome, endereco)
VALUES
  ('Escritório Central', 'Rua Principal, 123, Centro, Cidade');

INSERT INTO compromisso (titulo, descricao, data, hora, contatoId, localId, usuarioId)
VALUES
  (
    'Reunião de Planejamento', 
    'Reunião para discutir o planejamento do projeto.', 
    '2025-04-20', 
    '14:00:00', 
    1, -- contatoId (Carlos Pereira)
    1, -- localId (Escritório Central)
    1  -- usuarioId (João Silva)
  ),
  (
    'Consulta de Rotina', 
    'Consulta médica de rotina.', 
    '2025-04-22', 
    '09:30:00', 
    2, -- contatoId (Ana Paula)
    1, -- localId (Escritório Central)
    2  -- usuarioId (Maria Souza)
  );
