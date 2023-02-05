package application;
import entities.Volume;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<Volume> list = new ArrayList<>();
        int menu;

        do {
            System.out.println("");
            System.out.println("Gerenciamento de Volumes");
            System.out.println("1- Cadastrar volume 2- Buscar itens");
            System.out.println("3- Registrar Entrega 0- Sair");
            menu = sc.nextInt();


            switch (menu) {
                case 1:
                    Volume volume = new Volume();
                    volume.cadastro();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    if (menu >= 3) {
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

