package entities;

import java.util.Scanner;

public class Cartoes extends Encomenda {

    public Cartoes() {
    }

    public Cartoes(Integer rgEntregador, String nomeEntregador, Integer quantidade, Morador morador) {
        super(rgEntregador, nomeEntregador, quantidade, morador);
    }

    @Override
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

            System.out.println("Quantos cartoes esse morador recebeu?");
            int quantidade = scVolume.nextInt();

            encomendas.add(new Cartoes(rgEntregador, nomeEntregador, quantidade, new Morador(bloco, apto, destinatario)));

            System.out.println("\nCadastrado com sucesso.");

        System.out.println("\nExiste mais algum cartao para cadastrar? [S/N]");
        String Respota = scVolume.next();
        if (Respota.equals("n")) {
            break;
        }
    }

}
    @Override
    public void buscarEncomenda() {

    }
    @Override
    public void entregarEncomenda() {

        Scanner sc = new Scanner(System.in);
        Encomenda encomendaEncontrada = null;

        System.out.print("Digite o numero do Bloco:");
        Integer bloco = sc.nextInt();
        System.out.print("Digite o numero do Apartamento:");
        Integer apto = sc.nextInt();

        for (Encomenda encomenda : encomendas) {
            if (encomenda.morador().getBloco().equals(bloco) && encomenda.morador().getApto().equals(apto) && encomenda.getQuantidade() != null) {
                encomendaEncontrada = encomenda;
            }
            break;
        }
        if (encomendaEncontrada != null) {
            System.out.println("\nCartao encontrado para " + encomendaEncontrada.morador().getDestinatario()
                    + "\nBloco: " + encomendaEncontrada.morador().getBloco() + " Apto: " + encomendaEncontrada.morador().getApto());
            System.out.println("\nEntregar pacote ? \n[S].SIM \n[N].Nao");
            char resp = sc.next().charAt(0);
            if (resp == 's') {
                encomendas.remove(encomendaEncontrada);
                System.out.println("Cartao Entregue!");
            }
        } else {
            System.out.println("**Nenhum Cartao encontrado**");
        }
    }
    @Override
    public void relatorio() {

    }
}
