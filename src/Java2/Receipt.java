package Java2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by larryg on 5/23/17.
 */
public class Receipt {


    private List<String> receiptItems = new ArrayList<>();


    public void addLine(String name, int quantity, double price){
        String receiptLine = String.format("\n%-3d|| %-14s|| %-8.2f each", quantity, name, price);
        this.receiptItems.add(receiptLine);
    }

    public List<String> getReceiptItems() {
        return receiptItems;
    }

    public void setReceiptItems(List<String> receiptItems) {
        this.receiptItems = receiptItems;
    }
}
