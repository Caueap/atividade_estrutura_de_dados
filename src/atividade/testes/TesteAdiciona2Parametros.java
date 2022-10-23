package atividade.testes;

import atividade.Aluno;
import atividade.Vetor;

public class TesteAdiciona2Parametros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Lucas");
        a3.setNome("Ana");
        a4.setNome("Rafaela");
        a5.setNome("Cláudio");

        Vetor vetor = new Vetor();

        vetor.adiciona(a1);
        vetor.adiciona(a2);
        vetor.adiciona(a3);
        vetor.adiciona(a4);

        System.out.println(vetor);

        vetor.adiciona(1, a5);

        System.out.println(vetor);


    }
}
