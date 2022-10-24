package atividade.testes;

import atividade.Aluno;
import atividade.Vetor;

import java.util.ArrayList;
import java.util.Vector;

public class Questao12 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor();

        System.out.println(vetor.tamanho());

        for (int i = 0; i < 1000; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }

        System.out.println(vetor.tamanho());

        int n = vetor.tamanho();

        Vector<Object> v = new Vector<>();

        System.out.println(v.size());

        for (int i = 0; i < n; i++) {
            v.add(i, vetor);
        }

        System.out.println(v.size());

        ArrayList<Object> array = new ArrayList<>();

        System.out.println(array.size());

        for (int i = 0; i < n; i++) {
            array.add(i, vetor);
        }

        System.out.println(array.size());



    }
}
