package org.firstinspires.ftc.teamcode;

import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp")
public class TeleOp  extends CommandOpMode {
    private final Robot robot = Robot.getInstance();
    public GamepadEx gamepadEx;


    @Override
    public void initialize() {
        gamepadEx = new GamepadEx(gamepad1);
        robot.initializeHardware(hardwareMap);
    }

    @Override
    public void run(){

        double y = -gamepad1.left_stick_y;
        double x = gamepad1.left_stick_x;
        double rx = gamepad1.right_stick_x;

        robot.mecanumDriveTrain.leftFront.setPower(y + x + rx);
        robot.mecanumDriveTrain.leftBack.setPower(y - x + rx);
        robot.mecanumDriveTrain.rightFront.setPower(y - x - rx);
        robot.mecanumDriveTrain.rightBack.setPower(y + x - rx);

        if(gamepadEx.isDown(GamepadKeys.Button.RIGHT_BUMPER)){
            robot.intake.intakeMotor.setPower(1);
        }
        else{
            robot.intake.intakeMotor.setPower(0);
        }

        if(gamepadEx.isDown(GamepadKeys.Button.LEFT_BUMPER))
        {
            robot.intake.intakeMotor.setPower(-1);
        }
        else
        {
            robot.intake.intakeMotor.setPower(0);
        }


        telemetry.addData("TeleOp Running", "!");
        telemetry.update();
    }

}
