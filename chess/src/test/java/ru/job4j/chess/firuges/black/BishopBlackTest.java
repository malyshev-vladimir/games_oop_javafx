package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void testPositionFunction() {
        BishopBlack in = new BishopBlack(Cell.C8);
        Cell expected = Cell.C8;
        Cell out = in.position();
        assertEquals(expected, out);
    }

    @Test
    public void testCopyFunction() {
        BishopBlack in = new BishopBlack(Cell.C8);
        Cell out = in.copy(Cell.E6).position();
        Cell expected = Cell.E6;
        assertEquals(expected, out);
    }

    @Test
    public void testWayFunction() {
        BishopBlack in = new BishopBlack(Cell.C1);
        Cell[] out = in.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, out);
    }
}