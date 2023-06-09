package dominio;

public class Vestuario extends Loja{
    boolean produtosImportados;

    

    public Vestuario(String nome, int qntd, double salBase, Endereco endereco, Data fund, boolean imp, int max){
        super(nome, qntd, salBase, endereco, fund, max);
        this.produtosImportados = imp;
    }

    public Vestuario(String nome, int qntd, double salBase, Endereco endereco, Data fund, boolean imp){
        super(nome, qntd, salBase, endereco, fund);
        this.produtosImportados = imp;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
}
