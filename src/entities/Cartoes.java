package entities;

import services.Recursos;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Cartoes extends Encomenda implements Recursos {

    private Integer quantidade;

    public Cartoes() {
        super();
    }

    public Cartoes(Entregador entregador, Morador morador, LocalDateTime dataEntrada, Integer quantidade) {
        super(entregador, morador, dataEntrada);
        this.quantidade = quantidade;
    }

    public void cadastrarEncomenda() {

        Scanner scVolume = new Scanner(System.in);

        System.out.println("**Cadastro de Volumes**");
        System.out.println();

        System.out.print("Digite o nome do Entregador: ");
        String nomeEntregador = scVolume.nextLine().toUpperCase();

        System.out.print("Digite o RG do Entregador: ");
        Integer rgEntregador = scVolume.nextInt();

        while (true) {

            System.out.print("Bloco:");
            Integer bloco = scVolume.nextInt();

            System.out.print("Apartamento:");
            Integer apto = scVolume.nextInt();

            scVolume.nextLine();
            System.out.print("Nome do Destinatario:");
            String destinatario = scVolume.nextLine().toUpperCase();

            LocalDateTime dataEntrada = LocalDateTime.now();

            System.out.println("Quantos cartoes esse morador recebeu?");
            int quantidade = scVolume.nextInt();

            encomendas.add(new Cartoes(new Entregador(rgEntregador, nomeEntregador),new Morador(bloco, apto, destinatario),dataEntrada, quantidade));

            System.out.println("\nCadastrado com sucesso.");

            System.out.println("\nExiste mais algum cartao para cadastrar? [S/N]");
            String Respota = scVolume.next();
            if (Respota.equals("n")) {
                break;
            }
        }

    }

    public void buscarEncomenda() {

    }

    public void entregarEncomenda() {

    }

    public void relatorio() {

    }
}