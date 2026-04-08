package org.firstinspires.ftc.teamcode;

import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;

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

        robot.leftFront.setPower(y + x + rx);
        robot.leftBack.setPower(y - x + rx);
        robot.rightFront.setPower(y - x - rx);
        robot.rightBack.setPower(y + x - rx);

        telemetry.addData("TeleOp Running", "!");
        telemetry.addData("Power", robot.leftBack.getPower());
        telemetry.update();
    }

}
