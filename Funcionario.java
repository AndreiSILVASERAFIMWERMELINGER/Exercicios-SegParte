package separados;

public class Funcionario {

    protected String nome;
    protected Double salario;

    public Funcionario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    protected Double getBonificacaoNatalina(){

        return this.getSalario() * 0.1;
    }


    public void mostraDados(){

        System.out.println("Nome: "+ getNome());
        System.out.println("Salario: "+ getSalario());
        System.out.println("Bonidicação: "+ getBonificacaoNatalina());


    }


}
