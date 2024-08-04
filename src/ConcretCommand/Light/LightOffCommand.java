package ConcretCommand.Light;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class LightOffCommand implements ICommand {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("LightOffCommand");
        writer.newLine();    
    }

}
