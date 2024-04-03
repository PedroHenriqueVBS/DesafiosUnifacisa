import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("LISTA DE TAREFAS");
        ArrayList<String> tarefa = new ArrayList<>();
        Tarefas tarefas = new Tarefas();

        System.out.println("""
                Menu:
                1. Adicionar Tarefa
                2. Visualizar Tarefas
                3. Remover Tarefas
                4. Sair""");

        int menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
        while (menu != 4){
            if(menu == 1){
                tarefas.setNome(JOptionPane.showInputDialog(null, "Nome da tarefa"));
                tarefas.setDescricao(JOptionPane.showInputDialog(null, "Descrição da tarefa"));

                tarefa.add("Nome: "+ tarefas.getNome(tarefas.nome) + " Descrição: "+ tarefas.getDescricao(tarefas.descricao));
                //JOptionPane.showMessageDialog(null, tarefa );
                menu = 0;
                menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
            }
            if(menu == 2){
                //for (int i = 0; i <= tarefa.size(); i++) {
                //Object[] possibleValues = { "First", "Second", "Third" };

                Object selectedValue = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        tarefa, tarefa.get(0));



                menu= 0;
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
                }
            }
            if(menu == 3){
                JOptionPane.showInputDialog("Qual tarefa você deseja remover?");



            }
        }

    }
}