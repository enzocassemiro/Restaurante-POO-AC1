public class ProgramaPrincipal {
    public static void main(String[] args) {
        //Variaveis
        int codProduto;
        int qtdProduto;
        int tipoPagamento;


        //Objetos
        Mesa mesa1 = new Mesa();
        Mesa mesa2 = new Mesa();

        //Executando metodos
        System.out.println(mesa1.imprimirMesa()+"\n");

        System.out.println(mesa2.imprimirMesa()+"\n");


        //Abrindo mesa1, efetuando pedidos e fechando conta
        mesa1.setNumeroMesa(1);
        mesa1.setQtdPessoas(4);
        mesa1.efetuaPedido(1,3);
        mesa1.efetuaPedido(2,4);
        mesa1.efetuaPedido(3,4);
        mesa1.fecharConta(1);

        //Abrindo mesa2, efetuando pedidos e fechando conta
        mesa2.setNumeroMesa(2);
        mesa2.setQtdPessoas(8);
        mesa2.efetuaPedido(1,10);
        mesa2.efetuaPedido(2,7);
        mesa2.efetuaPedido(3,10);
        mesa2.fecharConta(2);



        System.out.println(mesa1.imprimirMesa());
        System.out.println(mesa1.divisaoConta()+"\n");
        System.out.println(mesa2.imprimirMesa());
        System.out.println(mesa2.divisaoConta()+"\n");

        if (mesa1.getTotalConta() > mesa2.getTotalConta()){
            System.out.println("Mesa 1 tem o maior valor gasto por pessoa:");
        }
        else{
            System.out.println("Mesa 2 tem o maior valor gasto por pessoa:");
        }






    }
}
