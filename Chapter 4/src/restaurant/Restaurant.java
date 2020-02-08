package restaurant;


import static restaurant.Category.*;

public class Restaurant {
    public static void main(String[] args) {
        Menu test = new Menu();

        MenuItem burger = new MenuItem("Cheeseburger", 4.50, "Delicious flame-broiled patty with fresh Cheddar cheese", MainCourse);
        MenuItem chickenSandwich = new MenuItem("Chicken Sandwich", 5.0, "Tasty fried chicken breast with Pepper Jack cheese", MainCourse);
        MenuItem tots = new MenuItem("Tator Tots", 2.5, "Crispy tots smothered in nacho cheese", Appetizer);
        MenuItem iceCream = new MenuItem("Ice Cream", 2.5, "Chocolate of Vanilla ice cream in a cone or cup", Dessert);


        test.addItem(burger);
        test.addItem(chickenSandwich);
        test.addItem(tots);
        test.addItem(iceCream);
        test.addItem(burger);

        test.printMenu();
        System.out.println("\nsingle item\n");
        test.printMenuItem(burger);

        test.deleteItem(burger);
        System.out.println("\nafter deleting\n");
        test.printMenu();
    }
}
