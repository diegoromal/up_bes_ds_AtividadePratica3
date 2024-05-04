package controllers;

import java.util.ArrayList;
import java.util.List;

import models.*;

public class CadastroFuncionarios {

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario func) {
        listaFuncionarios.add(func);
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static List<Funcionario> getGerentes() {
        List<Funcionario> tempList = new ArrayList<>();

        for(Funcionario tempFunc: listaFuncionarios) {
            if (tempFunc instanceof Gerente) {
                tempList.add(tempFunc);
            }
        }

        return tempList;
    }
    
    public static List<Funcionario> getDesenvolvedores() {
        List<Funcionario> tempList = new ArrayList<>();

        for(Funcionario tempFunc: listaFuncionarios) {
            if (tempFunc instanceof Desenvolvedor) {
                tempList.add(tempFunc);
            }
        }

        return tempList;
    }
    
    public static List<Funcionario> getEstagiarios() {
        List<Funcionario> tempList = new ArrayList<>();

        for(Funcionario tempFunc: listaFuncionarios) {
            if (tempFunc instanceof Estagiario) {
                tempList.add(tempFunc);
            }
        }

        return tempList;
    }

    public static boolean excluir(int matricula) {
        for (Funcionario tempFuncionario : listaFuncionarios) {
            if (tempFuncionario.getMatricula() == matricula) {
                listaFuncionarios.remove(tempFuncionario);
                return true;
            }
        }
        return false;
    }

    public static boolean excluirTodos() {
        listaFuncionarios.clear();
        return true;
    }

    public static boolean editar(int matricula, Funcionario novoFuncionario) {
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionario funcionario = listaFuncionarios.get(i);
            if (funcionario.getMatricula() == matricula) {
                listaFuncionarios.set(i, novoFuncionario);
                return true;
            }
        }
        return false;
    }
    
    
}
