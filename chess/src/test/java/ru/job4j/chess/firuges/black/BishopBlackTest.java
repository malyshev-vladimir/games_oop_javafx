package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        BishopBlack in = new BishopBlack(Cell.C8);
        Cell expected = Cell.C8;
        Cell out = in.position();
        assertEquals(expected, out);
    }

    @Test
    public void testCopy() {
        Figure in = new BishopBlack(Cell.C8);
        Cell out = in.copy(Cell.E6).position();
        Cell expected = Cell.E6;
        assertEquals(expected, out);
    }
}