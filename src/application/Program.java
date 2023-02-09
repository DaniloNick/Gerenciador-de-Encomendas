package application;

import entities.Encomenda;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Encomenda encomenda = new Encomenda();
        Encomenda obj = new Encomenda();

        Scanner scMenu = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int menu;

        do {
            System.out.println("");
            System.out.println("Gerenciamento de Volumes");
            System.out.println("\n1- Cadastrar volume \n2- Buscar itens \n3- Registrar Entrega \n4-Relatorios \n0- Sair");
            menu = scMenu.nextInt();


            switch (menu) {
                case 1:
                    encomenda.cadastraVolume();
                    break;

                case 2:

                    break;

                case 3:
                    break;

                case 4:
                    encomenda.exibirLista();
                    break;

                default:
                    System.out.println("Programa Finalizado.");
                    break;

            }
        }
        while (menu != 0);

        scMenu.close();
    }
}

