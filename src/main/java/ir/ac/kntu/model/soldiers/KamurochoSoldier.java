package ir.ac.kntu.model.soldiers;

import ir.ac.kntu.model.Warrior;

import java.util.ArrayList;
import java.util.List;

public class KamurochoSoldier extends Soldier implements Warrior {
    private List<Enemy> enemiesInRatio = new ArrayList<>();
    private List<Enemy> allEnemySoldiers = new ArrayList<>();

    public KamurochoSoldier(String name, int health, int attack, int fieldOfView, int visionRatio, boolean locked) {
        super(name, health, attack, fieldOfView, visionRatio, locked);
    }

    @Override
    public void fight() {
        for (Enemy enemy : enemiesInRatio){
            enemy.setHealth((int) (enemy.getHealth()-(0.1*this.getAttack())));
        }
    }

    @Override
    public void searchForOpponents() {
        for (Enemy soldier : allEnemySoldiers){
            if (soldier.getCurrentCoordinate().isInRatio(this.getVisionRatio(),this.getCurrentCoordinate())){
                enemiesInRatio.add(soldier);
            }else {
                enemiesInRatio.remove(soldier);
            }
        }
    }
}
