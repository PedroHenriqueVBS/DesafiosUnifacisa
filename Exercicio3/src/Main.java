import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("LISTA DE TAREFAS");
        ArrayList<Tarefas> tarefas = new ArrayList<>();

        System.out.println("""
                Menu:
                1. Adicionar Tarefa
                2. Visualizar Tarefas
                3. Remover Tarefa
                4. Sair""");

        int menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
        while (menu != 4) {
            if (menu == 1) {
                Tarefas tarefa = new Tarefas();
                tarefa.setNome(JOptionPane.showInputDialog(null, "Nome da tarefa"));
                tarefa.setDescricao(JOptionPane.showInputDialog(null, "Descrição da tarefa"));

                tarefas.add(tarefa);

                menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
            }
            if (menu == 2) {
                if (tarefas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma tarefa disponível.");
                } else {
                    Object[] tarefasArray = tarefas.toArray();
                    Tarefas tarefaSelecionada = (Tarefas) JOptionPane.showInputDialog(null,
                            "Selecione uma tarefa", "Tarefas",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            tarefasArray, tarefasArray[0]);
                    if (tarefaSelecionada != null) {
                        JOptionPane.showMessageDialog(null, "Nome: " + tarefaSelecionada.getNome() +
                                "\nDescrição: " + tarefaSelecionada.getDescricao());
                    }
                }
                menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
            }
            if (menu == 3) {
                if (tarefas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma tarefa disponível para remover.");
                } else {
                    String[] nomesTarefas = new String[tarefas.size()];
                    for (int i = 0; i < tarefas.size(); i++) {
                        nomesTarefas[i] = tarefas.get(i).getNome();
                    }

                    String tarefaRemover = (String) JOptionPane.showInputDialog(null,
                            "Qual tarefa você deseja remover?", "Remover Tarefa",
                            JOptionPane.QUESTION_MESSAGE, null,
                            nomesTarefas, nomesTarefas[0]);

                    if (tarefaRemover != null) {
                        for (int i = 0; i < tarefas.size(); i++) {
                            if (tarefas.get(i).getNome().equals(tarefaRemover)) {
                                tarefas.remove(i);
                                JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso.");
                                break;
                            }
                        }
                    }
                }
                menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "));
            }
        }
    }
}

