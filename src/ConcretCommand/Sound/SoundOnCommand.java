package ConcretCommand.Sound;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class SoundOnCommand implements ICommand {
    private Sound sound;

    public SoundOnCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.on();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("SoundOnCommand");
        writer.newLine();    
    }
}
