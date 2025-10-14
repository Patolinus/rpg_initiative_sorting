public class Personagem {

    public String nomePersonagem;
    public int valorIniciativa;

    public Personagem(String nomePersonagem, int valorIniciativa){
        this.nomePersonagem = nomePersonagem;
        this.valorIniciativa = valorIniciativa;
    }

    public int getValorIniciativa() {
        return this.valorIniciativa;
    }
}
