package dominio;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao (String nome, int qntd, double salBase, Endereco end, Data fund, Data dataAlvara, int max) {
        super(nome, qntd, salBase, end, fund, max);
        this.dataAlvara = dataAlvara;
    }


    public Alimentacao (String nome, int qntd, double salBase, Endereco end, Data fund, Data dataAlvara) {
        super(nome, qntd, salBase, end, fund);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString(){
        return "\nNome da Loja: "+ this.getNome() +
        "\nQuantidade de Funcionários:" + this.getQuantidadeFuncionarios() +
        "\nSalario Base: " + this.getSalarioBaseFuncionario() +
        "\nEndereco: " + this.getEndereco().toString() +
        "\nData de fundacao: " + this.getDataFundacao().toString() +
        "\nData Alvará: " + this.getDataAlvara().toString();
    }


}
