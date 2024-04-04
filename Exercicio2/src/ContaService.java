public class ContaService {


    public void depositar(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        saldoAtual = quantia;
        conta.setSaldo(saldoAtual);
    }
    public void sacar(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        saldoAtual -= quantia + 5;
        conta.setSaldo(saldoAtual);
    }
}
