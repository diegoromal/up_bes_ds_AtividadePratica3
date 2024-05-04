package models;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor extends Funcionario {

    private static List<Tecnologias> tecnologias = new ArrayList<>();

    @Override
    public float calcularSalario() {
        return 1;
    }
    
}
