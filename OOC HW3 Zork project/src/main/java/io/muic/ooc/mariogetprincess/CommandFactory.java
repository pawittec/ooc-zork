//package io.muic.ooc.mariogetprincess;
//
//
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public final class CommandFactory {
//
//    private static final HashMap<String, Command> commands = new HashMap<String, Command>() {
//        {
//            // commands are added here using lambdas. It is also possible to dynamically add commands without editing the code.
//            put("Light on", new LightOnCommand());
//            put("Light off", new LightOffCommand());
//            put("quit", new ExitCommand());
//        }
//    };
//
//    public static Command getCommand(String name) {
//        return commands.get(name);
//    }
//
//    public static void main(final String[] arguments) {
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        System.out.println("Bot: Hello, command me!!");
//        while (!quit) {
//            System.out.print("You: ");
//            String commandLine = scanner.nextLine();
//            Command command = CommandFactory.getCommand(commandLine);
//            if (null == command) {
//                System.out.println("Unknown command [" + commandLine + "]. Available commands: Light on, Light off and quit.");
//            } else {
//                command.apply();
//            }
//        }
//
//    }
//
//}
