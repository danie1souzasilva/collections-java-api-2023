package main.java.OpBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    public ListTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListTarefas listaTarefa = new ListTarefas();


        System.out.println("O numero total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("TAREFA 1");
        listaTarefa.adicionarTarefa("TAREFA 2");
        listaTarefa.adicionarTarefa("TAREFA 1");

        System.out.println("O numero total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("TAREFA 1");

        System.out.println("O numero total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
