package ConcretCommand.Light;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class LightOnCommand implements ICommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("LightOnCommand");
        writer.newLine();    
    }
}
