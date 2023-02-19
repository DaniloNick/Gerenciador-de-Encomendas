package entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Encomenda {
    private Integer rgEntregador;
    private String nomeEntregador;
    private Integer quantidade;
    private Morador morador;
    List<Encomenda> encomendas = new ArrayList<>();

    public Encomenda() {
    }

    public Encomenda(Integer rgEntregador, String nomeEntregador, Integer quantidade, Morador morador) {
        this.rgEntregador = rgEntregador;
        this.nomeEntregador = nomeEntregador;
        this.quantidade = quantidade;
        this.morador = morador;
    }

    public Integer getRgEntregador() {
        return rgEntregador;
    }

    public String getNomeEntregador() {
        return nomeEntregador;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public List<Encomenda> getEncomendas() {
        return encomendas;
    }

    public Morador morador() {
        return morador;
    }

}











