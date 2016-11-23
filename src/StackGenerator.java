public class StackGenerator implements AgendaGenerator {
  @Override
  public Agenda newAgenda() {
    return new StackAgenda();
  }
}
