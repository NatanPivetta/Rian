package dominio;

public class Produto {
    private String nome;
    private double preco;
    private Data validade;

    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        
    }

    public Produto (String nome, double preco, Data valid){
        this.nome = nome;
        this.preco = preco;
        this.validade = valid;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public Data getDataValidade() {
        return validade;
    }

    public void setDataValidade(Data validade) {
        this.validade = validade;
    }

    public boolean estaVencido(Data d){
        boolean b = false;
        if(d.getAno() > this.validade.getAno()){
            b = true;
        }else{
            if(d.getMes() > this.validade.getMes()){
                b = true;
            }else{
                if(d.getDia() > this.validade.getDia()){
                    b = true;
                }
            }
        }
        return b;
    }

    
}
