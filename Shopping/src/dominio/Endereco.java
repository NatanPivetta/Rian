package dominio;

public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    public Endereco(String rua, String cid, String est, String pais, String cep, String num, String comp) {
        this.nomeDaRua = rua;
        this.cidade = cid;
        this.estado = est;
        this.pais = pais;
        this.cep = cep;
        this.numero = num;
        this.complemento = comp;
    }



    public void setNomeDaRua(String rua){
        this.nomeDaRua = rua;
    }

    public String getNomeDaRua(){
        return this.nomeDaRua;
    }


    public void setCidade(String cid){
        this.cidade = cid;
    }

    public String getCidade(){
        return this.cidade;
    }
    public void setEstado(String est){
        this.estado = est;
    }
    public String getEstado(){
        return this.estado;
    }

    public void setPais(String x){
        this.pais = x;
    }
    public String getPais(){
        return this.pais;
    }

    public void setCep(String x){
        this.cep = x;
    }
    public String getCep(){
        return this.cep;
    }

    public void setNumero(String x){
        this.numero = x;
    }
    public String getNumero(){
        return this.numero;
    }


    public void setComplemento(String x){
        this.complemento = x;
    }
    public String getComplemento(){
        return this.complemento;
    }

    @Override
    public String toString(){
        return " CEP " + this.cep+   this.nomeDaRua + "," + this.numero + "," + this.complemento + "," + this.cidade + "-" + this.estado + "," + this.pais;
    }


}

