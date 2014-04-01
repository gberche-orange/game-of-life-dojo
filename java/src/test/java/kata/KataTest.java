package kata;

import org.junit.Test;

import java.util.ArrayList;
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
    public void a_cell_can_be_alive() {
        Cell cell = new Cell(true);
        assertThat(cell.isAlive()).isTrue();
    }
    @Test
    public void a_cell_can_be_dead() {
        Cell cell = new Cell(false);
        assertThat(cell.isAlive()).isFalse();
    }

    @Test
    public void a_cell_has_live_neighbours() {
        Cell aCell = new Cell();
        List<Cell> neighbors = aCell.getNeighbours();
        List<Cell> liveNeighbors = new ArrayList<Cell>();

        for (Cell neighbor : neighbors) {
            if (neighbor.isAlive()) {
                liveNeighbors.add(neighbor);
            }
        }


        assertThat(liveNeighbors).isNotEmpty();

    }

}
