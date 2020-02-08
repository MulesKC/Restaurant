package restaurant;

import java.time.LocalDate;

public class MenuItem {
        private final String itemName;
        private final Double price;
        private final String description;
        private Category category;
        private LocalDate dateCreated;
        boolean newStatus;

        MenuItem(String itemName, Double price, String description, Category category) {
            this.itemName = itemName;
            this.price = price;
            this.description = description;
            this.category = category;
            this.dateCreated = LocalDate.now();
            this.newStatus = true;
        }

    public String getItemName() {return itemName;}

    public Double getPrice() {return price;}

    public String getDescription() {return description;}

    public Category getCategory() {return category;}

    public LocalDate getDateCreated() {return dateCreated;}

    public boolean isItemNew() {return newStatus;}

    public void updateNewStatus() {

            LocalDate now = LocalDate.now();

            //sets "new" to be 30 days
            LocalDate notNewDate = this.dateCreated.plusDays(30);

            if (now.isAfter(notNewDate)) {
                this.newStatus = false;
            }
    }

    }