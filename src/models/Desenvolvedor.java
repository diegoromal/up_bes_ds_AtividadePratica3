package models;

public class Desenvolvedor extends Funcionario {

    private String tecnologia;

    public Desenvolvedor(int matricula, String nome, float horasTrabalhadas, float salarioHora, String tecnologia) {
        super(matricula, nome, horasTrabalhadas, salarioHora);
        this.tecnologia = tecnologia;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public float calcularSalario() {
       return (getSalarioHora() * getHorasTrabalhadas());
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor - Ajudando o estagiário!");
    } 

    @Override
    public void relatarProgresso() {
        System.out.println("Desenvolvedor - Revisei solicitações de alteração do código!");
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nTecnologia que domina: " + tecnologia;
    }
}
