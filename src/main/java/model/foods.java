package model;

public class foods {
   private int id;
   private String foodItem;

    public foods(int id, String foodItem) {
        this.id = id;
        this.foodItem = foodItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }
}
