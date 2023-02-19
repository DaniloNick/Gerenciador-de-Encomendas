package application;

import entities.Cartoes;
import entities.Pacote;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scMenu = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Pacote objPacote = new Pacote();
        Cartoes objCartao = new Cartoes();

        int menu;

        do {
            System.out.println("");
            System.out.println("Gerenciamento de Volumes");
            System.out.println("\n1- Cadastrar volume \n2- Buscar itens \n3- Registrar Entrega \n4- Relatorios \n0- Sair");
            menu = scMenu.nextInt();


            switch (menu) {
                case 1:
                    System.out.println("Cadastrar Pacote ou Cartao? \n[1].Pacote \n[2].Cartao \n[0].Voltar");
                    char resp = sc.next().charAt(0);
                    if (resp == '1') {
                        objPacote.cadastrarEncomenda();
                    } else if (resp == '2') {
                        objCartao.cadastrarEncomenda();
                    }else if (resp == '0') {
                        break;
                    } else {
                        System.out.println("opcao invalida!");
                    }
                    break;

                case 2:
                    System.out.println("Buscar Pacote ou Cartao? \n[1].Pacote \n[2].Cartao \n[0].Voltar");
                    resp = sc.next().charAt(0);
                    if (resp == '1') {
                        objPacote.buscarEncomenda();
                    } else if (resp == '2') {
                        objCartao.buscarEncomenda();
                    } else if (resp == '0') {
                        break;
                    }else {
                        System.out.println("opcao invalida!");
                    }

                    break;

                case 3:
                    System.out.println("Entregar Pacote ou Cartao? \n[1].Pacote \n[2].Cartao \n[0].Voltar");
                    resp = sc.next().charAt(0);
                    if (resp == '1') {
                        objPacote.entregarEncomenda();
                    } else if (resp == '2') {
                        objCartao.entregarEncomenda();
                    } else if (resp == '0') {
                        break;
                    }else {
                        System.out.println("opcao invalida!");
                    }
                    break;

                case 4:
                    System.out.println("Gerar qual relatorio ? \n[1].Pacotes \n[2].Cartoes \n[0].Voltar");
                    resp = sc.next().charAt(0);
                    if (resp == '1') {
                        objPacote.relatorio();
                    } else if (resp == '2') {
                        objCartao.relatorio();
                    }else if (resp == '0') {
                        break;
                    } else {
                        System.out.println("opcao invalida!");
                    }
                    break;

                default:
                    System.out.println("Programa Finalizado.");
                    break;
            }
        }
        while (menu != 0);
        scMenu.close();
        sc.close();
    }
}

