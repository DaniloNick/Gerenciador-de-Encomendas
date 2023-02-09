package entities;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Encomenda {
    private Integer bloco;
    private Integer apto;
    private String destinatario;
    private Date dataEntrada;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
    private static ArrayList<Encomenda> encomendas = new ArrayList<>();

    public Encomenda() {
    }

    public Encomenda(Integer bloco, Integer apto, String destinatario, Date dataEntrada) {
        this.bloco = bloco;
        this.apto = apto;
        this.destinatario = destinatario;
        this.dataEntrada = dataEntrada;
    }

    public Integer getBloco() {
        return bloco;
    }

    public Integer getApto() {
        return apto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public static ArrayList<Encomenda> getEncomendas() {
        return encomendas;
    }

    public void cadastraVolume() {

        Scanner scVolume = new Scanner(System.in);
        Boolean continuar = true;

        while (continuar) {
            System.out.println("**Cadastro de Volumes**");
            System.out.println();

            System.out.print("Bloco:");
            Integer bloco = scVolume.nextInt();

            System.out.print("Apartamento:");
            Integer apto = scVolume.nextInt();

            scVolume.nextLine();
            System.out.print("Nome do Destinatario:");
            String destinatario = scVolume.nextLine().toUpperCase();

            Date dataEntrada = new Date();

            System.out.print("Volume e pacote ou cartao ? (P/C)");
            char chPacote = scVolume.next().charAt(0);

            if (chPacote == 'p') {
                System.out.println("Quantos pacotes esse morador recebeu?");
                int n = scVolume.nextInt();
                for (int i =0; i<n; i++) {
                    System.out.println("Digite rastreio/NF do volume: ");
                    String rastreioNF = scVolume.next().toUpperCase();
                    Encomenda encomenda = new Pacote(bloco, apto, destinatario, dataEntrada, rastreioNF);
                    encomendas.add(encomenda);
                }
                System.out.println("Cadastrado com sucesso.");
            } else {
                System.out.print("Quantas Cartas ?");
                Integer quantidade = scVolume.nextInt();

                Encomenda encomenda = new Cartoes(bloco, apto, destinatario, dataEntrada, quantidade);
                encomendas.add(encomenda);
                System.out.println("\nCadastrado com sucesso.");
            }

            System.out.println("\nExiste mais algum volume para cadastrar?");
            String Respota = scVolume.next();
            if (Respota.equals("n")) {
                continuar = false;
            }
        }
    }

    public void exibirLista() {
        System.out.println("\nExibindo todas as encomendas: ");
        for (Encomenda encomenda : encomendas) {
            System.out.println(encomenda.exibiVolumesCadastrados());
        }
    }


    public String exibiVolumesCadastrados() {
        return "\nBloco/Apto: "
                + getBloco()
                + "/"
                + getApto()
                + "\nDestinatario: "
                + getDestinatario() + "\nData: " + getDataEntrada();
    }
}










