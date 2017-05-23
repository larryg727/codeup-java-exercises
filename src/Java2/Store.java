package Java2;

/**
 * Created by larryg on 5/23/17.
 */
public class Store {

    public static void menu(Receipt userReceipt, double total) {

        Input userInput = new Input();

        int userSelection = userInput.getInt(1, 3, "Please select an option:\n1.Sale\n2.Print receipt\n3.Exit ");
        boolean anotherItem;
        if (userSelection == 1) {
            do {
                Product item = new Product();
                userInput.getString();
                item.setItem(userInput.getString("What is the item's name?"));
                item.setQuantity(userInput.getInt("How many would you like?"));
                item.setPrice(userInput.getDouble("How much is it?"));

                userReceipt.addLine(item.getItem(), item.getQuantity(), item.getPrice());
                total += item.getPrice();
                anotherItem = userInput.yesNo("Would you like to add another item? y/n");
            } while (anotherItem);
                menu(userReceipt, total);
        } else if (userSelection == 2) {
            System.out.println(printReceipt(userReceipt, total));
            menu(userReceipt, total);
        } else {
            System.exit(0);
        }
    }

    public static String printReceipt(Receipt userReceipt, double total){
        String receipt = "\n----------------------------------\n" +
                "\n Thank you for your business!\n";
        for (String line : userReceipt.getReceiptItems()){
            receipt += line;
        }
        receipt += "\n\nTotal: $" + String.format("%.2f", total);
        receipt += "\n\n----------------------------------\n";
        return receipt;

    }

    public static void main(String[] args) {
        Receipt userReceipt = new Receipt();
        double total = 0;
        System.out.println("Welcome to the Codeup Store.");
        menu(userReceipt, total);

        }
    }


