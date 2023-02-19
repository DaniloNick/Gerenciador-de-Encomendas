package entities;

import services.Recursos;

import java.util.Scanner;

public class Pacote extends Encomenda implements Recursos {

    private String rastreioNf;

    public Pacote() {
        super();
    }

    public Pacote(Integer rgEntregador, String nomeEntregador, Integer quantidade, String rastreioNf, Morador morador) {
        super(rgEntregador, nomeEntregador, quantidade, morador);
        this.rastreioNf = rastreioNf;
    }

    public String getRastreioNf() {
        return rastreioNf;
    }

    public void cadastrarEncomenda() {

        Scanner sc = new Scanner(System.in);

        System.out.println("**Cadastro de Volumes**");
        System.out.println();

        System.out.print("Digite o nome do Entregador: ");
        String nomeEntregador = sc.nextLine().toUpperCase();

        System.out.print("Digite o RG do Entregador: ");
        Integer rgEntregador = sc.nextInt();

        while (true) {

            System.out.print("Bloco:");
            Integer bloco = sc.nextInt();

            System.out.print("Apartamento:");
            Integer apto = sc.nextInt();

            sc.nextLine();
            System.out.print("Nome do Destinatario:");
            String destinatario = sc.nextLine().toUpperCase();

            System.out.println("Quantos pacotes esse morador recebeu?");
            int quantidade = sc.nextInt();

            for (int i = 1; i <= quantidade; i++) {
                System.out.println("\nDigite rastreio/NF do pacote " + i + ":");
                String rastreioNF = sc.next().toUpperCase();

                encomendas.add(new Pacote(rgEntregador, nomeEntregador, quantidade, rastreioNF, new Morador(bloco, apto, destinatario)));

                System.out.println("Cadastrado com sucesso.");
            }
            System.out.println("\nExiste mais algum pacote para cadastrar? [S/N]");
            String Respota = sc.next();
            if (Respota.equals("n")) {
                break;
            }
        }
    }

    public void buscarEncomenda() {

    }

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
            System.out.println("\nPacote encontrado para " + encomendaEncontrada.morador().getDestinatario()
                    + "\nBloco: " + encomendaEncontrada.morador().getBloco() + " Apto: " + encomendaEncontrada.morador().getApto());
            System.out.println("\nEntregar pacote ? \n[S].SIM \n[N].Nao");
            char resp = sc.next().charAt(0);
            if (resp == 's') {
                encomendas.remove(encomendaEncontrada);
                System.out.println("Pacote Entregue!");
            }
        } else {
            System.out.println("**Nenhum pacote encontrado**");
        }
    }

    public void relatorio() {

    }
}


