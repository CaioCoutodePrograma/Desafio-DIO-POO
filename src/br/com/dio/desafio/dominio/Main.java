package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso  = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descição cusro java");
        curso.setCargahoraria(8);

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso JavaScript");
        curso1.setDescricao("descição cusro javaScript");
        curso1.setCargahoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);

    }
}
