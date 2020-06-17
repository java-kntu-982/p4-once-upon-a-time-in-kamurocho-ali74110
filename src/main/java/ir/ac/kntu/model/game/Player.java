package ir.ac.kntu.model.game;

public class Player {

    private String name;
    private int cash = 100;

    private Boolean mission1Lock = true;
    private Boolean mission2Lock = true;
    private Boolean mission3Lock = true;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public Boolean getMission1Lock() {
        return mission1Lock;
    }

    public void setMission1Lock(Boolean mission1Lock) {
        this.mission1Lock = mission1Lock;
    }

    public Boolean getMission2Lock() {
        return mission2Lock;
    }

    public void setMission2Lock(Boolean mission2Lock) {
        this.mission2Lock = mission2Lock;
    }

    public Boolean getMission3Lock() {
        return mission3Lock;
    }

    public void setMission3Lock(Boolean mission3Lock) {
        this.mission3Lock = mission3Lock;
    }
}
