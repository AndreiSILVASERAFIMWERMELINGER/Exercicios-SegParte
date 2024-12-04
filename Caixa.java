package separados;

public class Caixa extends Funcionario {

    private int NumeroDoGuiche;
    public Caixa(){}

    public  void setNumeroDoGuiche (int numeroDoGuiche){
        this.NumeroDoGuiche = numeroDoGuiche;
    }

    public int getNumeroDoGuiche (){
        return this.NumeroDoGuiche;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
    }
}
