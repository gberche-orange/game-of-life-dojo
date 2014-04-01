package kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class Cell {

    private final ArrayList<Cell> cells;
    private boolean isAlive;

    public Cell() {
        this(true);
    }

    public Cell(boolean isAlive) {
        this.isAlive = isAlive;
        cells = new ArrayList<Cell>();
    }

    public Cell(Cell... cells) {
        this(true);
        Collections.addAll(this.cells, cells);
    }

    public List<Cell> getNeighbours() {
        return this.cells;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
