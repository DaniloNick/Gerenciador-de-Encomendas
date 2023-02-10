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
                    System.out.println("Cadastrar Pacote ou Cartao? \n[P].Pacote \n[C].Cartao");
                    char resp = sc.next().charAt(0);
                    if(resp == 'p'){
                        objPacote.cadastrarEncomenda();
                    }else{
                        objCartao.cadastrarEncomenda();
                    }
                    break;

                case 2:
                   System.out.println("Buscar Pacote ou Cartao? \n[P].Pacote \n[C].Cartao");
                    resp = sc.next().charAt(0);
                    if(resp == 'p'){
                        objPacote.buscarEncomenda();
                    }else{
                        objCartao.buscarEncomenda();
                    }

                    break;

                case 3:
                    System.out.println("Entregar Pacote ou Cartao? \n[P].Pacote \n[C].Cartao");
                    resp = sc.next().charAt(0);
                    if(resp == 'p'){
                        objPacote.entregarEncomenda();
                    }else {
                        objCartao.entregarEncomenda();
                    }
                    break;

                case 4:
                    System.out.println("Gerar qual relatorio ? \n[P].Pacotes \n[C].Cartoes");
                    resp = sc.next().charAt(0);
                    if(resp == 'p'){
                        objPacote.relatorio();
                    }else {
                        objCartao.relatorio();
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

