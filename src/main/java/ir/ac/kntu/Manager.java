package ir.ac.kntu;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Soldier> mySoldiers = new ArrayList<>();
    List<Soldier> myLockedSoldiers = new ArrayList<>();
    HQ container = createHQ1() , van = createHQ2(), truck = createHQ3() ;


    void createMyFirstSoldiers(List<Soldier> mySoldiers , List<Soldier> myLockedSoldiers){
        mySoldiers.add(new Soldier("Goro Majima",4000,4500,3,4,false));
        mySoldiers.add(new Soldier("Daigo Dojima",4000,4000,1,2,false));
        mySoldiers.add(new Soldier("Kaoru Sayama",4500,4500,2,4,false));
        mySoldiers.add(new Soldier("Taiga Saejima",7000,5000,1,1,false));
        mySoldiers.add(new Soldier("Sohei Dojima",3000,3000,1,1,false));
        mySoldiers.add(new Soldier("Ryuji Goda",3800,3600,3,4,false));
        mySoldiers.add(new Soldier("Osamu Kashiwagi",4000,4500,3,4,false));
        mySoldiers.add(new Soldier("Makoto Date",4000,4500,3,4,false));
        mySoldiers.add(new Soldier("Futoshi Shimano",4000,4500,3,4,false));
        mySoldiers.add(new Soldier("Ryo Takashima",4000,4500,3,4,false));
        mySoldiers.add(new Soldier("Jiro Kawara",4000,4500,3,4,false));
        mySoldiers.add(new Soldier("Shintaro Kazama",4500,4500,2,1,false));

        myLockedSoldiers.add(new Soldier("Koji Shindo",4000,4500,3,4,true));
        myLockedSoldiers.add(new Soldier("Sotaro Komaki",4000,4500,3,4,true));
        myLockedSoldiers.add(new Soldier("Yukio Terada",4000,4500,3,4,true));
        myLockedSoldiers.add(new Soldier("Tetsu Tachibana",4000,4500,3,4,true));

    }
    HQ createHQ1(){
        Rectangle rectangle = new Rectangle(70,20);
        Rectangle rectangle2 = new Rectangle(4,10);
        rectangle2.setFill(Color.GREEN);
        HQ hq = new HQ("Container",3000,rectangle,rectangle2,1);
        return hq;
    }
    HQ createHQ2(){
        Circle circle = new Circle(40);
        Rectangle rectangle2 = new Rectangle(4,10);
        rectangle2.setFill(Color.GREEN);
        HQ hq = new HQ("van",6000,circle,rectangle2,1);
        return hq;
    }
    HQ createHQ3(){
        Rectangle rectangle = new Rectangle(50,50);
        Rectangle rectangle2 = new Rectangle(4,10);
        rectangle2.setFill(Color.GREEN);
        HQ hq = new HQ("Truck",5000,rectangle,rectangle2,1);
        return hq;
    }
}
