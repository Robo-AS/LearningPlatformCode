package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Intake extends SubsystemBase {

    private static Intake instance = null;

    public DcMotor intakeMotor;

    private HardwareMap hardwaremap;
    public static Intake getInstance(){
        if(instance==null){
            instance = new Intake();
        }
        return instance;
    }

    public void initializeHardware(final HardwareMap hardwareMap) {
        this.hardwaremap = hardwareMap;
        intakeMotor = hardwaremap.get(DcMotorEx.class, "intakeMotor");
        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }
}
