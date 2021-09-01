import command.CeilingFanHighSpeedCommand;
import command.CeilingFanLowSpeedCommand;
import command.CeilingFanMidiumSpeedCommand;
import command.CeilingFanOffCommand;
import invoker.RemoteControl;
import receiver.CeilingFan;

public class RemoteLoaderCeilingFan {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanLowSpeedCommand ceilingFanLowSpeedCommand = new CeilingFanLowSpeedCommand(ceilingFan);
        CeilingFanMidiumSpeedCommand ceilingFanMidiumSpeedCommand = new CeilingFanMidiumSpeedCommand(ceilingFan);
        CeilingFanHighSpeedCommand ceilingFanHighSpeedCommand = new CeilingFanHighSpeedCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMidiumSpeedCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighSpeedCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPush();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPush();
    }
}
