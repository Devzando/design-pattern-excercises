package ConcretCommand.GarageDoor;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class GarageDoorDownCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("GarageDoorDownCommand");
        writer.newLine();    
    }

}
