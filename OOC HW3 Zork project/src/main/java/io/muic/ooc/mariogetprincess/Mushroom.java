package io.muic.ooc.mariogetprincess;


public class Mushroom extends Items {

    private Integer healHP;
    private Integer increaseDamage;

    public Mushroom(int healHP, int increaseDamage) {
        this.healHP = healHP;
        this.increaseDamage = increaseDamage;

    }

    //Mushroom mushroom = new Mushroom(10,0);


    public int healHP() {
        return healHP;
    }
}
