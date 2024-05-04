import models.Gerente;

public class Principal {

    public static void main(String[] args) {

        Gerente g1 = new Gerente(1234, "João", 180f, 25f, "Desenvolvimento", 5000f);
        System.out.println(g1.toString());
        g1.trabalhar();
        g1.relatarProgresso();
        
    }
    
}
