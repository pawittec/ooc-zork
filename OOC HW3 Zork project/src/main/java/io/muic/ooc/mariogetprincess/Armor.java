package io.muic.ooc.mariogetprincess;


public class Armor extends Items {

    private Integer block;
    private int count;

    public Armor(int block,int count) {
     this.block = block;
     this.count = count;
    }

    public int getBlock(){
        return block;
    }

//    monsterA.getAttack() - player.getArmor().getBlock();
}
