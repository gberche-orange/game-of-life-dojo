package kata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Board {

    private final ArrayList<Cell> cells;

    public Board() {
        cells = new ArrayList<Cell>();
    }

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    public List<Cell> getLiveCells() {
        return cells;
    }
}
