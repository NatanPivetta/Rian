package dominio;

public class Informatica extends Loja {
    private double seguroEletronicos;

    

    public Informatica (String nome, int qntd, double salBase, Endereco end, Data fund, double seg, int max){
        super(nome, qntd, salBase, end, fund, max);
        this.seguroEletronicos = seg;
    }
    
    public Informatica (String nome, int qntd, double salBase, Endereco end, Data fund, double seg){
        super(nome, qntd, salBase, end, fund);
        this.seguroEletronicos = seg;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString(){
        return "\nNome da Loja: "+ this.getNome() +
        "\nQuantidade de Funcionários:" + this.getQuantidadeFuncionarios() +
        "\nSalario Base: R$ " + this.getSalarioBaseFuncionario() +
        "\nEndereco: " + this.getEndereco().toString() +
        "\nData de fundacao: " + this.getDataFundacao().toString() +
        "\nSeguro eletronicos: R$" + this.getSeguroEletronicos();
    }
}
