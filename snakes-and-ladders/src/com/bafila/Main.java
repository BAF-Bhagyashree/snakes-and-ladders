package com.bafila;

import com.bafila.command.CommandRegistry;
import com.bafila.command.CreateUserCommand;
import com.bafila.command.StartGameCommand;
import com.bafila.exceptions.InvalidCommandException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //this is a command line program
        //will have multiple commands from user
        //need to have a command interface this takes in a str command from user and matches if it exists and then executes it
        //we need to design command interface so that we can store commands and can match wthout if else/switch and get the same object always as we dont want a new objwct
        //start game between  u1, u2, u3 of size 100 and set automatically

        //create user bb@gmail.com bb
        //start game bb@gmail.com, cc@gmail.com, 100

        CommandRegistry commandRegistry= new CommandRegistry();
        //register createuser and startgame commands
        commandRegistry.registerCommand(new CreateUserCommand());
        commandRegistry.registerCommand(new StartGameCommand());

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the new command: ");
        while(true){
            String input= br.readLine().toString();
            //Scanner sc= new Scanner(System.in);
            //String input= sc.nextLine();
            //String input="CreateUser";
            try{
                commandRegistry.executeCommand(input);
            }
            catch (InvalidCommandException exception){
                System.out.println("the command you entered is invalid");
            }

        }

    }
}
