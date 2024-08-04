package ConcretCommand.GarageDoor;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class GarageDoorUpCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("GarageDoorUpCommand");
        writer.newLine();    
    }
}
