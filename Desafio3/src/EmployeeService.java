public class EmployeeService {

    //Metodo para calcular salario liquido
    public void obterSalarioLiquido(Employee employee){
        int descontoInss = 200;
        double salarioLiquido = employee.getSalarioBruto() - descontoInss;
        System.out.println(employee.getNome() + " seu salario liquido eh: " + salarioLiquido);
    }
    //Metodo que aumenta o salario em 10%
    public void aumentoSalario(Employee employee){
        double aumento = employee.getSalarioBruto() * employee.getTaxa();
        double novoSalarioBruto = aumento;

        employee.setSalarioBruto(novoSalarioBruto);  // Atualizando o salário bruto do funcionario

        System.out.println(employee.getNome() + " seu salario agora eh: " + novoSalarioBruto);
    }
}
