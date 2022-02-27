package com.bafila.command;

import com.bafila.controllers.GameController;
import com.bafila.models.Game;

//command 1
public class StartGameCommand implements ICommand{

    GameController gameController= new GameController();

    @Override
    public boolean matches(String command) {
        return false;
    }

    @Override
    public void execute(String command) {
        gameController.run(new Game());

    }
}
