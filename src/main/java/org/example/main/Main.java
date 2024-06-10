package org.example.main;

import org.example.implementation.SupermaketArray;
import org.example.implementation.Supermarket;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private final static int SIZE = 3; //TAMANHO DA LISTA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Supermarket supermercado= new SupermaketArray(SIZE);
        int opcao;
        String listOpcao = """
                    \n Lista de Compras
                    1- Inserir
                    2- Listar
                    3- Remover
                    4- Sair
                    \nEscolha uma opção:\s
                    """;


        do {
            System.out.println(listOpcao);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = sc.next();
                    supermercado.add(item);
                    break;
                case 2:
                    supermercado.print();
                    break;
                case 3:
                    System.out.println("Remover as compras: ");
                    int index = sc.nextInt();
                    supermercado.delete(index);
                    supermercado.print();
                    break;
                case 4:
                    System.out.println("Sair do programa: ");
                    break;
                default:
                    System.out.println("Por favor escolha uma opção válida");
                    break;
            }
        } while (opcao != 4);
        sc.close();
    }
}