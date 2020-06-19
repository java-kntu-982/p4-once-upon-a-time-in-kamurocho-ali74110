package ir.ac.kntu.model.game;

import ir.ac.kntu.model.Coordinate;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class HQ extends Coordinate {
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

    public static HQ createHQ1(){
        Rectangle rectangle = new Rectangle(70,20);
        Rectangle rectangle2 = new Rectangle(4,10);
        rectangle2.setFill(Color.GREEN);
        HQ hq = new HQ("Container",3000,rectangle,rectangle2,1);
        return hq;
    }
    public static HQ createHQ2(){
        Circle circle = new Circle(40);
        Rectangle rectangle2 = new Rectangle(4,10);
        rectangle2.setFill(Color.GREEN);
        HQ hq = new HQ("van",6000,circle,rectangle2,1);
        return hq;
    }
    public static HQ createHQ3(){
        Rectangle rectangle = new Rectangle(50,50);
        Rectangle rectangle2 = new Rectangle(4,10);
        rectangle2.setFill(Color.GREEN);
        HQ hq = new HQ("Truck",5000,rectangle,rectangle2,1);
        return hq;
    }
}
