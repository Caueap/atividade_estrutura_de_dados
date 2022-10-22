package atividade.testes;

import atividade.Aluno;
import atividade.Vetor;

public class TesteAdicionaPorPosicao {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Daniela");
        a3.setNome("Mario");
        a4.setNome("Ana");
        a5.setNome("Lucas");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);

        System.out.println(lista);

        lista.adiciona(2, a5);

        System.out.println(lista);

    }


}
