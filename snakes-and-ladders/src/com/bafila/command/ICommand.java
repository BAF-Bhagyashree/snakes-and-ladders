package com.bafila.command;

public interface ICommand {
    boolean matches(String command);

    void execute(String command);
}
