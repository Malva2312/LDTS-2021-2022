import BoardComponents.Board;
import BoardElements.Block;
import DrawingMethods.DrawingBlock;
import DrawingMethods.DrawingImage;
import Structures.ColliderBox;
import Structures.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    @Test
    public void BoardCreationTest() {
        Board testBoard = new Board(
                "000000000000000000" +
                        "0  111000000111  0" +
                        "0 01110000001110 0" +
                        "010000000000000010" +
                        "01  1  1111  1  10" +
                        "01011100  00111010" +
                        "0  1110    0111  0" +
                        "0  1110    0111  0" +
                        "0  1110    0111  0" +
                        "0  1110    0111  0" +
                        "01011100  00111010" +
                        "01  1  1111  1  10" +
                        "010000000000000010" +
                        "0 01110000001110 0" +
                        "0  111000000111  0" +
                        "000000000000000000");

        DrawingImage dImage = new DrawingImage(new DrawingBlock[]{
                new DrawingBlock(new Position(0,0), 3, 3, "#ffffff", "#000000", '#')
        });
        Block testBlock = new Block(new Position(3, 1), testBoard, dImage, new ColliderBox[]{
                new ColliderBox(new Position(0, 0), 3, 3)}, true);

        assertEquals(testBlock, testBoard.getBoard().get(19));

    }
}
