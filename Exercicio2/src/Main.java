import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        DiasSemana dias = new DiasSemana();
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dígite o número do dia da semana"));

        switch (dia){
            case 1:
                JOptionPane.showMessageDialog(null, dias.dia1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, dias.dia2);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, dias.dia3);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, dias.dia4);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, dias.dia5);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, dias.dia6);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, dias.dia7);
        }
    }
}