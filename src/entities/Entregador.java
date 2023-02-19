package entities;

import java.util.Scanner;

public class Entregador {
    private Integer rg;
    private String nome;

    public Entregador(Integer rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }
}
