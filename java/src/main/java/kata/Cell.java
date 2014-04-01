package kata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Cell {
    public List<Cell> getNeighbours() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell());
        return cells;
    }
}
