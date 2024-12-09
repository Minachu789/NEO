package frc.robot;

public class Constants {
  public static final class Drive {
    public static final double MAX_SPEED = 0.1;
    public static final double MAX_TURN_SPEED = 0.2;
    public static final double DEAD_BAND = 0.05;
    public static final double MAX_DRIVE_SPEED = 0.5;
    public static final double IntakeArm_MAX_SPEED = 0;
  }

  public static final class MotorReverse {
    public static final boolean FRONT_LEFT = false;
    public static final boolean FRONT_RIGHT = true;
    public static final boolean BACK_LEFT = false;
    public static final boolean BACK_RIGHT = true;
  }
}
