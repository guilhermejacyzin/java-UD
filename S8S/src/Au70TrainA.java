import entities70a.Au70AProgram;

import java.util.Scanner;

public class Au70TrainA {
    public static void main(String[] args) {
        /*
        Aplicação - Molde Funcionário
         */

        Scanner input = new Scanner(System.in);

        Au70AProgram aProgram = new Au70AProgram();

        System.out.print("Nome: ");
        aProgram.nome = input.nextLine();

        System.out.print("Salário: ");
        aProgram.salario = input.nextDouble();

        System.out.print("Taxa: ");
        aProgram.taxa = input.nextDouble();

        System.out.printf("Dados de salário: %s, %.2f", aProgram.nome, aProgram.salarioPuro());

        System.out.println();

        System.out.print("Deseja acrescentar algo ao salário? Adicione: ");
        int salario = input.nextInt();
        aProgram.increaseSalary(salario);


//        System.out.println(aProgram.nome);
//        System.out.println(aProgram.salario);
//        System.out.println(aProgram.taxa);
//        System.out.println(aProgram.salarioPuro());
        System.out.println(aProgram.toString());


        input.close();
    }
}
