import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {


        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        if (numero > 0){
            JOptionPane.showMessageDialog(null,"Número positivo");

        } else if (numero < 0){
            JOptionPane.showMessageDialog(null,"Número negativo");

        } else {
            JOptionPane.showMessageDialog(null,"Número neutro");
        }
    }



}