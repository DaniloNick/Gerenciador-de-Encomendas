package entities;

import java.util.Date;

public class Pacote extends Encomenda {
    private String rastreio;
    private char tamanho;

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
}
