package Collection_Framework_API.MapInterface.agendaEvento;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    Map<LocalDate, Evento> agendaEventoMap;
    
    public AgendaEvento() {
        agendaEventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nomeEvento, String nomeAtracao) {
        agendaEventoMap.put(date, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirEventos() {
        Map<LocalDate, Evento> ordenaEventoMap = new TreeMap<>(agendaEventoMap);
        System.out.println(ordenaEventoMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> ordenaEventoMap = new TreeMap<>(agendaEventoMap);
        System.out.println(ordenaEventoMap);

        for (var entryMap : ordenaEventoMap.keySet()) {
            if(entryMap.isAfter(dataAtual) || entryMap.isEqual(dataAtual)) {
                    System.out.println("Data: " + entryMap + ordenaEventoMap.get(entryMap));        
                break;
            }
        }
        }
}
