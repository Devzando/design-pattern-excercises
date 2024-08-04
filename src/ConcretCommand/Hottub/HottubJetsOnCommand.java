package ConcretCommand.Hottub;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class HottubJetsOnCommand implements ICommand {
    private Hottub hottub;

    public HottubJetsOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOn();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("HottubJetsOnCommand");
        writer.newLine();    
    }
}
