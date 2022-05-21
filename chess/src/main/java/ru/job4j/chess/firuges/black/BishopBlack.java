package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int size = Math.abs(dest.getX() - position().getX());
        Cell[] steps = new Cell[size];
        int deltaX = ((dest.getX() - position().getX()) / size);
        int deltaY = ((dest.getY() - position().getY()) / size);
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(position().getX() + deltaX * (index + 1),
                    position().getY() + deltaY * (index + 1));
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        boolean result = false;
        if (Math.abs(source.getX() - dest.getX()) + 1 == Math.abs(source.getY() - dest.getY()) + 1) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
