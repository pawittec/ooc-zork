package io.muic.ooc.mariogetprincess;


public class ExitCommand implements Command {

    Character character;
    public void apply() {
        System.exit(0);
    }



}
