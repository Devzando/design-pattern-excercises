package ConcretCommand.CeillingFan;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class CeillingFanHighCommand implements ICommand {
    private CeillingFan ceillingFan;

    public CeillingFanHighCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        ceillingFan.high();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("CeillingFanHighCommand");
        writer.newLine();    
    }

}
