package dominio;


public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario; 
    private Endereco endereco;
    private Data fundacao;
    private int max = 0;
    private Produto[] estoqueProdutos = new Produto[max]; 
    

    public Loja (String nome, int qntd, double salBase) {
        this.nome = nome;
        this.quantidadeFuncionarios = qntd;
        this.salarioBaseFuncionario = salBase;
        
    }


    public Loja (String nome, int qntd) {
        this.nome = nome;
        this.quantidadeFuncionarios = qntd;
        this.salarioBaseFuncionario = -1;
        
    }

    public Loja (String nome, int qntd, double salBase, Endereco end, Data fund) {
        this.nome = nome;
        this.quantidadeFuncionarios = qntd;
        this.salarioBaseFuncionario = salBase;
        this.endereco = end;
        this.fundacao = fund;
    }

    public Loja (String nome, int qntd, Endereco end, Data fund){
        this.nome = nome;
        this.quantidadeFuncionarios = qntd;
        this.salarioBaseFuncionario = -1;
        this.endereco = end;
        this.fundacao = fund;
    }


    public Loja (String nome, int qntd, double salBase, Endereco end, Data fund, int max) {
        this.nome = nome;
        this.quantidadeFuncionarios = qntd;
        this.salarioBaseFuncionario = salBase;
        this.endereco = end;
        this.fundacao = fund;
        this.max = max;
    }

    public Loja (String nome, int qntd, Endereco end, Data fund, int max ){
        this.nome = nome;
        this.quantidadeFuncionarios = qntd;
        this.salarioBaseFuncionario = -1;
        this.endereco = end;
        this.fundacao = fund;
        this.max = max;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeDaLoja){
        this.nome = nomeDaLoja;
    }

    public int getQuantidadeFuncionarios (){
        return this.quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios (int qntd){
        this.quantidadeFuncionarios = qntd;
    }

    public double getSalarioBaseFuncionario (){
        return this.salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario (double salBase){
        this.salarioBaseFuncionario = salBase;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return fundacao;
    }

    public void setDataFundacao(Data fundacao) {
        this.fundacao = fundacao;
    }
    
    public Produto[] getEstoqueProdutos() {
        
        return estoqueProdutos;
    }

    public void imprimeProdutos(){
        System.out.println(estoqueProdutos);
    }

    public boolean insereProduto(Produto prod){
        boolean b = false;
        if(estoqueProdutos.length < max){
            for(int i=0;i<estoqueProdutos.length; i++){
                estoqueProdutos[i] = prod;
                b = true;
            }
            
        }else{
            System.out.println("\nEstoque Lotado");
            b = false;
        }
        
        
        return b;
    }

    public boolean removeProduto(String prod){
        boolean b = false;
        
            for(int i=0; i<estoqueProdutos.length; i++){
                if(estoqueProdutos[i].getNome() == prod){
                    estoqueProdutos[i] = null;
                }else{
                System.out.println("Produto não encontrado");
                b = false;
                }
            }
        return b;
    }
        
    

    
    

    public double gastosComSalario(){
        if(this.salarioBaseFuncionario != -1){
            return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
        }
        else{
            return -1;
        }
        
    }

    public char tamanhoDaLoja(){
        char tam = 'P';
        if(this.quantidadeFuncionarios > 31){
           tam = 'G';
        }else{
           if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30) {
                tam = 'M';
           }else{
            tam = 'P';
           }
        }
        return tam;
    }

    @Override
    public String toString(){
        return "\nNome da Loja: "+ this.nome +
        "\nQuantidade de Funcionários:" + this.quantidadeFuncionarios +
        "\nSalario Base: R$" + this.salarioBaseFuncionario +
        "\nEndereco: " + this.getEndereco().toString() +
        "\nData de fundacao: " + this.getDataFundacao().toString();
    }

    

}
