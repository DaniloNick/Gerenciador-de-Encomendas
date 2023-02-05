package entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Correspondencia extends Volume {
    private Integer quantidade;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

    public Correspondencia() {
        super();
    }

    public Correspondencia(Integer bloco, Integer apto, String destinatario, Date dataEntrada, String observacao,Integer quantidade) {
        super(bloco, apto, destinatario, dataEntrada, observacao);
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sbEncomenda = new StringBuilder();
        sbEncomenda.append("\n");
        sbEncomenda.append("Correspondencia cadastrada com sucesso: \n");
        sbEncomenda.append("Bloco: " + getBloco() + " Apto: " + getApto() + "\n");
        sbEncomenda.append("Destinatário: " + getDestinatario() + "\n");
        sbEncomenda.append("Data de Entrada: " + sdf.format(getDataEntrada()) + "\n");
        sbEncomenda.append("Quantidade de Cartas: " + getQuantidade() + "\n");
        sbEncomenda.append("Observacao: " + getObservacao() + "\n");
        return sbEncomenda.toString();
    }
}

