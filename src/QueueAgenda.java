import java.util.LinkedList;
import java.util.Queue;

public class QueueAgenda implements Agenda {
  private Queue<Square> queue;

  public QueueAgenda() {
    queue = new LinkedList<>();
  }

  @Override
  public void add(Square s) {
    // TODO
  }

  @Override
  public Square remove() {
    // TODO
    return null;
  }

  @Override
  public int size() {
    // TODO
    return 0;
  }
}
