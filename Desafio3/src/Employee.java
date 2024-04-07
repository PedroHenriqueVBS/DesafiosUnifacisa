public class Employee {
    private String nome;
    private double salarioBruto;
    private final double taxa = 1.1;

    public Employee() {
    }

    public Employee(String nome, double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public String toString() {
        return
                "Nome= " + nome + ", Salario bruto= " + salarioBruto ;
    }
}
