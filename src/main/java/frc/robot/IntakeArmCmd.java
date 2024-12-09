package frc.robot.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.IntakeArmSubsystem;

public class IntakeArmCmd extends Command {
	private final IntakeArmSubsystem intakeArmSubsystem;
	private final XboxController controller;

	public IntakeArmCmd(IntakeArmSubsystem intakeArmSubsystem, XboxController controller) {
		this.intakeArmSubsystem = intakeArmSubsystem;
		this.controller = controller;
		this.addRequirements(this.intakeArmSubsystem);
	}

	@Override
	public void initialize() {
	}

	@Override
	public void execute() {
		if (this.controller.getLeftBumper()) {
			this.intakeArmSubsystem.execute(0.3);
		}else if(this.controller.getRightBumper()){
			this.intakeArmSubsystem.execute(-0.3);
	
		} else {
			this.intakeArmSubsystem.stop();
		}
		double IntakeArmSpeed = MathUtil.applyDeadband(this.controller.getRightY(), Constants.Drive.DEAD_BAND)*Constants.Drive.IntakeArm_MAX_SPEED;
	}

	@Override
	public void end(boolean interrupted) {
		this.intakeArmSubsystem.stop();
	}

	@Override
	public boolean isFinished() {
		return false;
	}
}
