package io.muic.ooc.mariogetprincess;


public class Monster {

    private Integer HP;
    private Integer monAttack;
    //private Integer monPosition;
    private Items mondropItem;

    public Monster(int monsterHP, int monsterAttack, Items items){
        HP = monsterHP;
        monAttack = monsterAttack;
        mondropItem = items;
    }



    public Integer getHP(){
        return HP;
    }

    public Integer monsterAttack(){
        return monAttack;
    }

//    public Integer monsterPosition(){
//        return monPosition;
//
//    }

    public Items items(){
        return mondropItem;
    }


    public void attacked(Integer attack) {
        this.HP -= attack;

    }


}

