import java.util.*;
public class basics{
    public static void main(String[] args){

    String[] item_names = {"Bread", "Milk","Butter", "Chips", "Honey", "Soap", 
    "Towel", "Carrots", "Beans", "Samp", "Dress", "Pants", "Shoes", "Socks"};

    Double[] item_prices = {15.50, 12.00, 56.00, 20.00, 45.00,
    7.00, 75.00, 8.00, 5.00, 12.00, 200.00, 150.00, 400.00, 25.00};

    System.out.println("");
    
    int count = 0, sum = 0;
    for (int i = 0; i < item_names.length; i++){
        System.out.println(item_names[i] + " - R" + item_prices[i]);
        sum += item_prices[i];
        count += 1;
    }

    double average = sum / count;
    System.out.println("The average price of all items is R" + average);

    Scanner temp = new Scanner(System.in);

    System.out.println("Item Look-up");
    System.out.println("What item are you looking for?");
    String items = temp.nextLine();

    boolean found = false;
    for (int i = 0; i < item_names.length; i++){
        if (item_names[i].equalsIgnoreCase(items)){
            System.out.println("The price of item " + items + " is R" + item_prices[i]);
            found = true;
            break;
        }
    }

    if (!found){
        System.out.println("Item " + items + " is not stocked in the shop.");
    }

    


}
}