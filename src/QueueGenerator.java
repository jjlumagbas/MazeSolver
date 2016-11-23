public class QueueGenerator implements AgendaGenerator {
  @Override
  public Agenda newAgenda() {
    return new QueueAgenda();
  }
}
