package models;

public class Gerente extends Funcionario {

    private String equipe;
    private float bonusAnual;

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
        System.out.println("Gerente - Orientando seu time!");
    } 

    @Override
    public void relatarProgresso() {
        System.out.println("Gerente - Finalizei mais um projeto!");
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nEquipe: " + equipe +
            "\nBonus Anual: R$" + decimalFormat.format(bonusAnual);
    }
}
