package models;
abstract class Funcionario {
    protected int matricula;
    protected String nome;
    protected float salario;

    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // Método abstrato para calcular salário
    public abstract float calcularSalario();
}