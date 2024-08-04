package ConcretCommand.Tv;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class TvOnCommand implements ICommand {
    private Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("TvOnCommand");
        writer.newLine();    
    }
}
