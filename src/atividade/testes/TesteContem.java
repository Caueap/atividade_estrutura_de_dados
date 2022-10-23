package atividade.testes;

import atividade.Aluno;
import atividade.Vetor;

public class TesteContem {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

        a1.setNome("Pedro");
        a2.setNome("Lucas");
        a3.setNome("Jorge");
        a4.setNome("Caio");
        a5.setNome("Eric");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);

        System.out.println(lista.contem(a3));

    }
}
