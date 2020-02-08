package restaurant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static restaurant.Category.*;

public class Menu {
    List<MenuItem> mainMenu = new ArrayList<>();
    LocalDate currentTimestamp;


    public void addItem(MenuItem item) {
        boolean alreadyInMenu = false;
//        System.out.println(item.getItemName());
        for (MenuItem entry : mainMenu) {
            if (entry.getItemName() == item.getItemName()) {
                alreadyInMenu = true;
                System.out.println("Item with that name is already on menu! Please make a new name for your item.");
            }
        }
        if (!alreadyInMenu) {
            mainMenu.add(item);
            this.updateMenuTime();

        }
    }

    public void deleteItem(MenuItem itemNameToDelete) {
        boolean shouldDelete = false;
        for (MenuItem entry : mainMenu) {
//            System.out.println(entry.getItemName());
            if (entry.getItemName() == itemNameToDelete.getItemName()) {
                shouldDelete = true;
            }
        }
        if (shouldDelete = true) {
            mainMenu.remove(itemNameToDelete);
            this.updateMenuTime();
        }
    }


    private void updateMenuTime() {
        this.currentTimestamp = LocalDate.now();
    }

    public void printMenu() {
        printCategory(Appetizer);
        printCategory(MainCourse);
        printCategory(Dessert);

        System.out.println("Menu Updated: " + currentTimestamp + "\n\n");
    }

    public void printMenuItem(MenuItem item) {
        item.updateNewStatus();
        System.out.println("********************\n" +
                item.getItemName() + "\n" +
                item.getDescription() + "\n" +
                "$" + item.getPrice() + "\n" +
                "item added on: " + item.getDateCreated());
        if (item.newStatus) {
            System.out.println("**NEW item!!**");
        }
        System.out.println("********************\n");
    }

    public void printCategory(Category curCategory) {
        for (MenuItem entry : mainMenu) {
            entry.updateNewStatus();
            if (entry.getCategory() == curCategory) {
                System.out.println("********************\n" +
                        entry.getItemName() + "\n" +
                        entry.getDescription() + "\n" +
                        "$" + entry.getPrice() + "\n");
                if (entry.newStatus) {
                    System.out.println("**NEW item!!**");
                }
                System.out.println("********************\n");
            }
        }
    }



}
