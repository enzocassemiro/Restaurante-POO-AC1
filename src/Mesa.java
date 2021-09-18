public class Mesa {
    //Variaveis
    private int numeroMesa;
    private int qtdPessoas;
    private double totalConta;

    //Construtor
    public Mesa() {
        numeroMesa = 0;
        qtdPessoas = 0;
        totalConta = 0;
    }

    //Getter and setter
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public double getTotalConta() {
        return totalConta;
    }

    public void setTotalConta(double totalConta) {
        this.totalConta = totalConta;
    }

    //Metodos
    public String imprimirMesa() {
        return("Numero Mesa:" + numeroMesa + "\nQuantidade Pessoas:" + qtdPessoas + "\nTotal Conta:" + totalConta);
    }

    public double efetuaPedido(int codProduto, int qtdProduto) {
        if (codProduto == 1) {
            totalConta = 2.00 * qtdProduto;
        }
        else if (codProduto == 2) {
            totalConta = 5.00 * qtdProduto;
        }
        else if (codProduto == 3) {
            totalConta = 4.00 * qtdProduto;
        }
        return(totalConta);
    }

    public double fecharConta(int tipoPagamento) {
        if (tipoPagamento == 1) {
            totalConta -= (totalConta*0.10);
        }
        else if (tipoPagamento == 2) {
        }
        else if (tipoPagamento == 3) {
            totalConta -= (totalConta*0.05);
        }
        return (totalConta);
    }

    public String divisaoConta() {
        totalConta = totalConta / qtdPessoas;
        return ("Total conta rateada:" + totalConta);
    }
}
