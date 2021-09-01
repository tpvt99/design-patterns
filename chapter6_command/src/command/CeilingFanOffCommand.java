package command;

import receiver.CeilingFan;

public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.LOW)
            ceilingFan.speedLow();
        else if (prevSpeed == CeilingFan.MEDIUM)
            ceilingFan.speedMedium();
        else if (prevSpeed == CeilingFan.HIGH)
            ceilingFan.speedHigh();
        else if (prevSpeed == CeilingFan.OFF)
            ceilingFan.off();
    }
}
