CREATE TABLE cartao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(16) NOT NULL,
    nome_titular VARCHAR(100) NOT NULL,
    data_expiracao VARCHAR(7) NOT NULL, -- formato MM/YYYY
    cvv INT NOT NULL,
    limite_total DECIMAL(10,2) NOT NULL,
    saldo_utilizado DECIMAL(10,2) NOT NULL
);
