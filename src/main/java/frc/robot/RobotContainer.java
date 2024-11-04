package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.DriveCmd;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {
    private final GamepadJoystick joystick  = new GamepadJoystick(GamepadJoystick.CONTROLLER_PORT);
    private final DriveSubsystem driveMotorSubsystem = new DriveSubsystem();
    private final DriveCmd driveJoystickCmd = new DriveCmd(driveMotorSubsystem, joystick);

    public RobotContainer() {
	    this.driveMotorSubsystem.setDefaultCommand(this.driveJoystickCmd);
    }

    public Command getAutonomousCommand() {
	    return null;
    }
}
