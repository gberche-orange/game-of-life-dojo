package kata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Cell {

    private final ArrayList<Cell> cells;
    private boolean isAlive;

    public Cell() {
        cells = new ArrayList<Cell>();
        isAlive = true;
    }

    public Cell(boolean isAlive) {
        this.isAlive = isAlive;
        cells = new ArrayList<Cell>();
    }

    public List<Cell> getNeighbours() {
        cells.add(new Cell());
        return this.cells;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
