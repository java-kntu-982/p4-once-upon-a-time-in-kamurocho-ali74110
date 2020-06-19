package ir.ac.kntu.model.soldiers;

import ir.ac.kntu.model.Coordinate;
import ir.ac.kntu.model.Movable;
import ir.ac.kntu.model.Warrior;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Soldier implements Movable {
    private Coordinate currentCoordinate;
    private Coordinate toGoCoordinate;
    private int speed;
    private String name;
    private int health;
    private int attack;
    private int fieldOfView;
    private int visionRatio;
    private int level;
    private boolean locked = false;
    private Rectangle healthRec;
    private Circle soldierShape;

    public Soldier(String name, int health, int attack,int visionRatio) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.visionRatio = visionRatio;
    }
    public Soldier(String name, int health, int attack,int fieldOfView,int visionRatio,boolean locked) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.fieldOfView = fieldOfView;
        this.visionRatio = visionRatio;
        this.locked = locked;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getFieldOfView() {
        return fieldOfView;
    }

    public int getVisionRatio() {
        return visionRatio;
    }

    public int getLevel() {
        return level;
    }

    public boolean isLocked() {
        return locked;
    }

    public Rectangle getHealthRec() {
        return healthRec;
    }

    public Circle getSoldierShape() {
        return soldierShape;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setFieldOfView(int fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public void setVisionRatio(int visionRatio) {
        this.visionRatio = visionRatio;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void setHealthRec(Rectangle healthRec) {
        this.healthRec = healthRec;
    }

    public void setSoldierShape(Circle soldierShape) { this.soldierShape = soldierShape; }

    public void setName(String name) { this.name = name; }

    public Coordinate getCurrentCoordinate() {
        return currentCoordinate;
    }

    public void setCurrentCoordinate(Coordinate currentCoordinate) {
        this.currentCoordinate = currentCoordinate;
    }

    public Coordinate getToGoCoordinate() {
        return toGoCoordinate;
    }

    public void setToGoCoordinate(Coordinate toGoCoordinate) {
        this.toGoCoordinate = toGoCoordinate;
    }

    @Override
    public void move() {
        double xMovement = (this.toGoCoordinate.x-this.currentCoordinate.x)/this.currentCoordinate.distance(this.toGoCoordinate);
        double yMovement = (this.toGoCoordinate.y-this.currentCoordinate.y)/this.currentCoordinate.distance(this.toGoCoordinate);
        this.currentCoordinate.x += xMovement;
        this.currentCoordinate.y += yMovement;
    }

}
