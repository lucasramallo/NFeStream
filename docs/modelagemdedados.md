# Modelagem do Banco de Dados

## 1. Estrutura das Tabelas

### 1.1. Tabela: Emitente
Armazena os dados dos emitentes das notas fiscais (empresas que emitem as notas).

| Campo         | Tipo          | Descrição                            |
|---------------|---------------|--------------------------------------|
| `id`          | SERIAL (PK)    | Identificador único do emitente       |
| `cnpj`        | VARCHAR(14)    | CNPJ do emitente                      |
| `nome`        | VARCHAR(255)   | Nome da empresa emitente              |
| `endereco`    | TEXT           | Endereço do emitente                  |
| `telefone`    | VARCHAR(15)    | Telefone do emitente                  |
| `email`       | VARCHAR(255)   | Email do emitente                     |

### 1.2. Tabela: Destinatario
Armazena os dados dos destinatários das notas fiscais (clientes que recebem as notas).

| Campo         | Tipo          | Descrição                            |
|---------------|---------------|--------------------------------------|
| `id`          | SERIAL (PK)    | Identificador único do destinatário   |
| `cnpj_cpf`    | VARCHAR(14)    | CNPJ ou CPF do destinatário           |
| `nome`        | VARCHAR(255)   | Nome do destinatário                 |
| `endereco`    | TEXT           | Endereço do destinatário             |
| `telefone`    | VARCHAR(15)    | Telefone do destinatário             |
| `email`       | VARCHAR(255)   | Email do destinatário                |

### 1.3. Tabela: Produto_Servico
Armazena os produtos e serviços incluídos nas notas fiscais.

| Campo              | Tipo          | Descrição                             |
|--------------------|---------------|---------------------------------------|
| `id`               | SERIAL (PK)    | Identificador único do produto/serviço|
| `codigo`           | VARCHAR(100)   | Código do produto ou serviço          |
| `descricao`        | VARCHAR(255)   | Descrição do produto ou serviço       |
| `unidade`          | VARCHAR(50)    | Unidade de medida                     |
| `preco_unitario`   | DECIMAL(10, 2) | Preço unitário do produto ou serviço  |
| `ncm`              | VARCHAR(10)    | Código NCM (Nomenclatura Comum do Mercosul) |

### 1.4. Tabela: NFE
Armazena as notas fiscais eletrônicas (NF-e).

| Campo               | Tipo          | Descrição                                |
|---------------------|---------------|------------------------------------------|
| `id`                | SERIAL (PK)    | Identificador único da NF-e              |
| `chave_acesso`      | VARCHAR(44)    | Chave de acesso da NF-e                  |
| `numero_nfe`        | INT            | Número da NF-e                           |
| `serie`             | VARCHAR(3)     | Série da NF-e                            |
| `data_emissao`      | TIMESTAMP      | Data de emissão da NF-e                  |
| `tipo_operacao`     | VARCHAR(50)    | Tipo da operação (ex: Venda, Compra)     |
| `valor_total`       | DECIMAL(10, 2) | Valor total da NF-e                      |
| `emitente_id`       | INT            | Referência ao emitente                   |
| `destinatario_id`   | INT            | Referência ao destinatário               |
| `caminho_pdf`       | VARCHAR(255)   | Caminho para o arquivo PDF da NF-e       |
| `caminho_xml`       | VARCHAR(255)   | Caminho para o arquivo XML da NF-e       |

### 1.5. Tabela: Item_NFE
Armazena os itens (produtos/serviços) de cada NF-e.

| Campo                  | Tipo          | Descrição                                |
|------------------------|---------------|------------------------------------------|
| `id`                   | SERIAL (PK)    | Identificador único do item              |
| `nfe_id`               | INT            | Referência à NF-e                       |
| `produto_servico_id`   | INT            | Referência ao produto ou serviço         |
| `quantidade`           | DECIMAL(10, 2) | Quantidade do item                       |
| `valor_unitario`       | DECIMAL(10, 2) | Valor unitário do item                   |
| `valor_total`          | DECIMAL(10, 2) | Valor total do item                      |

### 1.6. Tabela: Imposto
Armazena informações sobre impostos relacionados às NF-e.

| Campo              | Tipo          | Descrição                                |
|--------------------|---------------|------------------------------------------|
| `id`               | SERIAL (PK)    | Identificador único do imposto           |
| `tipo_imposto`     | VARCHAR(50)    | Tipo de imposto (ex.: ICMS, IPI)         |
| `valor`            | DECIMAL(10, 2) | Valor do imposto                         |
| `nfe_id`           | INT            | Referência à NF-e                       |

### 1.7. Tabela: Transporte
Armazena dados sobre o transporte da mercadoria.

| Campo                | Tipo          | Descrição                                |
|----------------------|---------------|------------------------------------------|
| `id`                 | SERIAL (PK)    | Identificador único do transporte        |
| `modalidade_frete`   | VARCHAR(50)    | Modalidade de frete (ex: CIF, FOB)       |
| `transportadora_nome`| VARCHAR(255)   | Nome da transportadora                   |
| `transportadora_cnpj`| VARCHAR(14)    | CNPJ da transportadora                   |
| `nfe_id`             | INT            | Referência à NF-e                       |
