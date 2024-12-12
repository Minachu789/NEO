package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class DriveModule {
    private final CANSparkMax motor;

    public DriveModule(int port, boolean reverse) {
        this.motor = new CANSparkMax(port, MotorType.kBrushless);
        this.motor.setInverted(reverse);
        this.motor.setIdleMode(IdleMode.kBrake);

    }

    public void setDesiredState(double speed) {
        this.motor.set(speed);
    }

    public void stop() {
        this.motor.set(0);
    }
}
