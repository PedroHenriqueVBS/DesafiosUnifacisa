import javax.swing.*;

public class ImprimirUtil {

    //metodo que captura a mensagem
    public static String entradaDoUsuario(Conta conta, String mensagem){
       return JOptionPane.showInputDialog(null, mensagem);
    }
    public static String entradaDoUsuario(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }

    //metodo que exibe a mensagem
    public static void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }

    //metodo que exibe confirmação
    public static void exibirConfirmacao(Conta conta,ContaService contaService) {
        double resposta = JOptionPane.showConfirmDialog(null, "Existe deposito inicial?","Deposito", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resposta == JOptionPane.YES_OPTION){
           double valor = (Double.parseDouble(entradaDoUsuario(conta,"Insira o valor do deposito")));
           contaService.depositar(conta, valor);
        }

    }


}
