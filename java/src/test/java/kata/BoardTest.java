package kata;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 *
 */
public class BoardTest {

    private Board board;

    @Before
    public void setUp() {
        this.board = new Board();
    }

    @Test
    public void a_board_has_two_living_cells() {
        this.board.addCell(new Cell(true));
        this.board.addCell(new Cell(true));

        List<Cell> cells = this.board.getLiveCells();
        assertThat(cells.size()).isEqualTo(2);
        for (Cell cell : cells) {
            assertThat(cell.isAlive()).isTrue();
        }
    }

    @Test
    public void a_board_provides_next_generation() {
        Cell survivingCell = new Cell(new Cell(true), new Cell(true));
        Cell dyingCell = new Cell(new Cell(true));
        this.board.addCell(survivingCell);
        this.board.addCell(dyingCell);

        List<Cell> cells = this.board.getLiveCells();
        List<Cell> nextCells = new ArrayList<Cell>();
        for (Cell cell : cells) {
            Cell next = cell.getNextGeneration();
            if( next.isAlive()) {
                nextCells.add(next);
            }
        }
        //Board nextGen = board.getNextGen();

        assertThat(nextCells.size()).isEqualTo(1);

    }
}
