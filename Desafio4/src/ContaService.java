public class ContaService {

    //metodo para adicionar valor ao saldo
    public void depositar(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        saldoAtual += quantia;
        conta.setSaldo(saldoAtual);
    }

    //metodo para retirar valor do saldo
    public void sacar(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        saldoAtual -= quantia + 5;
        conta.setSaldo(saldoAtual);
    }
}
