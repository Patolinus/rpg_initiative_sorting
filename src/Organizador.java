import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Organizador {
    private List<Personagem> iniciativas;
    public Organizador() {
        this.iniciativas = new ArrayList<>();
    }

    public void adicionarPersonagem() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome do personagem:");
        String nomePersonagem = leitor.nextLine();
        System.out.println("Valor TOTAL da Iniciativa (valor do Dado + Iniciativa da Ficha):");
        int valorIniciativa = leitor.nextInt();

        Personagem novoPersonagem = new Personagem(nomePersonagem, valorIniciativa);
        this.iniciativas.add(novoPersonagem);

    }

    public void excluirPersonagem() {
        System.out.println("-|-|-|-|-Qual Personagem você deseja excluir?-|-|-|-|-");
        for (int i = 0; i < this.iniciativas.size(); i++) {
            System.out.println((i + 1) + " - " + this.iniciativas.get(i).nomePersonagem + " " + this.iniciativas.get(i).valorIniciativa);
        }
        System.out.println("0 - Voltar");
        System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-");
        Scanner leitor = new Scanner(System.in);
        int posicao = leitor.nextInt();
        if (posicao == 0) {
            return;
        } else {
            this.iniciativas.remove(posicao - 1);
        }

    }

    public void editarIniciativa() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-|-|-|-|-|-Qual Iniciativa Você deseja editar?-|-|-|-|-|-");
        for (int i = 0; i < this.iniciativas.size(); i++) {
            System.out.println((i + 1) + " - " + this.iniciativas.get(i).nomePersonagem + " " + this.iniciativas.get(i).valorIniciativa);
        }
        System.out.println("0 - Voltar");
        System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-");
        int posicao = leitor.nextInt();
        if (posicao == 0) {
            return;
        } else {
            this.iniciativas.get(posicao - 1);
        }
        Personagem personagemParaEditar = this.iniciativas.get(posicao - 1);
        System.out.println("Digite novo valor da iniciativa");
        int novaIniciativa = leitor.nextInt();
        personagemParaEditar.valorIniciativa = novaIniciativa;

    }

    public void mostrarListaDeIniciativas() {
        // 1. Crie uma cópia segura da sua lista de iniciativas.
        List<Personagem> copiaDaLista = new ArrayList<>(this.iniciativas);

        // 2. Faça a ordenação na lista original ou na cópia.
        //    Para este caso, vamos ordenar a cópia para exibição.
        Collections.sort(copiaDaLista, Comparator.comparingInt(Personagem::getValorIniciativa).reversed());

        // 3. Percorra a CÓPIA da lista, nunca a original que pode ser modificada.
        System.out.println("-|-|-|-|-|-|-|-|-| Ordem de Turno |-|-|-|-|-|-|-|-|-|-");
        for (Personagem personagem : copiaDaLista) {
            System.out.println(personagem.nomePersonagem + "  " + personagem.getValorIniciativa());
        }
        System.out.println("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-");
    }

}

