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
public class Auto extends Variables {
    public static void DriveStright(double Duration, double Speed){
        InitialTime = Timer.getFPGATimestamp();
        while (Timer.getFPGATimestamp() < InitialTime+Duration){
            Chassidy.drive(Speed, 0.0);
        }
    }
    public static void Stop(){
        Chassidy.drive(0.0, 0.0);
    }
    public static void ShootSpeed(double Duration, double Speed){
        InitialTime = Timer.getFPGATimestamp();
        while (Timer.getFPGATimestamp() < InitialTime+Duration){
        SmartDashboard.putNumber("Motor1", Motor1.getSpeed());
        SmartDashboard.putNumber("Motor2", Motor2.getSpeed());
        Motor1.set(Speed);
        Motor2.set(Speed);}
    }
    public static void ShootServo(){
        Servo.setAngle(InitialPosition);
        Timer.delay(0.5);
        Servo.setAngle(FinalPosition);
        Timer.delay(0.8);
        Servo.setAngle(InitialPosition);
    }
}

