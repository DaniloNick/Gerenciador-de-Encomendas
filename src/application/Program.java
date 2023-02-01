package application;

import entities.Correspondencia;
import entities.Encomenda;
import entities.Pacote;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        Scanner sc = new Scanner(System.in);

        int menu = 0;
        char chresp;

        do {
            System.out.println("");
            System.out.println("Gerenciamento de Encomendas");
            System.out.println("1- Cadastrar Encomenda 2- Buscar Encomenda");
            System.out.println("3- Registrar Entrega 0- Sair");

            menu = sc.nextInt();


            switch (menu) {
                case 1:
                    do {
                        System.out.println("**Cadastro de Encomenda**");
                        System.out.print("Bloco:");
                        Integer bloco = sc.nextInt();

                        System.out.print("Apartamento:");
                        Integer apto = sc.nextInt();

                        sc.nextLine();
                        System.out.print("Nome do Destinatario:");
                        String destinatario = sc.nextLine();

                        Date dataEntrada = new Date();

                        System.out.print("Encomenda é pacote ou carta ? (P/C)");
                        char chPacote = sc.next().charAt(0);

                        System.out.print("Existe alguma observacao ?");
                        sc.nextLine();
                        String observacao = sc.nextLine();

                        if (chPacote == 'p') {
                            System.out.println("Digite rastreio do pacote: ");
                            String rastreio = sc.next();
                            System.out.println("Qual tamanho do pacote ? (P/M/G)");
                            char chtamanho = sc.next().charAt(0);
                            System.out.println(new Pacote(bloco, apto, destinatario, dataEntrada, observacao, rastreio, chtamanho));
                        } else {
                            System.out.print("Quantas Cartas ?");
                            Integer quantidade = sc.nextInt();
                            System.out.println(new Correspondencia(bloco, apto, destinatario, dataEntrada, observacao, quantidade));
                        }
                        System.out.println("Existe mais alguma encomenda para cadastrar? (S/N)");
                        chresp = sc.next().charAt(0);
                    }while (chresp=='s');
                    
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    if (menu >= 3 || menu < 0) {
                        System.out.println("Digite uma opcao valida!");
                    }
                    break;

                default:
                    System.out.println("Programa Finalizado.");
                    break;

            }
        }while (menu != 0) ;

        sc.close();
    }
}

