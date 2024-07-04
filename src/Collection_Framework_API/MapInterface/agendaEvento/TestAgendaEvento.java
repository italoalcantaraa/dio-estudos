package Collection_Framework_API.MapInterface.agendaEvento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestAgendaEvento {
    public static void main(String[] args) {
        AgendaEvento evento = new AgendaEvento();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        evento.adicionarEvento(LocalDate.parse("20/05/2025", formatter), "Evento 1", "Nome 1");
        
        evento.exibirEventos();
    }
}
