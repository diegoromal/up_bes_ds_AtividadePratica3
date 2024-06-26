package models;

public class Estagiario extends Funcionario {

    private String turno;
    private Funcionario supervisor;

    public Estagiario(int matricula, String nome, float horasTrabalhadas, float salarioHora,
                      String turno, Funcionario supervisor) {
        super(matricula, nome, horasTrabalhadas, salarioHora);
        this.turno = turno;
        this.supervisor = supervisor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public float calcularSalario() {
       return (getSalarioHora() * getHorasTrabalhadas());
    }

    @Override
    public void trabalhar() {
        System.out.println("Estagiario - Desenvolvendo novas funções!");
    } 

    @Override
    public void relatarProgresso() {
        System.out.println("Estagiario - Corrigi erros nos códigos!");
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nTurno de trabalho: " + turno +
            "\nSupervisor: " + supervisor;
    }
}
