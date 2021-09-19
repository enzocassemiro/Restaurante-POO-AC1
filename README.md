<h1 align="center">Restaurante-POO-AC1</h1>
<p align="center">Projeto para disciplina de POO</p>

## Descrição detalhada do projeto


### O Restaurante “Prato Feito” deseja automatizar o processo de seus pedidos das  mesas e fechamento  de  contas. Para  tanto,  contratou  você  para desenvolver   um   sistema   que   gerencie   este   processo. 

* Uma mesa é representada por: 
  * um  número da mesa;
  * quantidade  de  pessoas;
  * total  da  conta;
##### Sabe-se que, inicialmente, o total da conta deve ser zero.

### Para efetivar os pedidos  de  cada  mesa  alguns  cálculos  são  necessários.  Por  isso,  escreva uma classe em Java que represente a descrição acima e realize os seguintes cálculos:a) Efetuar o pedido de produtos (vide tabela abaixo), informando o código e quantidade desejada. Os produtos disponíveis são:

| Código do Produto |  Produto  | Valor (R$) |
| :---:| :---: | :---: |
| 1 |  Refrigerante | 2.00|
| 2 |  Cachorro Quente | 2.00|
| 3 |  Batata Frita | 4.00|

### Fechar a conta de uma mesa de acordo com o total da conta e o tipo de pagamento (vide  tabela  abaixo).  Observe  que  de  acordo  com  o  tipo  de pagamento o cliente poderá ter ou não desconto. Os tipos de pagamento são:

| Tipo de Pagamento |  Opção  | % desconto |
| :---:| :---: | :---: |
| 1 |  Dinheiro | 10% |
| 2 |  Cheque | 0 |
| 3 |  Cartão | 5% |

* Calcular  o  valor da  conta  por  pessoa  que  deverá  retornar  o  valor  a  ser pago por cada pessoa presente na mesa
* Imprimir os dados da mesa (número, quantidade de pessoas e total da conta).
### Finalmente, implemente a classe Programa Principal (que   contenha  o método main) com as seguintes ações:
* Criar 2 mesas; 
* Imprimir todas as mesas;
* Efetuar 2 pedidos para cada mesa; 
* Calcular e imprimir o valor final da conta e por pessoa; 
* Imprimir a mesa com o maior valor gasto por pessoa;

