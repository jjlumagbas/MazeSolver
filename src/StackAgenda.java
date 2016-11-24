import java.util.Stack;

public class StackAgenda extends Agenda {
  private Stack<Square> stack;

  public StackAgenda() {
    super(StackAgenda.class);
    stack = new Stack<>();
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
