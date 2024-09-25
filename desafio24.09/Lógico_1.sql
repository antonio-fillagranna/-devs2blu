/* Lógico_1: */

CREATE TABLE Transportadora (
    NomeRazaoSocial VARCHAR(100),
    TipoFrete VARCHAR(3),
    CodigoAntt VARCHAR(50),
    PlacaVeiculo VARCHAR(50),
    UFVeiculo VARCHAR(2),
    CNPJ VARCHAR(50),
    Endereco VARCHAR(150),
    UF VARCHAR(2),
    InscricaoEstadual VARCHAR(50),
    Quantidade VARCHAR(50),
    Especie VARCHAR(50),
    Marca VARCHAR(50),
    Numeracao VARCHAR(50),
    PesoBruto NUMERIC(12,2),
    PesoLiquido NUMERIC(12,2),
    Municipio VARCHAR(50),
    idTransportadora SERIAL PRIMARY KEY,
    fk_NFE_Emitente_Destinatario_NumeroNFE SERIAL,
    fk_NFE_Emitente_Destinatario_CNPJ SERIAL,
    fk_NFE_Emitente_Destinatario_IdDestinatario SERIAL
);

CREATE TABLE Financeiro (
    IdFinanceiro SERIAL PRIMARY KEY,
    NumeroParcela INTEGER(100),
    Vencimento DATE,
    Valor NUMERIC(12,2)
);

CREATE TABLE Produtos (
    IdProdutos SERIAL PRIMARY KEY,
    CodigoProduto INTEGER(100),
    DescricaoProduto VARCHAR(100),
    NCM VARCHAR(100),
    CST VARCHAR(100),
    CFOP INTEGER(100),
    Un INTERGER,
    Quant NUMERIC(12,2),
    ValorUnit NUMERIC(12,2),
    ValorTotal NUMERIC(12,2),
    ValorDesc NUMERIC(12,2),
    BCalcICMS NUMERIC(12,2),
    ValorICMS NUMERIC(12,2),
    ValorIPI NUMERIC(12,2),
    AliqICMS NUMERIC(12,2),
    AliqIPI NUMERIC(12,2)
);

CREATE TABLE Totais_NFE_Emitente_Destinatario (
    IdTotais SERIAL,
    BaseICMS NUMERIC(12,2),
    BaseICMSST NUMERIC(12,2),
    VImpImportacao NUMERIC(12,2),
    VICMSUFRemet NUMERIC(12,2),
    VFcpUFDest NUMERIC(12,2),
    VTotalProdutos NUMERIC(12,2),
    ValorFrete NUMERIC(12,2),
    ValorSeguro NUMERIC(12,2),
    OutrasDespesas NUMERIC(12,2),
    ValorTotalIPI NUMERIC(12,2),
    VICMSUFDest NUMERIC(12,2),
    VTOTTrib NUMERIC(12,2),
    ValorTotalNota NUMERIC(12,2),
    NumeroNFE SERIAL,
    Serie INTEGER(100),
    Operacao INTEGER(100),
    EntradaSaida INTEGER(100),
    ChavaAcesso VARCHAR(100),
    ProtocoloAutUso INTEGER(100),
    DataAutUso DATE,
    InformacoesComplementares VARCHAR(100),
    CNPJ SERIAL,
    NomeRazaoSocial VARCHAR(100),
    InscricaoEstadual INTEGER(30),
    UF VARCHAR(2),
    NomeFantasia VARCHAR(100),
    Endereco VARCHAR(100),
    Telefone INTEGER(100),
    IdDestinatario SERIAL,
    Nome VARCHAR(100),
    Bairro VARCHAR(100),
    CEP VARCHAR(20),
    Municipio VARCHAR(100),
    Fone VARCHAR(30),
    CPF VARCHAR(20),
    PRIMARY KEY (IdTotais, NumeroNFE, CNPJ, IdDestinatario)
);

CREATE TABLE Nfe_Produtos (
    fk_Produtos_IdProdutos SERIAL,
    fk_NFE_Emitente_Destinatario_NumeroNFE SERIAL,
    fk_NFE_Emitente_Destinatario_CNPJ SERIAL,
    fk_NFE_Emitente_Destinatario_IdDestinatario SERIAL
);

CREATE TABLE Nfe_Cobranca (
    fk_NFE_Emitente_Destinatario_NumeroNFE SERIAL,
    fk_NFE_Emitente_Destinatario_CNPJ SERIAL,
    fk_NFE_Emitente_Destinatario_IdDestinatario SERIAL,
    fk_Financeiro_IdFinanceiro SERIAL
);
 
ALTER TABLE Transportadora ADD CONSTRAINT FK_Transportadora_2
    FOREIGN KEY (fk_NFE_Emitente_Destinatario_NumeroNFE, fk_NFE_Emitente_Destinatario_CNPJ, fk_NFE_Emitente_Destinatario_IdDestinatario)
    REFERENCES ??? (???);
 
ALTER TABLE Nfe_Produtos ADD CONSTRAINT FK_Nfe_Produtos_1
    FOREIGN KEY (fk_Produtos_IdProdutos)
    REFERENCES Produtos (IdProdutos)
    ON DELETE RESTRICT;
 
ALTER TABLE Nfe_Produtos ADD CONSTRAINT FK_Nfe_Produtos_2
    FOREIGN KEY (fk_NFE_Emitente_Destinatario_NumeroNFE, fk_NFE_Emitente_Destinatario_CNPJ, fk_NFE_Emitente_Destinatario_IdDestinatario)
    REFERENCES ??? (???);
 
ALTER TABLE Nfe_Cobranca ADD CONSTRAINT FK_Nfe_Cobranca_1
    FOREIGN KEY (fk_NFE_Emitente_Destinatario_NumeroNFE, fk_NFE_Emitente_Destinatario_CNPJ, fk_NFE_Emitente_Destinatario_IdDestinatario)
    REFERENCES ??? (???);
 
ALTER TABLE Nfe_Cobranca ADD CONSTRAINT FK_Nfe_Cobranca_2
    FOREIGN KEY (fk_Financeiro_IdFinanceiro)
    REFERENCES Financeiro (IdFinanceiro)
    ON DELETE RESTRICT;