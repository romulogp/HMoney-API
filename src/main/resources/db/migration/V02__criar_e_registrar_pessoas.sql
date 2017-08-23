CREATE TABLE pessoa (
  codigo      BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome        VARCHAR(50) NOT NULL,
  logradouro  VARCHAR(50),
  numero      VARCHAR(10),
  complemento VARCHAR(30),
  bairro      VARCHAR(30),
  cep         VARCHAR(15),
  cidade      VARCHAR(50),
  estado      VARCHAR(2),
  ativo       BOOLEAN     NOT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Rômulo Göelzer Portolann', 'Rua Osvaldo Minella', '2029', 'Bloco J, Ap 403', 'Cedro', '88341780', 'Camboriú', 'SC', TRUE);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Natália de Oliveira Vacariano Göelzer', 'Rua Osvaldo Minella', '2029', 'Bloco J, Ap 403', 'Cedro', '88341780', 'Camboriú', 'SC', TRUE);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Marisa Göelzer', 'Rua Amsterdã', '105', NULL, 'Santa Regina', '88345605', 'Camboriú', 'SC', TRUE);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('Paulo Ricardo Coutinho Gomes', 'Rua Amsterdã', '105', NULL, 'Santa Regina', '88345605', 'Camboriú', 'SC', TRUE);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES ('João Silva', 'Rua do Abacaxi', '10', NULL, 'Brasil', '38.400-12', 'Uberlândia', 'MG', TRUE);