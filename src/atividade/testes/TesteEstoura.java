package atividade.testes;

import atividade.Aluno;
import atividade.Vetor;

public class TesteEstoura {

    public static void main(String[] args) {

        Vetor vetor = new Vetor();

        for (int i = 0; i < 100001; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }
    }
}
