package ir.ac.kntu.model.soldiers;

import ir.ac.kntu.model.Warrior;
import ir.ac.kntu.model.game.HQ;

import java.util.ArrayList;
import java.util.List;

public class Enemy extends Soldier implements Warrior {
    public boolean inFight = false;
    private List<KamurochoSoldier> allKamurochoSoldiers = new ArrayList<>();
    private List<KamurochoSoldier> inRatioKamurochoSoldiers = new ArrayList<>();
    private List<HQ> hqs = new ArrayList<>();
    public Enemy(String name, int health, int attack, int visionRatio) {
        super(name, health, attack, visionRatio);
    }

    @Override
    public void fight() {
        for (KamurochoSoldier kamurochoSoldier : inRatioKamurochoSoldiers){
            kamurochoSoldier.setHealth((int) (kamurochoSoldier.getHealth()-(0.1*this.getAttack())));
        }
    }

    @Override
    public void searchForOpponents() {
        for (KamurochoSoldier soldier : allKamurochoSoldiers){
            if (soldier.getCurrentCoordinate().isInRatio(this.getVisionRatio(),this.getCurrentCoordinate())){
                inRatioKamurochoSoldiers.add(soldier);
            }else {
                inRatioKamurochoSoldiers.remove(soldier);
            }
        }
    }
}
