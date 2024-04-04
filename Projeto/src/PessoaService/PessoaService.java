package PessoaService;
import Domain.Pessoa;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class PessoaService {

    public <pessoaHashMap> void adicionarOuEditar(HashMap<Integer, Pessoa> pessoaHashMap, Pessoa pessoa){
        pessoaHashMap.put(pessoa.getCpf(), pessoa);
    }

    public void listarTodos(HashMap<Integer, Pessoa> pessoaHashMap, int cpf){
        String texto ="";
        for(Map.Entry<Integer, Pessoa> pessoa : pessoaHashMap.entrySet()){
            texto += "CPF: " + pessoa.getKey() + ", NOME: " + pessoa.getValue().getNome() + ", IDADE: " + pessoa.getValue();
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public Pessoa buscarPorCpf(HashMap<Integer, Pessoa> pessoaHashMap, int cpf){
        return pessoaHashMap.get(cpf);
    }

    public void remover(){

    }

}
