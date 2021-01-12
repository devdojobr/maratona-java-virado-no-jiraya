package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public void imprime(){
        Pessoa p = new Pessoa();
        p.nome = "sasa";
    }
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
