package ir.ac.kntu.model.game;

import ir.ac.kntu.model.soldiers.*;

import java.util.ArrayList;
import java.util.List;

public class Wave {
    private List<Soldier> enemySoldiers = new ArrayList<>();
    private Soldier boss;
    private int waveNum;

    public Wave(int mission , int wave ){
        waveNum = wave ;
        if (mission==1){
            for (int i=0 ;i<5;i++){
                enemySoldiers.add(new GrayEnemy());
            }
            switch (wave){
                case 1 : createRedEnemies(5);
                case 2 : createRedEnemies(15);
                case 3 : createRedEnemies(25);
                case 4 : createRedEnemies(25);
                case 5 : createRedEnemies(35);
                case 6 : createRedEnemies(45);
            }
        }else if (mission==2){
            for (int i=0 ;i<5;i++){
                enemySoldiers.add(new GrayEnemy());
            }
            for (int i=0 ;i<5;i++){
                enemySoldiers.add(new YellowEnemy());
            }
            switch (wave){
                case 2 : createRedEnemies(10);
                case 3 : createRedEnemies(20);
                case 4 : createRedEnemies(30);
                case 5 : createRedEnemies(40);
                case 6 : createRedEnemies(50);
                case 7 : createRedEnemies(60);
            }
        }else if (mission==3){
            for (int i=0 ;i<10;i++){
                enemySoldiers.add(new GrayEnemy());
            }
            for (int i=0 ;i<5;i++){
                enemySoldiers.add(new YellowEnemy());
            }
            for (int i=0 ;i<5;i++){
                enemySoldiers.add(new GoldEnemy());
            }
            switch (wave){
                case 1 : createRedEnemies(10);
                case 2 : createRedEnemies(10);
                case 3 : createRedEnemies(20);
                case 4 : createRedEnemies(20);
                case 5 : createRedEnemies(30);
                case 6 : createRedEnemies(40);
                case 7 : createRedEnemies(50);
                case 8 : createRedEnemies(60);
            }
        }
    }
    public void createRedEnemies(int num){
        for (int i=0 ;i<num;i++){
            enemySoldiers.add(new RedEnemy());
        }
    }

}
