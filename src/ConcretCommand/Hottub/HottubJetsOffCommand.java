package ConcretCommand.Hottub;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class HottubJetsOffCommand implements ICommand {
    private Hottub hottub;

    public HottubJetsOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOff();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("HottubJetsOffCommand");
        writer.newLine();    
    }
}
