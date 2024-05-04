package models;

import java.text.DecimalFormat;

// interface "Trabalhavel" para uso em todas as subclasses
import interfaces.Desempenho;

public abstract class Funcionario implements Desempenho {
    private int matricula;
    private String nome;
    private float salarioHora;
    private float horasTrabalhadas;

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public Funcionario(int matricula, String nome, float horasTrabalhadas, float salarioHora) {
        this.matricula = matricula;
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    // Método abstrato para calcular salário
    public abstract float calcularSalario();

    @Override
    public String toString() {
        // retorno mostrando o salário calculado
        return "\nMatrícula: " + matricula +
               "\nNome: " + nome +
               "\nSalário: R$" + decimalFormat.format(calcularSalario());
    }
}