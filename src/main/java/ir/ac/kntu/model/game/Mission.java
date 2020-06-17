package ir.ac.kntu.model.game;

import ir.ac.kntu.model.soldiers.Soldier;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class Mission {
    public Text enemiesNumText ;
    public Text wavesNumText ;
    public Text bossNumText;
    public ImageView HQ1;
    public ImageView HQ2;

    private boolean locked = true;
    private int wavesNum;
    private List<Wave> waves = new ArrayList<>();
    private int level;
    private List<Soldier> kamuSoldiers = new ArrayList<>();
    public Mission(int mission , int waves){
        if (mission==1){
            this.locked = false;
        }
         this.wavesNum = waves;
         this.level = mission;
         for (int i=1 ; i<=waves ;i++){
             this.waves.add(new Wave(mission,i));
         }
    }
    public Wave getWave(int num){
        return waves.get(num);
    }
}
