package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaProfes {
    private static List<String> inicializacaoLista() {
        List<String> listaProfes = new ArrayList<>();

        listaProfes.add("Ana");
        listaProfes.add("Luísa");
        listaProfes.add("Mariana");
        listaProfes.add("Vanessa");

        return listaProfes;
    }

    private static void verLista(List<String> listaProfes) {
        for (int i = 0; i < listaProfes.size(); i++) {
            String item = listaProfes.get(i);
            System.out.println(i + " - " + item);
        }
    }

    private static void adicionarProfeLista(Scanner entrada, List<String> listaProfes) {
        System.out.print("Informe o nome do Professor: ");
        String item = entrada.next();
        listaProfes.add(item);
    }

    private static void removerProfeLista(Scanner entrada, List<String> listaProfes) {
        System.out.print("Informe o indice: ");
        int indice = entrada.nextInt();

        if (listaProfes.size() <= indice) {
            System.out.println("Professor não encontrado!");
        } else {
            listaProfes.remove(indice);
        }
    }


    private static void menu(Scanner entrada, List<String> listaProfes) {
        System.out.println("--------------------------------------");
        System.out.println("|                 MENU               |");
        System.out.println("--------------------------------------");
        System.out.println("| 1 - Ver a lista dos professor      |");
        System.out.println("| 2 - Adicionar o professor          |");
        System.out.println("| 3 - Remover professor              |");
        System.out.println("--------------------------------------");
        System.out.println("| 0 - Sair do sistema                |");
        System.out.println("--------------------------------------");
        System.out.print  ("Digite o número da opção desejada: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                verLista(listaProfes);
                break;
            case 2:
                adicionarProfeLista(entrada, listaProfes);
                verLista(listaProfes);
                break;
            case 3:
                removerProfeLista(entrada, listaProfes);
                verLista(listaProfes);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("\n\n");

        menu(entrada, listaProfes);
        System.out.println(opcao);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> listaProfes = inicializacaoLista();

        System.out.println("Bem vindo à lista de professores");

        menu(entrada, listaProfes);


    }
}
