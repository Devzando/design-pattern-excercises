package ConcretCommand;

import java.io.BufferedWriter;
import java.io.IOException;

public class MacroCommand implements ICommand{
    ICommand[] commands;

    public MacroCommand(ICommand[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i=0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        for(int i=0; i < commands.length; i++){
            commands[i].store(writer);
        }
    }
}
