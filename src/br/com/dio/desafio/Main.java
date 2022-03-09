package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Aceleracao;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.DevDetalhe;
import br.com.dio.desafio.dominio.Labs;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descri��o curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descri��o curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descri��o mentoria java");
        mentoria.setData(LocalDate.now());
        
        Labs labs = new Labs();
        labs.setTitulo("API REST Java");
        labs.setDescricao("descri��o do labs Java");
        labs.setCargaHoraria(8);
        
        Aceleracao aceleracao = new Aceleracao();
        aceleracao.setTitulo("Aceleracao");
        aceleracao.setDescricao("descri��o da Acelera��o");
        aceleracao.setCargaHoraria(15);

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(labs);
        bootcamp.getConteudos().add(aceleracao);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        
        DevDetalhe camilaDetalhe = new DevDetalhe("Cunha", "camila@camila", "99998888");
        devCamila.setDevDetalhe(camilaDetalhe);
        
        
        
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Detalhes Camila:"+devCamila.getDevDetalhe());
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conte�dos Conclu�dos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        
        DevDetalhe joaoDetalhe = new DevDetalhe("Jose", "joao@jose", "99998888");
        devJoao.setDevDetalhe(joaoDetalhe);
        
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Detalhes Jo�o:"+devJoao.getDevDetalhe());
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
        System.out.println("Conte�dos Concluidos Jo�o:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}

