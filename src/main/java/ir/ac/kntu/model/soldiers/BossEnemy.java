package ir.ac.kntu.model.soldiers;

public class BossEnemy extends Enemy {
    public BossEnemy(int level) {
        super("Boss lvl.1", 8000, 5000, 1);
        if (level == 2){
            this.setAttack(12000);
            this.setHealth(20000);
            this.setName("Boss lvl.2");
        }
    }
}
