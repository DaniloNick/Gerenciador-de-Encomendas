package entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cartoes extends Encomenda {
    private Integer quantidade;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

    public Cartoes() {
        super();
    }

    public Cartoes(Integer bloco, Integer apto, String destinatario, Date dataEntrada, Integer quantidade) {
        super(bloco, apto, destinatario, dataEntrada);
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }


}

