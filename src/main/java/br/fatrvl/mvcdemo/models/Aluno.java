package br.fatrvl.mvcdemo.models;

public class Aluno {
    private String matricula;
    private String nome;
    private float p1;
    private float p2;

    public Aluno(String matricula, float p2, float p1, String nome) {
        this.matricula = matricula;
        this.p2 = p2;
        this.p1 = p1;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
