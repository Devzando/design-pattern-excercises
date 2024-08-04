package ConcretCommand.GarageDoor;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class GarageDoorStopCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorStopCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("GarageDoorStopCommand");
        writer.newLine();    
    }
}
