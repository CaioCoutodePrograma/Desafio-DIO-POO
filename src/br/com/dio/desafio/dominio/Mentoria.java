package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public Mentoria(){

    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo="+getTitulo() +
                "descrição="+getDescricao()+
                "data=" + data +
                '}';
    }
}
