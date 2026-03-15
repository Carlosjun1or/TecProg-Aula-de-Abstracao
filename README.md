# 📚 Atividade — Abstração Teórica (POO)

Atividade prática de **Programação Orientada a Objetos** em Java, baseada na aula de **Abstração Teórica**.

---

## 📋 Descrição da Atividade

Criação de classes baseadas na atividade anterior de abstração, instanciando **2 objetos de cada entidade** na classe principal e imprimindo **1 atributo e 1 método** de cada uma.

O objetivo da atividade é aplicar conceitos de **abstração em POO**, representando entidades do mundo real através de **classes, atributos e métodos**, simulando comportamentos através de mensagens no console.

---

# 🧩 Classes Criadas

## 🛒 Produto

| Atributo | Tipo |
|---|---|
| `nmProduto` | `String` |
| `idProduto` | `int` |
| `valorProduto` | `double` |
| `qtEstoque` | `int` |
| `categoriaProduto` | `String` |

**Métodos:**  
`venderProduto()`  
`excluirProduto()`  
`consultarProduto()`

---

## 🎓 Curso

| Atributo | Tipo |
|---|---|
| `nmCurso` | `String` |
| `idCurso` | `int` |
| `nmProfessor` | `String` |
| `hrCurso` | `LocalTime` |
| `materiaCurso` | `String` |

**Métodos:**  
`acessarCurso()`  
`lecionarCurso()`  
`atualizarCurso()`

---

## 📱 RedeSocial

| Atributo | Tipo |
|---|---|
| `nmRede` | `String` |
| `idRedeSocial` | `int` |
| `qtUsuarios` | `int` |
| `algoritmo` | `String` |
| `tipoConteudo` | `String` |

**Métodos:**  
`atualizarAlgoritmo()`  
`enviarMensagem()`  
`criarPerfil()`

---

## 🏦 ContaBancaria

| Atributo | Tipo |
|---|---|
| `numeroConta` | `int` |
| `numeroAgencia` | `int` |
| `saldo` | `double` |
| `tipoConta` | `String` |
| `nomeCliente` | `String` |

**Métodos:**  
`consultarSaldo()`  
`transferir()`  
`depositar()`

---

## 📁 Arquivo

| Atributo | Tipo |
|---|---|
| `nomeArquivo` | `String` |
| `tipoArquivo` | `String` |
| `tamanho` | `double` |
| `descricao` | `String` |
| `proprietario` | `String` |

**Métodos:**  
`visualizar()`  
`editar()`  
`compartilhar()`

---

## 📖 Aula

| Atributo | Tipo |
|---|---|
| `nomeAula` | `String` |
| `tipo` | `String` |
| `material` | `String` |
| `data` | `LocalDate` |
| `professor` | `String` |

**Métodos:**  
`lecionarAula()`  
`atualizarConteudo()`  
`registrarPresenca()`

---

## 📝 Avaliação

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `data` | `LocalDate` |
| `local` | `String` |
| `notaMaxima` | `double` |
| `disciplina` | `String` |

**Métodos:**  
`aplicar()`  
`corrigir()`  
`divulgarResultado()`

---

# 👥 Colaboradores

| Nome |
|---|
| Carolina Ribeiro |
| Carlos Roberto |

---

# 📖 Conceitos Aplicados

- Abstração
- Programação Orientada a Objetos (POO)
- Classes e Objetos
- Atributos e Métodos
- Instanciação de Objetos
- Estruturas de controle (`switch` e `loop`)
- Manipulação de datas e horários (`LocalDate` e `LocalTime`)
- Impressão de informações no console