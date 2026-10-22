# Projeto Orientado a Objetos

Projeto acadêmico desenvolvido em Java para praticar os fundamentos da
Programação Orientada a Objetos, incluindo classes, objetos, herança,
encapsulamento, interfaces, getters, setters e organização em camadas.

Atualmente, o projeto utiliza classes DAO para simular consultas de pessoas
e clientes em memória. Ainda não existe integração com banco de dados,
API ou interface gráfica.

## Estrutura atual

- `Pessoa`: classe-base com dados como ID, nome, CPF, e-mail e telefone.
- `Cliente`: herda de `Pessoa` e acrescenta código de cliente e oferta.
- `Funcionario`: herda de `Pessoa` e acrescenta cargo e salário.
- `Dao`: interface que define operações comuns de acesso aos dados.
- `PessoaDao`: simula a busca de uma pessoa pelo ID.
- `ClienteDao`: simula a busca de um cliente pelo ID.
- `Main`: executa os exemplos e apresenta os dados no console.

## Conceitos praticados

- criação de classes e objetos;
- atributos privados;
- encapsulamento com getters e setters;
- herança entre `Pessoa`, `Cliente` e `Funcionario`;
- interface para definir um contrato comum;
- implementação de métodos com `@Override`;
- conversão de `Object` para tipos específicos;
- passagem de argumentos e retorno de objetos;
- separação inicial entre modelo, DAO e execução;
- consulta simulada em memória.

## Fluxo atual

1. O `Main` cria uma instância de `PessoaDao`.
2. `PessoaDao` recebe um ID e devolve uma pessoa fictícia.
3. O programa altera o nome do objeto somente em memória.
4. O `Main` cria uma instância de `ClienteDao`.
5. `ClienteDao` recebe um ID e devolve um cliente fictício.
6. O programa exibe o nome herdado de `Pessoa` e a oferta de `Cliente`.

## Configuração UTF-8

Durante os testes, o arquivo-fonte estava salvo corretamente em UTF-8,
mas caracteres acentuados apareciam incorretamente no console.

A execução foi configurada em `VM Options` com:

```text
-Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
```

Aprendizado: a codificação do arquivo pode ser diferente da codificação
utilizada por `System.out` e `System.err`.

## Evolução do aprendizado

O projeto começou com a criação direta de objetos no `Main` para praticar
herança, getters e setters.

Depois, o fluxo evoluiu para consultas simuladas por meio das classes DAO.
O exemplo antigo foi removido do código principal para melhorar a leitura
e deixar o `Main` focado na implementação atual.

O exercício anterior continua disponível no histórico do Git.

## Como executar

1. Abra o projeto no Apache NetBeans.
2. Confirme que a classe principal é `Main`.
3. Execute o projeto com `F6`.
4. Verifique a saída na janela `Output`.

Resultado esperado:

```text
Nome encontrado: Pedro Porto
E-mail encontrado: pedroporto@gmail.com
Nome apos alteracao: Pedro Porto Atualizado
ID encontrado: 1
Cliente encontrado: Allan Alves
Oferta encontrada: Serviço de Marketing
BUILD SUCCESSFUL
Todos os dados exibidos são fictícios e utilizados somente para estudo.
```

## Limitações atuais

- os dados são fictícios e permanecem somente em memória;
- os métodos `salvar`, `editar`, `excluir` e `listar` ainda não foram implementados;
- não existe integração com banco de dados;
- não existe API ou interface gráfica;
- ainda não existem testes automatizados.

## Próximos passos

- implementar uma lista em memória;
- concluir as operações definidas pela interface `Dao`;
- evoluir o tratamento de pessoas, clientes e funcionários;
- adicionar testes;
- estudar posteriormente a persistência com SQL e Java;
- relacionar o backend Java ao projeto integrador sem antecipar etapas.