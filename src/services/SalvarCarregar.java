package services;

import entities.Encomenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SalvarCarregar {

    private List<Encomenda> encomendas;
    public void Salvar(){

        String strpath = "C:\\Temp";
        File path = new File(strpath +"\\encomendas.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){

            for(Encomenda encomenda: encomendas){
            bw.write(encomenda.toString());
            bw.newLine();
            }

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
