package frc.robot;

public class DeviceId {
    public static final class DriveMotor {
        public static final int FRONT_LEFT = 1;
        public static final int FRONT_RIGHT = 3;
        public static final int BACK_LEFT = 2;
        public static final int BACK_RIGHT = 4;

        public static final class FRONT_LEFT {
            public static final int motor = 1;
        }

        public static final class FRONT_RIGHT {
            public static final int motor = 2;
        }

        public static final class BACK_LEFT {
            public static final int motor = 3;
        }

        public static final class BACK_RIGHT {
            public static final int motor = 4;
        }

        public static final class IntakeSubsystem {
            public static final int motor = 5;
        }

        public static final class ShooterSubsystem {
            public static final int motor = 6;
        }

        public static final class IntakeOnSubsystem {
            public IntakeOnSubsystem(IntakeOnSubsystem intakeOnSubsystem, GamepadJoystick controller) {

            }

            public static final int motor = 7;
        }
    }
}