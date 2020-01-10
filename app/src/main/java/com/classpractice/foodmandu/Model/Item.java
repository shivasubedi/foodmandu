package com.classpractice.foodmandu.Model;


public class Item {

    private String itemname;
    private int price;
    private String detail;
    private String item_category;
    private String image;
    private String resturant;

    public Item(String itemname, int price, String detail, String item_category, String image, String resturant) {
        this.itemname = itemname;
        this.price = price;
        this.detail = detail;
        this.item_category = item_category;
        this.image = image;
        this.resturant = resturant;
    }

    public String getItemName() {
        return itemname;
    }

    public void setItemName(String itemname) {
        this.itemname = itemname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getItem_category() {
        return item_category;
    }

    public void setItem_category(String item_category) {
        this.item_category = item_category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getResturant() {
        return resturant;
    }

    public void setResturant(String resturant) {
        this.resturant = resturant;
    }
}

