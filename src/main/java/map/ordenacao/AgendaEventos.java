package main.java.map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dataSet = eventoMap.keySet();
        Collection<Evento> valores = eventoMap.values();*/

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: " + entry.getValue() + "acessará a data " + entry.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate
                .of(2023,10,31), "Festa do peão ", "Luan Santana");
        agenda.exibirAgenda();

    }
}
