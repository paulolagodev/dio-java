package edu.paulo.Collections.OperacoesBasicas.Tarefa;


import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo que cria uma lista
    private List<Tarefa> tarefaList;

    // Constructor that match name of the public class and don´t have any return cause he just initialize the objects
    public ListaTarefa(){
        //initialize arrayList called tarefaList
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa( String descricao){
        //add a new "tarefa" by "descricao"
        tarefaList.add( new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        // other List that has ArrayList called "tarefasParaRemover" to remove equals "tarefas" 
        List <Tarefa> tarefasParaRemover = new ArrayList<>();

        //declaration for each to get equals descriptions don´t matter if the case are different, like "Hello" or "heLlo" or "HELLO". The equalsIgonoreCase do that.
        for( Tarefa t: tarefaList){
            if ( t.getDescricao().equalsIgnoreCase(descricao)){
                //add "tarefas" who has 
                tarefasParaRemover.add(t); 
            }
        } 
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        
        System.out.println("O numero total de elemento na lista é: "+ listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        System.out.println("O numero total de elemento na lista é: "+ listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("O numero total de elemento na lista é: "+ listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
