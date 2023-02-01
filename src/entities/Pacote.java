package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pacote extends Encomenda {
    private String rastreio;
    private char tamanho;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

    public Pacote() {
        super();
    }

    public Pacote(Integer bloco, Integer apto, String destinatario, Date dataEntrada, String observacao, String rastreio, char tamanho) {
        super(bloco, apto, destinatario, dataEntrada, observacao);
        this.rastreio = rastreio;
        this.tamanho = tamanho;
    }

    public String getRastreio() {
        return rastreio;
    }

    public void setRastreio(String rastreio) {
        this.rastreio = rastreio;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    @Override
    public String toString() {
        StringBuilder sbEncomenda = new StringBuilder();
        sbEncomenda.append("\n");
        sbEncomenda.append("Pacote cadastrado com sucesso: \n");
        sbEncomenda.append("Bloco: " + getBloco() + " Apto: " + getApto()+"\n");
        sbEncomenda.append("Destinatário: " + getDestinatario() + "\n");
        sbEncomenda.append("Data de Entrada: " + sdf.format(getDataEntrada()) + "\n");
        sbEncomenda.append("Cod. rastreio: " + getRastreio()+"\n");
        sbEncomenda.append("Tamanho do Pacote: " + getTamanho()+"\n");
        sbEncomenda.append("Observacao: " + getObservacao() + "\n");
        return sbEncomenda.toString();
    }
}
