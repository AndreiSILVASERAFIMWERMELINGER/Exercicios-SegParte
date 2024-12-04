package separados;

public class Gerente extends Funcionario {


    private String senha;

    ;

    public boolean verifica (){
        boolean senhaValida = false;

        if(this.senha == "password123"){
            senhaValida = true;
        }
        return  senhaValida;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    protected Double getBonificacaoNatalina() {
        return getSalario() * 0.30;
    }
}
