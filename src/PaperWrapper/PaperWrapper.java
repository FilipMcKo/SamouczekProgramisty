package PaperWrapper;

import java.io.*;

/**
 * @author fmucko
 */
public class PaperWrapper {
    public int amountOfPaper(String dimensions) {
        String[] dims = dimensions.split("x");
        int dimA = Integer.parseInt(dims[0]);
        int dimB = Integer.parseInt(dims[1]);
        int dimC = Integer.parseInt(dims[2]);

        int minAmount = 2 * dimA * dimB + 2 * dimA * dimC + 2 * dimB * dimC;
        int safeAmount = minAmount + Integer.min(dimA * dimB, Integer.min(dimA * dimC, dimB * dimC));

        return safeAmount;
    }

    public int totalAmountOfPaper(String nameOfStock) {
        int totalAmount = 0;
        String singleStock;
        File file = new File(nameOfStock);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((singleStock = br.readLine()) != null) {
                totalAmount += this.amountOfPaper(singleStock);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        PaperWrapper paperWrapper = new PaperWrapper();
        System.out.println(paperWrapper.totalAmountOfPaper("PaperStock"));
    }
}
