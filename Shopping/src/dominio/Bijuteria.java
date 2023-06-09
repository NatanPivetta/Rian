package dominio;

public class Bijuteria extends Loja{
    private double metaVendas;

    

    public Bijuteria (String nome, int qntd, double salBase, Endereco end, Data fund, double meta, int max) {
        super(nome, qntd, salBase, end, fund, max);
        this.metaVendas = meta;
    }

    public Bijuteria (String nome, int qntd, double salBase, Endereco end, Data fund, double meta) {
        super(nome, qntd, salBase, end, fund);
        this.metaVendas = meta;
        }
    
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString(){
        return "\nNome da Loja: "+ this.getNome() +
        "\nQuantidade de Funcionários:" + this.getQuantidadeFuncionarios() +
        "\nSalario Base: R$ " + this.getSalarioBaseFuncionario() +
        "\nEndereco: " + this.getEndereco().toString() +
        "\nData de fundacao: " + this.getDataFundacao().toString() +
        "\nMeta de vendas: R$" + this.getMetaVendas();
    }
    
}
