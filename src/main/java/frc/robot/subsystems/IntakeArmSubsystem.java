
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.DeviceId;

public class IntakeArmSubsystem extends SubsystemBase {
    private CANSparkMax motor = new CANSparkMax(DeviceId.ControllMotor.INTAKEARM_MOTOR, MotorType.kBrushless);
    private final double MIN_DEGREE = -0.388300284707507;
    private final double MAX_DEGREE = 0.368803809220095;
    private final DutyCycleEncoder encoder = new DutyCycleEncoder(0);

    public IntakeArmSubsystem() {
        this.motor = new CANSparkMax(DeviceId.ControllMotor.INTAKEARM_MOTOR, MotorType.kBrushless);
        this.motor.setSmartCurrentLimit(30);
        this.motor.setInverted(true);
        this.motor.setIdleMode(IdleMode.kBrake); // kBrake 停止後鎖住馬達, kCoast 停止後保持慣性
    }

    public void move(double speed) {
        if (this.encoder.get() >= this.MIN_DEGREE && this.encoder.get() <= this.MAX_DEGREE) {
            this.motor.set(speed);
        } else if (this.encoder.get() < this.MIN_DEGREE && speed >= 0.0) {
            this.motor.set(speed);
        } else if (this.encoder.get() < this.MIN_DEGREE && speed <= 0.0) {
            this.motor.set(speed);
        } else {
            this.motor.set(0);
        }
    }

    public void up(double speed) {
        while (true) {
            if (this.encoder.get() - this.MIN_DEGREE >= 0.05) {
                this.motor.set(speed);
            } else {
                break;
            }
        }
    }

    public void down(double speed) {
        while (true) {
            if (this.encoder.get() - this.MAX_DEGREE <= (-0.005)) {
                this.motor.set(speed);
            } else {
                break;
            }
        }
    }

    public void stop() {
        this.motor.stopMotor();
    }

}
