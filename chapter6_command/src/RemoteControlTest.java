import command.*;
import invoker.RemoteControl;
import invoker.SimpleRemoteControl;
import receiver.CeilingFan;
import receiver.GarageDoor;
import receiver.Light;
import receiver.Stereo;

public class RemoteControlTest {

    public static void main(String [] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        //CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(1, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        //remoteControl.setCommand(3, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPush();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPush();
        System.out.println(remoteControl);
    }
}
