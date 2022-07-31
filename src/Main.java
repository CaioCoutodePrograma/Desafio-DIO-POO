import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

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


//        System.out.println(curso);
//        System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio Couto");
        devCaio.inscreverBootcamp(bootcamp);
        devCaio.progredir();

        Dev devAbelardo = new Dev();
        devAbelardo.setNome("Abelardo da Silva");
        devAbelardo.inscreverBootcamp(bootcamp);
        devAbelardo.progredir();


    }
}
