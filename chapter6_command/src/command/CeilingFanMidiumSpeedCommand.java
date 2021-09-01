package command;

import receiver.CeilingFan;

public class CeilingFanMidiumSpeedCommand implements Command{
    CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanMidiumSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.speedMedium();
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
