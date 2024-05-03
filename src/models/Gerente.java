package models;

import interfaces.Desempenho;

public class Gerente extends Funcionario implements Desempenho {

    private String equipe;
    private float bonusAnual;

    public Gerente(){}

    public Gerente(int matricula, String nome, float horasTrabalhadas, float salarioHora, String equipe,
            float bonusAnual) {
        super(matricula, nome, horasTrabalhadas, salarioHora);
        this.equipe = equipe;
        this.bonusAnual = bonusAnual;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public float calcularSalario() {
       return (getSalarioHora() * getHorasTrabalhadas()) + (bonusAnual / 12);
    }

    @Override
    public void trabalhar() {
        System.out.println("O gerente orientou seu time!");
    } 

    @Override
    public void relatarProgresso() {
        System.out.println("O gerente finalizou mais um projeto!");
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nEquipe: " + equipe +
            "\nBonus Anual: R$" + bonusAnual +
            "\nSalário: " + calcularSalario();
    }
}
