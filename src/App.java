import ConcretCommand.ICommand;
import ConcretCommand.MacroCommand;
import ConcretCommand.GarageDoor.GarageDoor;
import ConcretCommand.GarageDoor.GarageDoorUpCommand;
import ConcretCommand.Light.Light;
import ConcretCommand.Light.LightOnCommand;
import ConcretCommand.Sound.Sound;
import ConcretCommand.Sound.SoundOnCommand;
import ConcretCommand.Tv.Tv;
import ConcretCommand.Tv.TvOnCommand;

public class App {
    public static void main(String[] args) throws Exception {
        Sound sound = new Sound();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Tv tv = new Tv();

        SimpleRemoteControll remote = new SimpleRemoteControll();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        SoundOnCommand soundOn = new SoundOnCommand(sound);
        TvOnCommand tvOn = new TvOnCommand(tv);

        ICommand[] commands = {lightOn, garageDoorUp, soundOn, tvOn};
        MacroCommand macro = new MacroCommand(commands);

        System.out.println("================================");
        System.out.println("Executing commands");
        System.out.println("================================");
        remote.setCommand(macro);
        remote.buttonWasPressed();

        System.out.println("================================");
        System.out.println("Loading commands from file");
        System.out.println("================================");
        remote.load();
       
    }
}
