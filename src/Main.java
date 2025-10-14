import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Organizador de Turnos(Iniciativas)!");

        Organizador organizador = new Organizador();
        Scanner leitor = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("1. Adicionar personagem e iniciativa. \n2. Excluir personagem e sua iniciativa. \n3. Editar iniciativa. \n4. Listar ordem de turnos. \n5. Sair.");
            int opcaoMenu = leitor.nextInt();

            switch (opcaoMenu) {
                case 1: {
                    organizador.adicionarPersonagem();
                    break;
                }
                case 2: {
                    organizador.excluirPersonagem();
                    break;
                }
                case 3: {
                    organizador.editarIniciativa();
                    break;
                }
                case 4: {
                    organizador.mostrarListaDeIniciativas();
                    break;
                }
                case 5: {
                    menu = false;
                }
            }
        }
    }
}
