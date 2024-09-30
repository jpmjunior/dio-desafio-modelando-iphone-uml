import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("INICIANDO IPHONE!");

        while (true) {
            exibirMenuPrincipal();
        }

    }

    private static void exibirMenuNavegadorInternet() {

        System.out.println("""
                   MENU NAVEGADOR DE INTERNET!
                   Selecione uma função:
                   1 - Exibir página
                   2 - Adicionar nova aba
                   3 - Atualizar página

                   """);

        int opcao = scanner.nextInt();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        switch (opcao) {
            case 1:
                navegadorInternet.exibirPagina();
                break;
            case 2:
                navegadorInternet.adicionarNovaAba();
                break;
            case 3:
                navegadorInternet.atualizarPagina();
                break;
            default:
                System.out.println("Opção incorreta, tente novamente.");
                exibirMenuPrincipal();
        }

    }

    private static void exibirMenuAparelhoTelefonico() {

        System.out.println("""
                   MENU APARELHO TELEFONICO!
                   Selecione uma função:
                   1 - Ligar
                   2 - Atender
                   3 - Iniciar Correio de Voz

                   """);

        int opcao = scanner.nextInt();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        switch (opcao) {
            case 1:
                aparelhoTelefonico.ligar();
                break;
            case 2:
                aparelhoTelefonico.atender();
                break;
            case 3:
                aparelhoTelefonico.iniciarCorreioVoz();
                break;
            default:
                System.out.println("Opção incorreta, tente novamente.");
                exibirMenuPrincipal();
        }

    }

    private static void exibirMenuReprodutorMusical() {

        System.out.println("""
                   MENU REPRODUTOR MUSICAL!
                   Selecione uma função:
                   1 - Tocar
                   2 - Pausar
                   3 - Selecionar Musica

                   """);

        int opcao = scanner.nextInt();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        switch (opcao) {
            case 1:
                reprodutorMusical.tocar();
                break;
            case 2:
                reprodutorMusical.pausar();
                break;
            case 3:
                reprodutorMusical.selecionarMusica();
                break;
            default:
                System.out.println("Opção incorreta, tente novamente.");
                exibirMenuPrincipal();
        }

    }

    private static void exibirMenuPrincipal() {

        System.out.println("""
                    MENU PRINCIPAL!
                    Selecione um aplicativo:
                    1 - Reprodutor Musical
                    2 - Aparelho Telefônico
                    3 - Navegador de Internet
                    0 - Sair
                    """);

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 0:
                System.exit(0);
            case 1:
                exibirMenuReprodutorMusical();
                break;
            case 2:
                exibirMenuAparelhoTelefonico();
                break;
            case 3:
                exibirMenuNavegadorInternet();
                break;
            default:
                System.out.println("Opção incorreta, tente novamente.");
        }

    }

}