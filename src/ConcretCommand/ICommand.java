package ConcretCommand;

import java.io.BufferedWriter;
import java.io.IOException;

public interface ICommand {
    void execute();
    void store(BufferedWriter writer) throws IOException;
}
