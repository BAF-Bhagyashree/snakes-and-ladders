package com.bafila.command;

import com.bafila.controllers.UserController;

import java.util.List;

//command2
public class CreateUserCommand implements ICommand {

    UserController userController= new UserController();
    @Override
    public boolean matches(String command) {

        List<String> commandBroken= List.of(command.split(" "));
        if(commandBroken.size()>0 && commandBroken.get(0).equals("CreateUser"))
            return true;
        return false;
    }

    @Override
    public void execute(String command) {

        List<String> commandBroken= List.of(command.split(" "));
        String email=commandBroken.get(2);
        String password= commandBroken.get(3);
        userController.createUser(email, password);
        System.out.println("created user");

    }
}
