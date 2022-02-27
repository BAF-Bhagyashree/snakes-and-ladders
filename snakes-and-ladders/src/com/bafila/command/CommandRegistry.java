package com.bafila.command;


import com.bafila.exceptions.InvalidCommandException;

import java.util.ArrayList;
import java.util.List;

public class CommandRegistry {

    //has list of all commands
    //registers a command
    //executes a command

    List<ICommand> commands= new ArrayList<>();

    public void registerCommand(ICommand command){

        commands.add(command);
    }

    public void executeCommand(String inputCommand){

        for(ICommand c:commands){
            if(c.matches(inputCommand)){
                c.execute(inputCommand);
                return;
            }
        }
        throw new InvalidCommandException();
    }

}
