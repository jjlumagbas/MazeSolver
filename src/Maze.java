import java.util.ArrayList;
import java.util.List;

public class Maze {
  private Square[][] maze;
  private int rows;
  private int cols;

  public Maze(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    maze = new Square[rows][cols];
  }

  public void setRow(int i, String row) {
    // TODO given a string, initialize the ith row
  }

  public Square origin() throws Exception {
    // TODO find the origin 'o', and return it

    // throw exception if not found
    throw new Exception("origin not found");
  }

  public List<Square> neighbors(Square sq) {
    List<Square> neighbors = new ArrayList<>(4);
    // TODO collect all the neighbors of a square in a list
    // neighbors are adjacent squares that aren't walls
    // order is important! add to the list neighbors in this order:
    // - left
    // - up
    // - right
    // - down
    return neighbors;
  }

  public Square getSquare(int row, int col) {
    // TODO return a square given it's coordinates
    return null;
  }

  @Override
  public String toString() {
    String mazeStr = "";
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        mazeStr += maze[i][j].getType();
      }
      if (i < rows - 1) {
        mazeStr += "\n";
      }
    }
    return mazeStr;
  }

  public Maze clone() {
    Maze clone = new Maze(rows, cols);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        clone.maze[i][j] = maze[i][j].clone();
      }
    }
    return clone;
  }

}
