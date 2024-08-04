package ConcretCommand.Tv;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class TvOffCommand implements ICommand {
    private Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("TvOffCommand");
        writer.newLine();    
    }
}
