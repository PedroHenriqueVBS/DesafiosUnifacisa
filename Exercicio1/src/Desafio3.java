import javax.swing.*;

public class Desafio3 {
    public static void main(String[] args) {
        //ESTRUTURA DE REPETIÇÃO FOR
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dgite um número para contar"));
        for (int i = 0; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, i);;
        }

        //ESTRUTURA DE REPETIÇÃO WHILE

        int controle = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Dgite um número para contar"));
        while ( controle <= num){
            JOptionPane.showMessageDialog(null, controle);
            controle++;

        }
        //ESTRUTURA DE REPETIÇÃO DO WHILE

        int teste = 0;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Dgite um número para contar"));
        do{
            JOptionPane.showMessageDialog(null, teste);
            teste++;
        }while (teste <= num1);


    }
}
