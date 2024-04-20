
# PetShop do Wendell

## Descrição do Projeto

O PetShop do Wendell é uma aplicação Java que simula um sistema de gerenciamento de produtos para um pet shop. A aplicação permite cadastrar, pesquisar e remover produtos, além de salvar e recuperar dados de um arquivo.

## Funcionalidades Implementadas

### Cadastro de produtos:

- Permite cadastrar um novo produto com código, nome, descrição e quantidade.
- Valida se o código do produto já existe antes de cadastrar.
- Salva os dados do produto em um arquivo após o cadastro.

### Pesquisa de produtos:

- Permite pesquisar produtos por nome, retornando uma lista de produtos que começam com o nome informado.

### Remoção de produtos:

- Permite remover um produto pelo seu código.
- Remove o produto da lista de produtos e atualiza o arquivo de dados.

### Gerenciamento de dados:

- Salva os dados dos produtos em um arquivo local quando a aplicação é fechada.
- Recupera os dados dos produtos do arquivo quando a aplicação é aberta.

## Tecnologias Utilizadas

- Java 8
- HashMap (para armazenar os produtos)
- GravadorDeDados (classe abstrata para salvar e recuperar dados do arquivo)

## Próximos Passos

- Implementar a funcionalidade de edição de produtos.
- Implementar um sistema de autenticação para o usuário.
- Criar uma interface gráfica para a aplicação.
