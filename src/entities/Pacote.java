package entities;

import services.Recursos;
import services.SalvarCarregar;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pacote extends Encomenda implements Recursos {

    private String rastreioNf;
    private Integer quantidade;
    private List<Encomenda> encomendas;
    private SalvarCarregar salvarCarregar;

    public Pacote() {
        super();
        salvarCarregar = new SalvarCarregar();
        encomendas = new ArrayList<>();
    }

    public Pacote(Entregador entregador, Morador morador, LocalDateTime dataEntrada, LocalDateTime dataEntrega, String rastreioNf, Integer quantidade) {
        super(entregador, morador, dataEntrada, dataEntrega);
        this.rastreioNf = rastreioNf;
        this.quantidade = quantidade;
    }

    public Pacote(Entregador entregador, Morador morador, LocalDateTime dataEntrada, String rastreioNf, Integer quantidade) {
        super(entregador, morador, dataEntrada);
        this.rastreioNf = rastreioNf;
        this.quantidade = quantidade;
    }

    public void cadastrarEncomenda() {

        Scanner sc = new Scanner(System.in);
        Encomenda encomenda = null;

        System.out.println("**Cadastro de Volumes**");
        System.out.println();

        System.out.print("Digite o nome do Entregador: ");
        String nomeEntregador = sc.nextLine().toUpperCase();

        System.out.print("Digite o RG do Entregador: ");
        Integer rgEntregador = sc.nextInt();
        sc.nextLine();

        while (true) {

            System.out.print("Bloco:");
            Integer bloco = sc.nextInt();

            System.out.print("Apartamento:");
            Integer apto = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome do Destinatario:");
            String nome = sc.nextLine().toUpperCase();

            LocalDateTime dataEntrada = LocalDateTime.now();

            System.out.println("Quantos pacotes esse morador recebeu?");
            int quantidade = sc.nextInt();

            for (int i = 1; i <= quantidade; i++) {
                System.out.println("\nDigite rastreio/NF do pacote " + i + ":");
                String rastreioNF = sc.next().toUpperCase();

                encomenda = new Pacote(new Entregador(rgEntregador, nomeEntregador), new Morador(bloco, apto, nome), dataEntrada, rastreioNF, quantidade);
                encomendas.add(encomenda);
            }
            System.out.println("Cadastrado com sucesso: ");
            //salvarCarregar.Salvar();

            System.out.println("\nExiste mais algum pacote para cadastrar? [S/N]");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
    }


    public void buscarEncomenda() {

    }

    public void entregarEncomenda() {

        Scanner sc = new Scanner(System.in);

        System.out.println("**Entrega de Pacotes**");
        System.out.println();

        System.out.print("Digite o bloco do morador: ");
        int bloco = sc.nextInt();

        System.out.print("Digite o apartamento do morador: ");
        int apto = sc.nextInt();

        List<Encomenda> pacotesEntregues = new ArrayList<>();

        for (Encomenda encomenda : encomendas) {
            if (encomenda instanceof Pacote && encomenda.getMorador().getBloco().equals(bloco) && encomenda.getMorador().getApto().equals(apto)) {
                pacotesEntregues.add(encomenda);
            }
        }
        if (pacotesEntregues.isEmpty()) {
            System.out.println("\nNão há pacotes a para este morador.");
        } else {
            System.out.println("\nPacotes encontrados:");

            for (Encomenda pacote : pacotesEntregues) {
                System.out.println(pacote);
            }

            System.out.println("\nDeseja entregar os pacotes? \n[1].SIM \n[2].Não");
            char resp = sc.next().charAt(0);
            if (resp == '1') {
                for (Encomenda pacote : pacotesEntregues) {
                    pacote.setDataEntrega(LocalDateTime.now());
                    encomendas.remove(pacote);
                }
                System.out.println("Entrega realizada com sucesso!");
            }
        }

    }


    public void relatorio() {

    }

    @Override
    public String toString() {
        return "\nNome Entregador: " + getEntregador().getNome()
                + "\nRG Entregador: " + getEntregador().getRg()
                + "\n--------------------------------------"
                + "\nBloco: " + getMorador().getBloco() + " Apto: " + getMorador().getApto()
                + "\nDestinatario: " + getMorador().getNome()
                + "\nData de Cadastro: " + getDataEntrada()
                +"\nRastreio: "+rastreioNf;
    }
}





