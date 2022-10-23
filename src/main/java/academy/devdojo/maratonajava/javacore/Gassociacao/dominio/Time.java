package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }

    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
