/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2478.robot;

public class RobotMap {
	
	public static int LEFT_FRONT = 2;
	public static int LEFT_BACK = 4;
	public static int RIGHT_FRONT = 1;
	public static int RIGHT_BACK = 3;
	
	public static int XBOX_ID = 0;
	
	public static double ANGULAR_P = 0.02325;
//	public static double ANGULAR_I = 0.0003; //turning
	public static double ANGULAR_I = 0.000; //correction
	public static double ANGULAR_D = 0.02225; //01725
//	public static double ANGULAR_TOLERANCE = 0.05;
	public static double ANGULAR_SETPOINT = 0;
	
	public static double DRIVE_SPEED = 0.9;
	public static double MOTOR_GAINS = 0.6;

}