package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HopperSubsystem extends SubsystemBase {
    private final CANSparkMax motor = new CANSparkMax(0, MotorType.kBrushless);

    public void move(double speed) {
        this.motor.set(speed);
    }

    public void stop() {
        this.motor.stopMotor();
    }
}
