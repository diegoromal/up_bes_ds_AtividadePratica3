package views;

import controllers.CadastroFuncionarios;
import models.*;

public class Sistema {


    private static void exibirMenuPrincipal() {

        System.out.println("\nCadastro de Funcionário\n");
        System.out.println("[1] - Cadastrar gerente");
        System.out.println("[2] - Cadastrar desenvolvedor");
        System.out.println("[3] - Cadastrar estagiário");
        System.out.println("[4] - Listar todos os funcionários");
        System.out.println("[5] - Listar gerentes");
        System.out.println("[6] - Listar desenvolvedores");
        System.out.println("[7] - Listar estagiários");
        System.out.println("[8] - Editar funcionário");
        System.out.println("[9] - Remover funcionário");
        System.out.println("[10] - Remover todos os funcionários");
        System.out.println("[11] - Verificar trabalhos");
        System.out.println("[12] - Verificar progressos");
        System.out.println("[0] - Sair");
        System.out.print("\nInforme uma opção: ");
        
    }

    private static void exibirMenuEditar(int matricula) {
        System.out.println("\nEditar " + matricula);
        System.out.println("[1] - Editar gerente");
        System.out.println("[2] - Editar desenvolvedor");
        System.out.println("[3] - Editar estagiário");
        System.out.println("[0] - Voltar");
        System.out.print("\nInforme uma opção: ");
    }

    private static void cadastrarFuncionarios(String cargo) {

        System.out.println("\nCadastro de " + cargo);
        
        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();
        
        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Horas trabalhadas: ");
        float horasTrabalhadas = Console.lerFloat();

        System.out.print("Salário por hora: ");
        float salarioHora = Console.lerFloat();

        if (cargo == "Gerente") {
            System.out.print("Equipe: ");
            String equipe = Console.lerString();

            System.out.print("Bonus anual: ");
            float bonusAnual = Console.lerFloat();
            
            Gerente gerente = new Gerente(matricula, nome, horasTrabalhadas, salarioHora, equipe, bonusAnual);
            
            CadastroFuncionarios.cadastrar(gerente);
        }

        if (cargo == "Desenvolvedor") {
            System.out.print("Tecnologia que domina: ");
            String tecnologia = Console.lerString();
            
            Desenvolvedor desenvolvedor = new Desenvolvedor(matricula, nome, horasTrabalhadas, salarioHora, tecnologia);
            
            CadastroFuncionarios.cadastrar(desenvolvedor);
        }
        
        if (cargo == "Estagiario") {
            System.out.print("Turno de trabalho: ");
            String turno = Console.lerString();

            System.out.print("Supervisor: ");
            String supervisor = Console.lerString();

            Estagiario estagiario = new Estagiario(matricula, nome, horasTrabalhadas, salarioHora, turno, supervisor);
            
            CadastroFuncionarios.cadastrar(estagiario);
        }

        System.out.println("\n" + cargo + " cadastrado com sucesso!");
    }

    private static void editarFuncionarios(String cargo, int matricula) {

        System.out.println("\nEditar " + matricula);

        System.out.print("Nome: ");
        String nome = Console.lerString();
        
        System.out.print("Horas trabalhadas: ");
        float horasTrabalhadas = Console.lerFloat();

        System.out.print("Salário por hora: ");
        float salarioHora = Console.lerFloat();

        if (cargo == "Gerente") {
            System.out.print("Equipe: ");
            String equipe = Console.lerString();

            System.out.print("Bonus anual: ");
            float bonusAnual = Console.lerFloat();
            
            Gerente gerente = new Gerente(matricula, nome, horasTrabalhadas, salarioHora, equipe, bonusAnual);

            if (CadastroFuncionarios.editar(matricula, gerente)) {
                System.out.println("\n" + matricula + " editado com sucesso!");
            } else {
                System.out.println("\nOcorreu um erro ao editar " + matricula + "!" );
            }
        }
        
        if (cargo == "Desenvolvedor") {
            System.out.print("Tecnologia que domina: ");
            String tecnologia = Console.lerString();
            
            Desenvolvedor desenvolvedor = new Desenvolvedor(matricula, nome, horasTrabalhadas, salarioHora, tecnologia);
                        
            if (CadastroFuncionarios.editar(matricula, desenvolvedor)) {
                System.out.println("\n" + matricula + " editado com sucesso!");
            } else {
                System.out.println("\nOcorreu um erro ao editar " + matricula + "!" );
            }
        }
        
        if (cargo == "Estagiario") {
            System.out.print("Turno de trabalho: ");
            String turno = Console.lerString();

            System.out.print("Supervisor: ");
            String supervisor = Console.lerString();

            Estagiario estagiario = new Estagiario(matricula, nome, horasTrabalhadas, salarioHora, turno, supervisor);
            
            
            if (CadastroFuncionarios.editar(matricula, estagiario)) {
                System.out.println("\n" + matricula + " editado com sucesso!");
            } else {
                System.out.println("\nOcorreu um erro ao editar " + matricula + "!" );
            }
        }
     
    }

    private static void verificarTrabalho() {
        if (CadastroFuncionarios.getListaFuncionarios().size() == 0) {
            System.out.println("\nNão há funcionários cadastrados...");
            return;
        }

        for (Funcionario funcionario: CadastroFuncionarios.getListaFuncionarios()) {
            System.out.print("\n" + funcionario.getNome() + ": ");
            funcionario.trabalhar();
        }
    }

    private static void verificarProgresso() {
        if (CadastroFuncionarios.getListaFuncionarios().size() == 0) {
            System.out.println("\nNão há funcionários cadastrados...");
            return;
        }

        for (Funcionario funcionario: CadastroFuncionarios.getListaFuncionarios()) {
            System.out.print("\n" + funcionario.getNome() + ": ");
            funcionario.relatarProgresso();
        }
    }

    private static void verificarOpcaoMenuPrincipal(int opcao) {

        int matricula;

        switch (opcao) {
            case 1:
                cadastrarFuncionarios("Gerente");
                break;

            case 2:
                cadastrarFuncionarios("Desenvolvedor");
                break;

            case 3:
                cadastrarFuncionarios("Estagiario");
                break;
            
            case 4:
                if (CadastroFuncionarios.getListaFuncionarios().size() == 0) {
                    System.out.println("\nNão há funcionários cadastrados...");
                    break;
                }
        
                System.out.println("\nFuncionários cadastrados: ");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getListaFuncionarios()) {
                    System.out.println(tempFuncionario);
                }

                break;

            case 5:
                if (CadastroFuncionarios.getGerentes().size() == 0) {
                    System.out.println("\nNão há gerentes cadastrados...");
                    break;
                }

                System.out.println("\nGerentes cadastrados: ");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getGerentes()) {
                    System.out.println(tempFuncionario);
                }

                break;
            
            case 6:
                if (CadastroFuncionarios.getDesenvolvedores().size() == 0) {
                    System.out.println("\nNão há desenvolvedores cadastrados...");
                    break;
                }

                System.out.println("\nDesenvolvedores cadastrados: ");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getDesenvolvedores()) {
                    System.out.println(tempFuncionario);
                }

                break;
            
            case 7:
                if (CadastroFuncionarios.getEstagiarios().size() == 0) {
                    System.out.println("\nNão há estagiários cadastrados...");
                    break;
                }

                System.out.println("\nEstagiários cadastrados: ");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getEstagiarios()) {
                    System.out.println(tempFuncionario);
                }

                break;
            
            case 8:
                System.out.println("\nEditar funcionário");
                System.out.print("Informe a matrícula do funcionário: ");
                matricula = Console.lerInt();

                int opcaoEditar;

                do {
                    exibirMenuEditar(matricula);
                    opcaoEditar = Console.lerInt();
                    verificarOpcaoMenuEditar(opcaoEditar, matricula);

                } while (opcaoEditar != 0);

                break;
            
            case 9:
                System.out.println("\nRemover funcionário");
                System.out.print("Informe a matrícula do funcionário: ");
                matricula = Console.lerInt();

                if (CadastroFuncionarios.excluir(matricula)){
                    System.out.println("\nFuncionário removido com sucesso!");
                } else {
                    System.out.println("\nFuncionário " + matricula + " não localizado no cadastro");
                }

                break;
      
            case 10:
                System.out.println("\nRemover Todos os Funcionários");

                if (CadastroFuncionarios.getListaFuncionarios().size() == 0) {
                    System.out.println("\nNão há funcionários cadastrados...");
                    break;
                }
                
                if (CadastroFuncionarios.excluirTodos()){
                    System.out.println("\nFuncionários removidos com sucesso!");
                } else {
                    System.out.println("\nOcorreu um erro ao excluir os funcionários!");
                }

                break;
            
            case 11:
                verificarTrabalho();
                break;
            
            case 12:
                verificarProgresso();
                break;
            
            case 0:
                System.out.println("\nO Sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        
        }

    }

    private static void verificarOpcaoMenuEditar(int opcaoEditar, int matricula) {
        switch(opcaoEditar) {
            case 1:
                editarFuncionarios("Gerente", matricula);
                break;
            case 2:
                editarFuncionarios("Desenvolvedor", matricula);
                break;
            case 3:
                editarFuncionarios("Estagiario", matricula);
                break;
            case 0:
                System.out.println("\nA edição foi finalizada...");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    public static void executar() {
        
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = Console.lerInt();
            verificarOpcaoMenuPrincipal(opcao);
        } while (opcao != 0);
    }
}
