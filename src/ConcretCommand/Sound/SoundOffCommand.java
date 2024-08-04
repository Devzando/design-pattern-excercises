package ConcretCommand.Sound;

import java.io.BufferedWriter;
import java.io.IOException;
import ConcretCommand.ICommand;

public class SoundOffCommand implements ICommand {
    private Sound sound;

    public SoundOffCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.off();
    }

    @Override
    public void store(BufferedWriter writer) throws IOException {
        writer.write("SoundOffCommand");
        writer.newLine();    
    }
}
