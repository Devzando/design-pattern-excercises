package ConcretCommand.CeillingFan;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class CeillingFanOffCommand implements ICommand {
    private CeillingFan ceillingFan;

    public CeillingFanOffCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        ceillingFan.off();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("CeillingFanHighCommand");
        writer.newLine();    
    }

}
