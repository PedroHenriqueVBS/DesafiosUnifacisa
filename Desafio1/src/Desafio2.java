import javax.swing.*;

public class Desafio2 {

    public static void main(String[] args) {
        DiasSemana dias = new DiasSemana();
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dígite o número do dia da semana"));

        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, dias.DOMINGO);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, dias.SEGUNDA);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, dias.TERÇA);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, dias.QUARTA);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, dias.QUINTA);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, dias.SEXTA);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, dias.SÁBADO);
        }
    }
}

