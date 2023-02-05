package entities;

import application.Program;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Volume {
    private Integer bloco;
    private Integer apto;
    private String destinatario;
    private Date dataEntrada;
    private String observacao;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

    public Volume() {
    }

    public Volume(Integer bloco, Integer apto, String destinatario, Date dataEntrada, String observacao) {
        this.bloco = bloco;
        this.apto = apto;
        this.destinatario = destinatario;
        this.dataEntrada = dataEntrada;
        this.observacao = observacao;
    }

    public Integer getBloco() {
        return bloco;
    }

    public void setBloco(Integer bloco) {
        this.bloco = bloco;
    }

    public Integer getApto() {
        return apto;
    }

    public void setApto(Integer apto) {
        this.apto = apto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String toString() {
        StringBuilder sbEncomenda = new StringBuilder();
        sbEncomenda.append("\n");
        sbEncomenda.append("Encomenda cadastrada com sucesso: \n");
        sbEncomenda.append("Bloco: " + getBloco() + " Apto: " + getApto() + "\n");
        sbEncomenda.append("Destinatário: " + getDestinatario() + "\n");
        sbEncomenda.append("Data de Entrada: " + sdf.format(dataEntrada) + "\n");
        sbEncomenda.append("Observacao: " + getObservacao() + "\n");
        return sbEncomenda.toString();
    }

    char chresp;
    Scanner sc = new Scanner(System.in);

    public void cadastro() {

        do {
            System.out.println("**Cadastro de Volumes**");
            System.out.println();

            System.out.print("Bloco:");
            Integer bloco = sc.nextInt();

            System.out.print("Apartamento:");
            Integer apto = sc.nextInt();

            sc.nextLine();
            System.out.print("Nome do Destinatario:");
            String destinatario = sc.nextLine();

            Date dataEntrada = new Date();

            System.out.print("Volume e [P]acote ou [C]arta ?");
            char chPacote = sc.next().charAt(0);

            System.out.print("Existe alguma observacao ?");
            sc.nextLine();
            String observacao = sc.nextLine();

            if (chPacote == 'p') {

                System.out.println("Digite rastreio/NF do volume: ");
                String rastreioNF = sc.next();
                System.out.println(new Pacote(bloco, apto, destinatario, dataEntrada, observacao, rastreioNF));

            } else {

                System.out.print("Quantas Cartas ?");
                Integer quantidade = sc.nextInt();
                System.out.println(new Correspondencia(bloco, apto, destinatario, dataEntrada, observacao, quantidade));
            }

            System.out.println("Existe mais algum volume para cadastrar?");
            chresp = sc.next().charAt(0);

        } while (chresp == 's');
    }
}





