package atividade;

public class Vetor {

    private Aluno[] alunos = new Aluno[100000];

    private int totalDeAlunos = 0;

    /*public void adiciona(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }
        }
    }*/

    public void adiciona(Aluno aluno) {
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {

    }

    /*public Aluno pega(int posicao) {
        return this.alunos[posicao];
    }*/

    public Aluno pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.alunos[posicao];
    }



    public void remove(int posicao) {

    }

    /*public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (aluno == this.alunos[i]) {
                return true;
            }
        }
        return false;
    }*/

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno == this.alunos[i]) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeAlunos;
    }

    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalDeAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }

        builder.append(this.alunos[this.totalDeAlunos - 1]);
        builder.append("]");

        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }

}
