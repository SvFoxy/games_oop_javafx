package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {
    @Test
    void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell position = bishopBlack.position();
        assertThat(position).isEqualTo(Cell.D4);
    }

    @Test
    void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Figure copyBishopBlack = bishopBlack.copy(Cell.D8);
        assertThat(copyBishopBlack.position()).isEqualTo(Cell.D8);
    }

    @Test
    void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cellNew = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(cellNew).isEqualTo(bishopBlack.way(Cell.G5));
    }
}
