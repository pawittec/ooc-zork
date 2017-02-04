package io.muic.ooc.mariogetprincess;


import java.util.ArrayList;

public class Room {

    private Monster roomMonster = null;
    private ArrayList<String> allExit = new ArrayList<String>();

    public void setMonster(Monster monster) {
        this.roomMonster = monster;

    }
        // get info, where to go next (set exit)

    public Monster getRoomMonster(){
        return this.roomMonster;
    }

    public ArrayList<String> getExit(){
        return this.allExit;
    }

    public void addExit(String dir) {
        this.allExit.add(dir);
    }
}
