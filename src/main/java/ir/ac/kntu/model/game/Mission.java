package ir.ac.kntu.model.game;

import ir.ac.kntu.model.soldiers.Soldier;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Mission {
    public VBox information;
    public HBox missionView;
    public Button startButton;

    private boolean locked = true;
    private int wavesNum;
    private List<Wave> waves = new ArrayList<>();
    private int level;
//    private List<Soldier> kamuSoldiers = new ArrayList<>();
    private HQ hq1 ;
    private HQ hq2 ;
    public Mission(int mission , int waves){
        if (mission == 3){
            hq1 = HQ.createHQ2();
            hq2 = HQ.createHQ3();
        } else if (mission == 2){
            hq1 = HQ.createHQ2();
            hq2 = HQ.createHQ1();
        } else if (mission==1){
            hq1 = HQ.createHQ1();
            hq2 = HQ.createHQ3();
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
