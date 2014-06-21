/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Developer
 */
public class Telop extends Variables {
    
    public static void StartShooter(){
        SmartDashboard.putNumber("Motor1", Motor1.getSpeed());
        SmartDashboard.putNumber("Motor2", Motor2.getSpeed());
        SmartDashboard.putNumber("Servo", Servo.getAngle());
        if (ShooterOn == true){
            Trim = (RightStick.getZ()+1)/8;
        }
        else {
            Trim = 0;
        }
        if (RightStick.getRawButton(6)){
            ShooterOn = true;
            ShooterSpeed = 0.25;
        }
        else if (RightStick.getRawButton(7)){
            ShooterOn = true;
            ShooterSpeed = 0.50;
        }
        else if (RightStick.getRawButton(11)){
            ShooterOn = true;
            ShooterSpeed = 0.75;
        }
        else if (RightStick.getRawButton(10)){
            ShooterOn = true;
            ShooterSpeed = 1.0;
        }
        else if (RightStick.getRawButton(2)){
            ShooterOn = false;
            ShooterSpeed = 0.0;
        }
        Motor1.set(ShooterSpeed-Trim);
        Motor2.set(ShooterSpeed-Trim);
    }
    public static void Servo(){
        if (RightStick.getTrigger()){
            PusherOn = true;
            InitialTime = Timer.getFPGATimestamp();
            Servo.setAngle(FinalPosition);
            
        }
        if (PusherOn = true && InitialTime <= Timer.getFPGATimestamp()-0.1){
           PusherOn = false;
           Servo.setAngle(InitialPosition);
        }
    }
}
