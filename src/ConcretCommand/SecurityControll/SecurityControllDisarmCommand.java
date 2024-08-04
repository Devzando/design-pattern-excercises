package ConcretCommand.SecurityControll;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class SecurityControllDisarmCommand implements ICommand {
    private SecurityControll securityControll;

    public SecurityControllDisarmCommand(SecurityControll securityControll) {
        this.securityControll = securityControll;
    }

    @Override
    public void execute() {
        securityControll.disarm();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("SecurityControllDisarmCommand");
        writer.newLine();    
    }
}
