package entities;

import java.util.Date;

public class Correspondencia extends Encomenda{
    private Integer quantidade;

    public Correspondencia() {
        super();
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Correspondencia(Integer bloco, Integer apto, String destinatario, Date dataEntrada, String observacao, Integer quantidade) {
        super(bloco, apto, destinatario, dataEntrada, observacao);
        this.quantidade = quantidade;


    }
}

