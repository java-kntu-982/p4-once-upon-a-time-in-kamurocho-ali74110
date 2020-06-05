package ir.ac.kntu;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class HQ {
    private String name;
    private int health;
    private Shape HQShape;
    private Rectangle healthRec;
    private int level;

    public HQ(String name, int health, Shape HQShape , Rectangle healthRec , int level) {
        this.name = name;
        this.health = health;
        this.HQShape = HQShape;
        this.level = level;
        this.healthRec = healthRec;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Shape getHQShape() {
        return HQShape;
    }

    public void setHQShape(Shape HQShape) {
        this.HQShape = HQShape;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }
}
