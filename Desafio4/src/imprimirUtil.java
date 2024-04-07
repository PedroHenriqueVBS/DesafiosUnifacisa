import javax.swing.*;

public class imprimirUtil {
    public static void entradaDoUsuario(String mensagem){
        JOptionPane.showInputDialog(null, mensagem);
    }
    public static void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(mensagem);
    }
}
