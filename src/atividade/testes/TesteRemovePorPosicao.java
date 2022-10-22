package atividade.testes;

import atividade.Aluno;
import atividade.Vetor;

public class TesteRemovePorPosicao {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Ana");
        a3.setNome("Carol");
        a4.setNome("Pedro");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);

        System.out.println(lista);

        lista.remove(1);

        System.out.println(lista);

    }


}
