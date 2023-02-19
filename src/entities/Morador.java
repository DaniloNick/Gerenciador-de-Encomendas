package entities;

import java.util.Scanner;

public class Morador {
    private Integer bloco;
    private Integer apto;
    private String nome;

    public Morador() {
    }

    public Morador(Integer bloco, Integer apto, String nome) {
        this.bloco = bloco;
        this.apto = apto;
        this.nome = nome;
    }

    public Integer getBloco() {
        return bloco;
    }

    public Integer getApto() {
        return apto;
    }

    public String getNome() {
        return nome;
    }
}
