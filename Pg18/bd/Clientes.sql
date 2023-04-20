
CREATE DATABASE BClientes;
USE BClientes;

CREATE TABLE TClientes  (
IdCliente   VARCHAR(12)   NOT NULL PRIMARY KEY,
Password    VARCHAR(12)   NOT NULL,
Nombre      VARCHAR(20)   NOT NULL
);

