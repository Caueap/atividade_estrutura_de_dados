package atividade.testes;

import atividade.Aluno;
import atividade.Vetor;

public class TestePega {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Leo");
        a2.setNome("Samuel");
        a3.setNome("Carol");

        Vetor vetor = new Vetor();

        vetor.adiciona(a1);
        vetor.adiciona(a2);
        vetor.adiciona(a3);

        System.out.println(vetor.pega(2));
        System.out.println(vetor.pega(3));
        System.out.println(vetor.pega(1000001));

    }
}
