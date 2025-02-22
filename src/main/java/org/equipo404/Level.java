package org.equipo404;

public class Level {
    private String levelName;
    private double price;

    public Level(String levelName, double price) {
        this.levelName = levelName;
        this.price = price;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
