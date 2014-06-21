/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author Developer
 */
public class Variables {
    static RobotDrive Chassidy = new RobotDrive(1,2);
    static Victor Motor1 = new Victor(3);
    static Victor Motor2 = new Victor(4);
    static boolean ShooterOn;
    static double ShooterSpeed;
    static double Trim = 0;
    static Joystick LeftStick = new Joystick(1);
    static Joystick RightStick = new Joystick(2);
    static Servo Servo = new Servo(5);
    static double InitialPosition = 100;
    static double FinalPosition = 0;
    static double InitialTime = Timer.getFPGATimestamp();
    static boolean PusherOn = false;
}
