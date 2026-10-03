public class basics{
    public static void main(String[] args){

    String[] item_names = {"Bread", "Milk","Butter", "Chips", "Honey", "Soap", 
    "Towel", "Carrots", "Beans", "Samp", "Dress", "Pants", "Shoes", "Socks"};

    Double[] item_prices = {15.50, 12.00, 56.00, 20.00, 45.00,
    7.00, 75.00, 8.00, 5.00, 12.00, 200.00, 150.00, 400.00, 25.00};

    System.out.println("");

    for (int i = 0; i < item_names.length; i++){
        System.out.println(item_names[i] + " - R" + item_prices[i]);
    }


}
}