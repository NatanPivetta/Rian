package dominio;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario; 
    
    public Loja (String nome, int qntd, double salBase) {
        this.nome = nome;
        this.quantidadeFuncionarios = qntd;
        this.salarioBaseFuncionario = salBase;
    }

    public Loja (String nome, int qntd){
        this.nome = nome;
        this.quantidadeFuncionarios = qntd;
        this.salarioBaseFuncionario = -1;
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

    public String toString(){
        return ("Nome da Loja: " + " " + this.nome + " " + "Quantidade de Funcionários: " + " " + this.quantidadeFuncionarios);
    }

    

}
