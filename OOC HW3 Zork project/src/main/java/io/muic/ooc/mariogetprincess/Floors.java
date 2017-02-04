package io.muic.ooc.mariogetprincess;


public class Floors {



    public Room[][] firstFloor = new Room[4][2];

    {
        Room room00 = new Room();
        /// set room
        room00.setMonster(new Monster(30,30,new Mushroom(20,0)));
        room00.addExit("east");
        room00.addExit("south");

        Room room01 = new Room();
        room01.setMonster(new Monster(15, 15, new Armor(10,1)));
        room01.addExit("west");
        room01.addExit("south");

        Room room10 = new Room();
        room10.setMonster(new Monster(10,10, null));
        room10.addExit("north");
        room10.addExit("east");
        room10.addExit("south");

        Room room11 = new Room();
        room11.setMonster(new Monster(10, 10, null));
        room11.addExit("north");
        room11.addExit("west");

        Room room20 = new Room();
        room20.setMonster(new Monster(5, 5,null));
        room20.addExit("north");
        room20.addExit("south");

        Room room30 = new Room();
//        room30.setMonster(new Monster());
        room30.addExit("north");


        firstFloor[0][0] = room00;
        firstFloor[0][1] = room01;
        firstFloor[1][0] = room10;
        firstFloor[1][1] = room11;
        firstFloor[2][0] = room20;
        //firstFloor[2][1] = room21; // no room
        firstFloor[3][0] = room30;
        //firstFloor[3][1] = room31; // no room

    }

    public Room[][] secondFloor = new Room[3][3];

    {

        Room room01 = new Room();
        room01.setMonster(new Monster(25, 25, new Armor(10,2)));
        room01.addExit("south");


        Room room10 = new Room();
        room10.setMonster(new Monster(25, 25, new Mushroom(10, 10)));
        room10.addExit("east");

        Room room11 = new Room();
//        room11.setMonster(new Monster());
        room11.addExit("north");
        room11.addExit("south");
        room11.addExit("east");
        room11.addExit("west");

        Room room12 = new Room();
        room12.setMonster(new Monster(30, 30, new Mushroom(10,10)));
        room12.addExit("west");


        Room room21 = new Room();
        room21.setMonster(new Monster(40, 40, new Armor(20, 2)));
        room21.addExit("north");


        secondFloor[0][1] = room01;
        secondFloor[1][0] = room10;
        secondFloor[1][1] = room11;
        secondFloor[1][2] = room12;
        secondFloor[2][1] = room21;

    }

    public Room[][] thirdFloor = new Room[3][3];

    {
        Room room00 = new Room();
        room00.setMonster(new Monster(20, 20, null));
        room00.addExit("east");
        room00.addExit("south");

        Room room01 = new Room();
        room01.setMonster(new Monster(30, 30, new Armor(40,1)));
        room01.addExit("east");
        room01.addExit("west");
        room01.addExit("south");

        Room room02 = new Room();
        room02.setMonster(new Monster(40, 40, new Mushroom(20, 20)));
        room02.addExit("south");
        room02.addExit("west");

        Room room10 = new Room();
//        room10.setMonster(new Monster());
        room10.addExit("north");
        room10.addExit("south");
        room10.addExit("east");

        Room room11 = new Room();
        room11.setMonster(new Monster(30,30, new Armor(40,1)));
        room11.addExit("north");
        room11.addExit("south");
        room11.addExit("east");
        room11.addExit("west");

        //Big Boss
        Room room12 = new Room();
        room12.setMonster(new Monster(100,70, null));
        room12.addExit("north");
        room12.addExit("south");
        room12.addExit("west");

        Room room20 = new Room();
        room20.setMonster(new Monster(20, 20, null));
        room20.addExit("north");
        room20.addExit("east");

        Room room21 = new Room();
        room21.setMonster(new Monster(30, 30, new Armor(40, 1)));
        room21.addExit("north");
        room21.addExit("east");
        room21.addExit("west");

        Room room22 = new Room();
        room22.setMonster(new Monster(40, 40, new Mushroom(20, 20)));
        room22.addExit("north");
        room22.addExit("west");


        thirdFloor[0][0] = room00;
        thirdFloor[0][1] = room01;
        thirdFloor[0][2] = room02;
        thirdFloor[1][0] = room10;
        thirdFloor[1][1] = room11;
        thirdFloor[1][2] = room12;
        thirdFloor[2][0] = room20;
        thirdFloor[2][1] = room21;
        thirdFloor[2][2] = room22;
    }

}
