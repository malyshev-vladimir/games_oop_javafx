package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.RookBlack;

public class LogicTest {

    @Test (expected = OccupiedCellException.class)
    public void thenOccupiedCellExceptionInMove()
            throws OccupiedCellException, FigureNotFoundException {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.add(new RookBlack(Cell.E3));
            logic.move(Cell.C1, Cell.H6);
    }

    @Test (expected = FigureNotFoundException.class)
    public void thenFigureNotFoundExceptionInMove()
            throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C2, Cell.H6);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void thenImpossibleMoveExceptionInMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H3);
    }
}