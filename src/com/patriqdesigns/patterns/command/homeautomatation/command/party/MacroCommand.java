package com.patriqdesigns.patterns.command.homeautomatation.command.party;

import com.patriqdesigns.patterns.command.homeautomatation.command.Command;

/**
 * Created by Andre on 20/07/15.
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command... commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(int i = commands.length-1; i >= 0; i--){
            commands[i].undo();
        }
    }
}
