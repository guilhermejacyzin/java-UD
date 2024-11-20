import java.util.Locale;
import java.util.Scanner;

public class Au29Train04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nomeFuncionario;
        int numeroFuncionario, horasTrabalhadas;
        double valorHorasTrabalhadas;

        System.out.println("Digite o nome do funcionário");
        nomeFuncionario = input.nextLine();

        System.out.println("Digite o número do funcionário");
        numeroFuncionario = input.nextInt();

        System.out.println("Digite o número de horas trabalhadas");
        horasTrabalhadas = input.nextInt();

        System.out.println("Digite o valor por hora trabalhada");
        valorHorasTrabalhadas = input.nextDouble();

        double salary;
        salary = horasTrabalhadas * valorHorasTrabalhadas;

        System.out.println("Funcionário: " + nomeFuncionario);
        System.out.println("Number: " + numeroFuncionario);
        System.out.printf("Salary: %.2f%n", salary);
//        System.out.println("Horas trabalhadas: " + salary);

        input.close();

    }
}
