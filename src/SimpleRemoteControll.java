import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ConcretCommand.ICommand;
import ConcretCommand.CeillingFan.CeillingFan;
import ConcretCommand.CeillingFan.CeillingFanHighCommand;
import ConcretCommand.CeillingFan.CeillingFanOffCommand;
import ConcretCommand.GarageDoor.GarageDoor;
import ConcretCommand.GarageDoor.GarageDoorDownCommand;
import ConcretCommand.GarageDoor.GarageDoorUpCommand;
import ConcretCommand.Hottub.Hottub;
import ConcretCommand.Hottub.HottubJetsOffCommand;
import ConcretCommand.Hottub.HottubJetsOnCommand;
import ConcretCommand.Light.Light;
import ConcretCommand.Light.LightOffCommand;
import ConcretCommand.Light.LightOnCommand;
import ConcretCommand.SecurityControll.SecurityControll;
import ConcretCommand.SecurityControll.SecurityControllArmCommand;
import ConcretCommand.SecurityControll.SecurityControllDisarmCommand;
import ConcretCommand.Sound.Sound;
import ConcretCommand.Sound.SoundOffCommand;
import ConcretCommand.Sound.SoundOnCommand;
import ConcretCommand.Tv.Tv;
import ConcretCommand.Tv.TvOffCommand;
import ConcretCommand.Tv.TvOnCommand;

public class SimpleRemoteControll {
    private List<ICommand> commandHistory = new ArrayList<>();
    private ICommand slot;

    public SimpleRemoteControll() {
    }

    public void setCommand(ICommand command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("comandos.txt", false))) {
            slot.store(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader("comandos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                ICommand command = criarComando(linha);
                if (command != null) {
                    command.execute();
                    commandHistory.add(command);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ICommand criarComando(String linha) throws IOException {
        String[] parts = linha.split(",");

        Light light = new Light();
        CeillingFan fan = new CeillingFan();
        GarageDoor garageDoor = new GarageDoor();
        Hottub hottub = new Hottub();
        SecurityControll securityControll = new SecurityControll();
        Sound sound = new Sound();
        Tv tv = new Tv();

        switch (parts[0]) {
            case "LightOnCommand":
                return new LightOnCommand(light);
            case "LightOffCommand":
                return new LightOffCommand(light);
            case "CeillingFanHighCommand":
                return new CeillingFanHighCommand(fan);
            case "CeillingFanOffCommand":
                return new CeillingFanOffCommand(fan);
            case "GarageDoorDownCommand":
                return new GarageDoorDownCommand(garageDoor);
            case "GarageDoorUpCommand":
                return new GarageDoorUpCommand(garageDoor);
            case "HottubJetsOnCommand":
                return new HottubJetsOnCommand(hottub);
            case "HottubJetsOffCommand":
                return new HottubJetsOffCommand(hottub);
            case "SecurityControllArmCommand":
                return new SecurityControllArmCommand(securityControll);
            case "SecurityControllDisarmCommand":
                return new SecurityControllDisarmCommand(securityControll);
            case "SoundOffCommand":
                return new SoundOffCommand(sound);
            case "SoundOnCommand":
                return new SoundOnCommand(sound);
            case "TvOnCommand":
                return new TvOnCommand(tv);
            case "TvOffCommand":
                return new TvOffCommand(tv);
            default:
                return null;
        }
    }

}
