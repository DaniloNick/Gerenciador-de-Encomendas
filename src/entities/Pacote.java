package entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pacote extends Encomenda {
    private String rastreioNf;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

    public Pacote() {
    }
    public Pacote(Integer bloco, Integer apto, String destinatario, Date dataEntrada, String rastreio) {
        super(bloco, apto, destinatario, dataEntrada);
        this.rastreioNf = rastreio;
    }
    public String getRastreio() {
        return rastreioNf;
    }
}

