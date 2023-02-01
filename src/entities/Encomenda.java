package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Encomenda {


    private Integer bloco;
    private Integer apto;
    private String destinatario;
    private Date dataEntrada;
    private String observacao;

    private List<Encomenda> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

    public Encomenda() {
    }

    public Encomenda(Integer bloco, Integer apto, String destinatario, Date dataEntrada, String observacao) {
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
        sbEncomenda.append("Bloco: " + getBloco() + " Apto: " + getApto()+"\n");
        sbEncomenda.append("Destinatário: " + getDestinatario() + "\n");
        sbEncomenda.append("Data de Entrada: " + sdf.format(dataEntrada) + "\n");
        sbEncomenda.append("Observacao: " + getObservacao() + "\n");
        return sbEncomenda.toString();
    }
}
