import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ContaService contaService = new ContaService();
        Conta conta = new Conta();


        ImprimirUtil.exibirMensagem("Bem vindo ao banco");
        conta.setNumero(Integer.parseInt(ImprimirUtil.entradaDoUsuario(conta,"Insira o número da conta")));
        conta.setNomeTitular(ImprimirUtil.entradaDoUsuario(conta, "Insira o titular da conta"));
        ImprimirUtil.exibirConfirmacao(conta, contaService);

        ImprimirUtil.exibirMensagem("Dados da conta: " + conta.toString());

        contaService.depositar(conta, Double.parseDouble(ImprimirUtil.entradaDoUsuario("Digite o valor do deposito")));

        ImprimirUtil.exibirMensagem("Dados da conta atualizados: " + conta.toString());

        contaService.sacar(conta, Double.parseDouble(ImprimirUtil.entradaDoUsuario("Digite o valor de saque")));

        ImprimirUtil.exibirMensagem("Dados da conta atualizados: " +conta.toString());

    }




}
