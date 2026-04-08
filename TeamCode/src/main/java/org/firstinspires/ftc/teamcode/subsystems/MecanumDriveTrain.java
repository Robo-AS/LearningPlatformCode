package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class MecanumDriveTrain extends SubsystemBase {

    private static MecanumDriveTrain instance = null;

    public DcMotorEx leftFront, leftBack, rightFront, rightBack;

    public static MecanumDriveTrain getInstance(){
        if(instance==null){
            instance = new MecanumDriveTrain();
        }
        return instance;
    }

    private HardwareMap hardwaremap;
    public void initializeHardware(final HardwareMap hardwareMap){
        this.hardwaremap = hardwareMap;
        leftFront = hardwaremap.get(DcMotorEx.class, "leftFront");
        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);

        rightFront = hardwaremap.get(DcMotorEx. class, "rightFront");
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setDirection(DcMotorSimple.Direction.FORWARD);


        leftBack = hardwaremap.get(DcMotorEx.class, "leftBack");
        leftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBack.setDirection(DcMotorSimple.Direction.REVERSE);


        rightBack = hardwaremap.get(DcMotorEx. class, "rightBack");
        rightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBack.setDirection(DcMotorSimple.Direction.FORWARD);

    }
}
