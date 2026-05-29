# Manutenção de Software e Engenharia Reversa[cite: 2]

Este repositório contém a entrega da atividade prática da disciplina de Engenharia de Software II[cite: 1]. A proposta do projeto é simular uma situação altamente comum no mercado de trabalho: atuar como mantenedor de um sistema legado, onde é necessário compreender regras de negócio implícitas, diagnosticar defeitos e aplicar correções seguras validadas por testes.

## Contexto Acadêmico
* **Curso:** Bacharelado em Ciência da Computação — IFPA Campus Tucuruí
* **Professor:** Prof. Douglas Bechara
* **Atividade:** Manutenção de Software e Engenharia Reversa[cite: 2]

## O Desafio (Chamado 1)
Nesta simulação, atuei na resolução do **Chamado 1 — Correção da regra de aprovação**.

**O Defeito:** O método responsável por avaliar a situação acadêmica dos alunos (`verificarSituacao`) apresentava uma falha de lógica nos casos limite. Um aluno com média exatamente 7 e frequência exatamente 75 não recebia o status de aprovação. O bug ocorria devido ao uso indevido de operadores relacionais estritos (`>`), que excluíam as notas cravadas no limite mínimo.

## A Solução e Manutenção
Para resolver o problema, foi aplicada uma **Manutenção Corretiva**, alterando o menor trecho de código possível para isolar o impacto. A correção substituiu os operadores de `>` para `>=` nas validações do bloco de aprovação.

Para garantir que a correção não introduzisse novos problemas (efeitos colaterais) nas regras de reprovação ou prova final, utilizei testes de regressão automatizados com JUnit. A suíte de testes comprova que a regra atende a todos os cenários possíveis de notas e faltas.

## Tecnologias Utilizadas
* **Linguagem:** Java
* **Testes:** JUnit 4/5
* **Gerenciamento de Dependências:** Maven
* **IDEs:** IntelliJ IDEA / Visual Studio Code
