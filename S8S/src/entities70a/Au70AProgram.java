package entities70a;

public class Au70AProgram {

    public String nome;
    public double salario;
    public double taxa;

    public void increaseSalary(double percentage) {
        salario += salario * percentage / 100;
    }

    public double salarioPuro() {
        return salario - taxa;
    }

    public String toString () {
        return "Updated data: " + nome + ", R$ " + salarioPuro() ;
    }


}




