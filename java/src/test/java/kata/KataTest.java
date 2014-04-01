package kata;

import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class KataTest {

    @Test
    public void any_cell_has_some_neighbours() {
        Cell aCell = new Cell();
        List<Cell> neighbors = aCell.getNeighbours();

        assertThat(neighbors).isNotEmpty();
    }

    @Test
    public void a_cell_has_live_neighbours() {
        Cell aCell = new Cell();
        List<Cell> neighbors = aCell.getNeighbours();

        assertThat(neighbors).isNotEmpty();

    }

}
