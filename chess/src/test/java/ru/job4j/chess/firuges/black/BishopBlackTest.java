package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void testBishopBlackPosition() {
        BishopBlack newFigure = new BishopBlack(Cell.A1);
        assertThat(newFigure.position(), is(Cell.A1));
    }

    @Test
    public void testBishopBlackCopy() {
        BishopBlack newFigure = new BishopBlack(Cell.B2);
        Figure afterRemoval = newFigure.copy(Cell.B2);
        assertThat(newFigure.position(), is(afterRemoval.position()));
    }

    @Test
    public void testBishopBlackWay() {
        BishopBlack newFigure = new BishopBlack(Cell.C1);
        Cell[] testStep = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(testStep, is(newFigure.way(Cell.G5)));
    }

    @Test
    public void testBishopBlackDiagonal() {
        BishopBlack newFigure = new BishopBlack(Cell.C1);
        newFigure.way(Cell.G5);
    }
}