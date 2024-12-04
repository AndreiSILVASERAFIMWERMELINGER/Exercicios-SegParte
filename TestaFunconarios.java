package bancov06;

import separados.Caixa;
import separados.Funcionario;
import separados.Gerente;

public class TestaFunconarios {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setNome("Andrei");
        f1.setSalario(1500.00);
        f1.mostraDados();

        Funcionario f2 = new Caixa();
        f2.setNome("Breno");
        f2.setSalario(1500.00);
        f2.mostraDados();

        Gerente g1 = new Gerente();
        g1.setSalario(2000.00);
        g1.setNome("Rolex");
        g1.mostraDados();
        g1.setSenha("password123");

        if (g1.verifica()){
            System.out.println("Senha valida");
        }
        else{
            System.out.println("Senha invalida");
        }



    }
}
