package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    void position() {
        /*
        Создайте объект и вызовите у него метод position.
        Проверьте, что он занимает ту же ячейку, что и при создании объекта.
         */
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell position = bishopBlack.position();
        assertThat(position).isEqualTo(Cell.D4);
    }

    @Test
    void copy() {
        /*
        Создайте объект и вызовите у него метод copy.
        Проверьте, что, возвращенный объект имеет правильную позицию.
         */
       BishopBlack bishopBlack = new BishopBlack(Cell.D4);
       Figure copyBishopBlack = bishopBlack.copy(Cell.D8);
       assertThat(copyBishopBlack.position()).isEqualTo(Cell.D8);

    }
}