package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Encomenda {
    private Entregador entregador;
    private Morador morador;

    private LocalDateTime dataEntrada;
    private LocalDateTime dataEntrega;
    List<Encomenda> encomendas = new ArrayList<>();

    public Encomenda() {
    }

    public Encomenda(Entregador entregador, Morador morador, LocalDateTime dataEntrada, LocalDateTime dataEntrega) {
        this.entregador = entregador;
        this.morador = morador;
        this.dataEntrada = dataEntrada;
        this.dataEntrega = dataEntrega;
    }
    public Encomenda(Entregador entregador, Morador morador, LocalDateTime dataEntrada) {
        this.entregador = entregador;
        this.morador = morador;
        this.dataEntrada = dataEntrada;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public Morador getMorador() {
        return morador;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public boolean foiEntregue(){
        return false;
    }
}











