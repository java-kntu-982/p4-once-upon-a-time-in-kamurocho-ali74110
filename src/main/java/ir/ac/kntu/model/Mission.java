package ir.ac.kntu.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class Mission {
    public Text enemiesNumText ;
    public Text wavesNumText ;
    public Text bossNumText;
    public ImageView HQ1;
    public ImageView HQ2;

    private boolean locked = false;
    private int wavesNum;
    private List<Wave> waves = new ArrayList<>();
    private String level;
    private List<Soldier> kamuSoldiers = new ArrayList<>();
    public Mission(int num){
         if(num == 1){
             List<Wave> waves = new ArrayList<>();

         }
    }
}
