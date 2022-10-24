package atividade.testes;

import atividade.Aluno;
import atividade.Vetor;

public class TesteRemove {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Lucas");
        a2.setNome("Pedro");
        a3.setNome("Ana");

        Vetor vetor = new Vetor();

        vetor.adiciona(a1);
        vetor.adiciona(a2);
        vetor.adiciona(a3);

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);




    }
}
