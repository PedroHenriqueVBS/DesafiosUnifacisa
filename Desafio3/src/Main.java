import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee funcionario1 = new Employee();
        Employee funcionario2 = new Employee();
        EmployeeService service = new EmployeeService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Funcionario 1 digite nome");
        funcionario1.setNome(scanner.next());
        System.out.println("Funcionario 1 digite seu salario bruto");
        funcionario1.setSalarioBruto(scanner.nextDouble());
        System.out.println(funcionario1.toString());
        service.obterSalarioLiquido(funcionario1);

        System.out.println("Funcionario 2 digite nome");
        funcionario2.setNome(scanner.next());
        System.out.println("Funcionario 2 digite seu salario bruto");
        funcionario2.setSalarioBruto(scanner.nextDouble());
        System.out.println(funcionario2.toString());


        System.out.println("O funcionario 2 recebeu um aumento!");
        service.aumentoSalario(funcionario2);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());

    }
}