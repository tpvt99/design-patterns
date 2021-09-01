import command.*;
import invoker.RemoteControl;
import receiver.GarageDoor;
import receiver.Light;
import receiver.Stereo;

public class RemoteControlMacro {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Bathroom");
        GarageDoor garageDoor = new GarageDoor("Garage");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        Command[] onCommands = new Command[]{lightOnCommand, stereoOnWithCDCommand, garageDoorOpenCommand};
        Command[] offCommands = new Command[]{lightOffCommand, stereoOffCommand, garageDoorCloseCommand};

        MacroCommand macroOnCommand = new MacroCommand(onCommands);
        MacroCommand macroOffCommand = new MacroCommand(offCommands);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, macroOnCommand, macroOffCommand);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);

        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPush();
    }
}
