package io.muic.ooc.mariogetprincess;


import java.util.ArrayList;

public class Character {
    private Integer HP;
    private Integer attack;
    private Floors allFloor = new Floors();
    private int currentFloor = 1;
    private int x = 3;
    private int y = 0;
    private ArrayList<Mushroom> bags = new ArrayList<Mushroom>();

    private Armor usedArmor = null;



    public Character(int myHP, int myAttack){
        HP = myHP;
        attack = myAttack;

    }

    public Room[][] getCurrentFloor(){
        if (currentFloor == 1)
            return allFloor.firstFloor;
        else if(currentFloor == 2)
            return allFloor.secondFloor;
        else
            return allFloor.thirdFloor;
    }

    public Room getCurrentRoom(){
        Room[][] roomFloor = getCurrentFloor();
        return roomFloor[x][y];
    }

    public Integer getHP(){
        return HP;
    }

    public Integer myAttack(){
        return attack;
    }


    public void setAttack(int attack){
        attack = attack;

    }

    public boolean move(String dir){
        // check room can go in dir direction ?
        if(getCurrentRoom().getExit().contains(dir)) {//can go
            if ("north".equals(dir)) {
                this.x -= 1;

                return true;

            } else if ("east".equals(dir)) {
                this.y += 1;

                return true;

            } else if ("west".equals(dir)) {
                this.y -= 1;

                return true;

            } else if ("south".equals(dir)) {
                this.x += 1;

                return true;
            }
            return false;
        }
        else{ // room can't go that dir
            return false;

        }




    }

    public void attack() {
        Room currentRoom = getCurrentRoom();
        Monster monster = currentRoom.getRoomMonster();
        monster.attacked(this.attack);
        if(monster.getHP() <= 0){
            Items dropped = monster.items();
            if (dropped instanceof Armor)
                this.usedArmor = (Armor) dropped;
            else {
                bags.add((Mushroom) monster.items());
                currentRoom.setMonster(null);
            }
        }
    }

    public void useItem() {
        Mushroom item = bags.get(bags.size()-1);
        bags.remove(bags.size()-1);

        this.HP += item.healHP();

    }


}
