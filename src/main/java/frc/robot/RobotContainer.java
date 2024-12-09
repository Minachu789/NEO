package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.DeviceId.DriveMotor.ShooterSubsystem;
import frc.robot.commands.DriveCmd;
import frc.robot.commands.IntakeCmd;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class RobotContainer {
    private final GamepadJoystick driver = new GamepadJoystick(GamepadJoystick.DRIVER_PORT);
    private final DriveSubsystem driveMotorSubsystem = new DriveSubsystem();
    private final GamepadJoystick controller = new GamepadJoystick(GamepadJoystick.CONTROLLER_PORT);
    private final DriveCmd driveJoystickCmd = new DriveCmd(driveMotorSubsystem, driver);
    private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
    private final IntakeCmd intakeCmd = new IntakeCmd(intakeSubsystem, controller);
    private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();

    public RobotContainer() {
        this.driveMotorSubsystem.setDefaultCommand(this.driveJoystickCmd);
        this.intakeSubsystem.setDefaultCommand(this.intakeCmd);
    }

    public Command getAutonomousCommand() {
        return null;
    }
}
