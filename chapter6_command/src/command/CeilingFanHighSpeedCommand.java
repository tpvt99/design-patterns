package command;

import receiver.CeilingFan;

public class CeilingFanHighSpeedCommand implements Command{
    CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanHighSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.speedHigh();
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
