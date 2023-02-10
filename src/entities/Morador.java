package entities;

public class Morador {
    private Integer bloco;
    private Integer apto;
    private String destinatario;

    public Morador() {
    }

    public Morador(Integer bloco, Integer apto, String destinatario) {
        this.bloco = bloco;
        this.apto = apto;
        this.destinatario = destinatario;
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
}
