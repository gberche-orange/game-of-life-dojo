package kata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Cell {

    private final ArrayList<Cell> cells;

    public Cell() {
        cells = new ArrayList<Cell>();
    }

    public List<Cell> getNeighbours() {
        cells.add(new Cell());
        return this.cells;
    }
}
