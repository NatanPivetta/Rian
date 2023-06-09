package dominio;


public class Shopping {
    private String nome;
    private Endereco endereco;
    private int max;
    private Loja[] lojas = new Loja[max];


    public Shopping(String nome, Endereco end, int max){
        this.nome = nome; 
        this.endereco = end;
        this.max = max;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean insereLoja(Loja loja){
        int index = -1;
        boolean b = false; 
        for(int i = 0; i<=lojas.length; i++){
            
            if(lojas[i] !=null){
                index++;
            }
            lojas[index] = loja;
            b = true;
        }
        
        
        return b;
        
    }

    public boolean removeLoja(String loja){
        boolean b = false;
        for(int i = 0; i<=lojas.length; i++){
            if(lojas[i].getNome().equals(loja)){
                lojas[i] = null;
                b = true;
            }else{
                b = false;
            }
        }
        return b;
    }

    public int quantidadeLojasPorTipo(String tipo){
        int i;
        int qntd=0;
        int biju=0;
        int info=0;
        int alim=0;
        int cosm=0;
        for(i=0; i<lojas.length; i++){
            if(lojas[i] instanceof Bijuteria ){
                biju++;
            }
            if(lojas[i] instanceof Informatica){
                info++;
            }
            if(lojas[i] instanceof Alimentacao){
                alim++;
            }
            if(lojas[i] instanceof Cosmetico){
                cosm++;
            }

            if(tipo == "Cosmetico"){
                qntd = cosm;
            }
            if(tipo == "Bijuteria"){
                qntd = biju;
            }
            if(tipo == "Informática"){
                qntd = info;
            }
            if(tipo == "Alimentação"){
                qntd = alim;
            }
            
        }
        return qntd;
    }

    /*public Loja lojaSeguroMaisCaro(){
        Informatica loja = null;
        
        int i=0;
        for(i=0; i<=lojas.length; i++){
            if(lojas[i] instanceof Informatica){
                loja.getSeguroEletronicos();        
            }
        }
        return loja;
     } */



}
