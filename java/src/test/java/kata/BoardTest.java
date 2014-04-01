package kata;

import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 *
 */
public class BoardTest {

    @Test
    public void a_board_has_two_isolated_cells() {
        Board board = new Board();
        board.addCell(new Cell(true));
        board.addCell(new Cell(true));

        List<Cell> cells = board.getLiveCells();
        assertThat(cells.size()).isEqualTo(2);
    }
}
