package DesafioPoo;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;


    public static  void main(String[] args){
         scanner = new Scanner(System.in);
        Iphone celular = new Iphone();

        while (true){
            System.out.println("Seja bem vindo ao menu do Iphone");
            System.out.println("1- Tocar música");
            System.out.println("2- Pausar música");
            System.out.println("3- Selecionar música");
            System.out.println("4- Ligar");
            System.out.println("5- Atender");
            System.out.println("6- Correio de Voz");
            System.out.println("7- Exibir Página do Navegador");
            System.out.println("8- Abrir nova Aba do Navegador");
            System.out.println("9- Atualizar Página do Navegador");
            System.out.println("10- Encerrar ");
            var opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> celular.tocarMusica();
                case 2 -> celular.pausarMusica();
                case 3 -> {
                    System.out.println("Digite o nome da musica");
                    scanner.nextLine(); // limpa o \n que sobrou do nextInt anterior
                    String musica = scanner.nextLine(); // para ler frases
                    celular.selecionarMusica(musica);
                }
                case 4 -> celular.ligar();
                case 5 -> celular.atender();
                case 6 -> celular.correioDeVoz();
                case 7 -> celular.exibirPagina();
                case 8 -> celular.adicionarNovaAba();
                case 9 -> celular.atualizarPagina();
                case 10 -> {
                    System.out.println("Encerrando programa");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Selecione uma opção válida");

            }

        }
    }
}
