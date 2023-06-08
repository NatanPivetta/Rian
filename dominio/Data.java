package dominio;

public class Data {
    private int dia;
    private int mes;
    private int ano;

   

    public Data(int dia, int mes, int y){
        // ano bissexto divisivel por 4 e por 400 nao divisivel por 100;
        if(dia == 29 && mes == 2){
            if(this.verificaAnoBissexto()){
                this.dia = dia;
                this.mes = mes; 
                this.ano = y;
            }else{
                System.out.println("Data invalida");
            }
        }
        if(dia == 31){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                this.dia = dia;
                this.mes = mes; 
                this.ano = y;
            }else{
                System.out.println("Data invalida");
            }
        }
                this.dia = dia;
                this.mes = mes; 
                this.ano = y;


    }

    public boolean verificaAnoBissexto(){
        int ano = this.ano;
        boolean bis = false;
        if(ano % 4 == 0 || ano % 400 == 0 && ano % 100 != 0){
            bis = true;
        }else{
            this.ano = 2000;
            this.mes = 1;
            this.dia = 1;

        }
        return bis;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }



}
