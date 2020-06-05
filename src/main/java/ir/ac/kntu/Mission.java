package ir.ac.kntu;

import java.util.ArrayList;
import java.util.List;

public class Mission {
    private int wavesNum;
    private boolean locked = false;
    private List<Wave> waves = new ArrayList<>();
    private String level;
    private List<Soldier> kamuSoldiers = new ArrayList<>();
}
