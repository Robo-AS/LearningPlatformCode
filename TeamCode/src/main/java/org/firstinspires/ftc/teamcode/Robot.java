package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveTrain;

public class Robot {

    private static Robot instance = null;


    public MecanumDriveTrain mecanumDriveTrain;

    public Intake intake;

    private Robot(){

        mecanumDriveTrain = MecanumDriveTrain.getInstance();
        intake = Intake.getInstance();
    }
    public static Robot getInstance(){
        if(instance==null){
            instance = new Robot();
        }
        return instance;
    }
    public void initializeHardware(final HardwareMap hardwareMap){

        mecanumDriveTrain.initializeHardware(hardwareMap);
        intake.initializeHardware(hardwareMap);

    }
}
