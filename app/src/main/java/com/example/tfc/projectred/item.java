package com.example.tfc.projectred;

public class item {

    int background;
    String foodTitle;
    int nbFollowers;



    public item(int background, String foodTitle, int nbFollowers) {
        this.background = background;
        this.foodTitle = foodTitle;
        this.nbFollowers = nbFollowers;
    }

    public int getBackground() {
        return background;
    }

    public String getFoodTitle() {
        return foodTitle;
    }

    public int getNbFollowers() {
        return nbFollowers;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setFoodTitle(String foodTitle) {
        this.foodTitle = foodTitle;
    }

    public void setNbFollowers(int nbFollowers) {
        this.nbFollowers = nbFollowers;
    }
}
