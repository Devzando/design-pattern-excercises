package ConcretCommand.SecurityControll;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class SecurityControllArmCommand implements ICommand {
    private SecurityControll securityControll;

    public SecurityControllArmCommand(SecurityControll securityControll) {
        this.securityControll = securityControll;
    }

    @Override
    public void execute() {
        securityControll.arm();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("SecurityControllArmCommand");
        writer.newLine();    
    }
}
