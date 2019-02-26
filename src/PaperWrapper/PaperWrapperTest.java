package PaperWrapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author fmucko
 */
class PaperWrapperTest {

    @Test
    void testAmountOfPaper(){
        PaperWrapper paperWrapper = new PaperWrapper();
        assertEquals(58, paperWrapper.amountOfPaper("2x3x4"));
        assertEquals(43, paperWrapper.amountOfPaper("1x1x10"));
    }

    @Test
    void testTotalAmountOfPaper(){
        PaperWrapper paperWrapper = new PaperWrapper();
        assertEquals(101, paperWrapper.totalAmountOfPaper("TestStock1"));
        assertEquals(245, paperWrapper.totalAmountOfPaper("TestStock2"));
    }

}