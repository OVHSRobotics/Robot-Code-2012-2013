/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Timer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends SimpleRobot {
    Joystick LeftStick = new Joystick(1);
    Joystick RightStick = new Joystick(2);
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        Auto.ShootSpeed(5, 0.60);
        Auto.ShootServo();
        Timer.delay(2);
        Auto.ShootSpeed(2, 0.70);
        Auto.ShootSpeed(2, 0.63);
        Auto.ShootServo();
        Timer.delay(1);
        Auto.ShootSpeed(1, 0.0);
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        Variables.Chassidy.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        Variables.Chassidy.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        Variables.Chassidy.setSafetyEnabled(true);
        while (isOperatorControl() && isEnabled()){
            Variables.Chassidy.tankDrive(LeftStick, RightStick);
            Telop.StartShooter();
            if (Variables.ShooterOn){
                Telop.Servo();
            }
        }

    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
