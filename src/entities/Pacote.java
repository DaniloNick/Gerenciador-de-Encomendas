package entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pacote extends Encomenda {
    private String rastreioNf;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

    public Pacote() {
    }

    public Pacote(Integer bloco, Integer apto, String destinatario, Date dataEntrada, String observacao, String rastreio) {
        super(bloco, apto, destinatario, dataEntrada, observacao);
        this.rastreioNf = rastreio;
    }

    public String getRastreio() {
        return rastreioNf;
    }

    public void setRastreio(String rastreio) {
        this.rastreioNf = rastreio;
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
        sbEncomenda.append("Observacao: " + getObservacao() + "\n");
        return sbEncomenda.toString();
    }
}
