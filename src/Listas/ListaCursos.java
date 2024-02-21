package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCursos {
    private static List<String> inicializacaoLista() {
        List<String> listaCursos = new ArrayList<>();

        listaCursos.add("Front-End");
        listaCursos.add("Back-End");
        listaCursos.add("Ciências de Dados");
        listaCursos.add("UI e UX Design");

        return listaCursos;
    }

    private static void verLista(List<String> listaCursos) {
        for (int i = 0; i < listaCursos.size(); i++) {
            String item = listaCursos.get(i);
            System.out.println(i + " - " + item);
        }
    }

    private static void adicionarCursoLista(Scanner entrada, List<String> listaCursos) {
        System.out.print("Informe o curso: ");
        String item = entrada.next();
        listaCursos.add(item);
    }

    private static void removerCursoLista(Scanner entrada, List<String> listaCursos) {
        System.out.print("Informe o indice: ");
        int indice = entrada.nextInt();

        if (listaCursos.size() <= indice) {
            System.out.println("O curso NÃO existe!");
        } else {
            listaCursos.remove(indice);
        }
    }



    private static void marcarCursoConcluido(Scanner entrada, List<String> listaCursos, List<String> listaCursosConcluidos) {
        System.out.print("Informe o indice: ");
        int indice = entrada.nextInt();

        if (listaCursos.size() <= indice) {
            System.out.println("O curso NÃO existe!");
        } else {
            String item = listaCursos.remove(indice);
            listaCursosConcluidos.add(item);
            System.out.println("Curso concluído: " + indice + " - " + item + "\n");

        }
    }


    private static void verListaConcluidos(List<String> listaCursosConcluidos) {
        System.out.println("Cursos concluídos:");
        for (int i = 0; i < listaCursosConcluidos.size(); i++) {
            String item = listaCursosConcluidos.get(i);
            System.out.println(i + " - " + item);
        }
    }



    private static void menu(Scanner entrada, List<String> listaCursos, List<String> listaCursosConcluidos) {
        System.out.println("-----------------------------------------");
        System.out.println("|                  MENU                 |");
        System.out.println("-----------------------------------------");
        System.out.println("| 1 - Ver a lista dos cursos            |");
        System.out.println("| 2 - Adicionar curso                   |");
        System.out.println("| 3 - Remover curso                     |");
        System.out.println("| 4 - Marcar Concluído                  |");
        System.out.println("| 5 - Ver a lista dos cursos concluídos |");
        System.out.println("-----------------------------------------");
        System.out.println("| 0 - Sair do sistema                   |");
        System.out.println("-----------------------------------------");
        System.out.print  ("Digite o número da opção desejada: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                verLista(listaCursos);
                break;
            case 2:
                adicionarCursoLista(entrada, listaCursos);
                verLista(listaCursos);
                break;
            case 3:
                removerCursoLista(entrada, listaCursos);
                verLista(listaCursos);
                break;
            case 4:
                marcarCursoConcluido(entrada, listaCursos, listaCursosConcluidos);
                verLista(listaCursos);
                break;
            case 5:
                verListaConcluidos(listaCursosConcluidos);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("\n\n\n");

        menu(entrada, listaCursos, listaCursosConcluidos);
        System.out.println(opcao);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> listaCursos = inicializacaoLista();

        List<String> listaCursosConcluidos = new ArrayList<>();


        System.out.println("Bem vindo à lista de cursos");

        menu(entrada, listaCursos, listaCursosConcluidos);

    }

}
