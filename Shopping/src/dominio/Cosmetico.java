package dominio;

public class Cosmetico extends Loja{
    private double taxaComercializacao;


    public Cosmetico(String nome, int qntd, double salBase, Endereco end, Data fund, double txC, int max){
        super(nome, qntd, end, fund, max);
        this.taxaComercializacao = txC;
    }

    public Cosmetico(String nome, int qntd, double salBase, Endereco end, Data fund, double txC){
        super(nome, qntd, end, fund);
        this.taxaComercializacao = txC;
        
    }
    
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }    

    @Override
    public String toString(){
        return "\nNome da Loja: "+ this.getNome() +
        "\nQuantidade de Funcionários:" + this.getQuantidadeFuncionarios() +
        "\nSalario Base: R$ " + this.getSalarioBaseFuncionario() +
        "\nEndereco: " + this.getEndereco().toString() +
        "\nData de fundacao: " + this.getDataFundacao().toString() +
        "\nTaxa Comercialização: " + this.getTaxaComercializacao() + "%";
    }


}
