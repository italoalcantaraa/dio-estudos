package Collection_Framework_API.MapInterface.agendaEvento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestAgendaEvento {
    public static void main(String[] args) {
        AgendaEvento evento = new AgendaEvento();
        
        evento.adicionarEvento(LocalDate.of(2025, 5, 12), "Evento 1", "Nome 1");
        evento.adicionarEvento(LocalDate.of(2024, 2, 02), "Evento 2", "Nome 2");
        evento.adicionarEvento(LocalDate.of(2024,7, 5), "Evento 3", "Nome 3");
        evento.adicionarEvento(LocalDate.of(2026, 12, 22), "Evento 4", "Nome 4");
        
        evento.exibirEventos();
        System.out.println("* Proximo evento *");
        evento.obterProximoEvento();
    }
}
