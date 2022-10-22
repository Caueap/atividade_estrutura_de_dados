package atividade.testes;

import atividade.Aluno;
import atividade.Vetor;

public class TestePegaPorPosicao {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();

        a1.setNome("Pedro");
        a2.setNome("Ana");
        a3.setNome("Maria");
        a4.setNome("José");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);

        System.out.println(lista.pega(3));




    }
}
