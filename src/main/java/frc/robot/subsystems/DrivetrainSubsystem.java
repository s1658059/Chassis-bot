// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.Encoder;

//import java.lang.invoke.ClassSpecializer.Factory;

//import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel;
//import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import frc.robot.Constants;
//import frc.robot.Constants;
import frc.robot.Constants;

public class DrivetrainSubsystem extends SubsystemBase {
  
  VictorSP leftMotor1 = new VictorSP(Constants.DriveTrainConstants.LEFT_1_DRIVETRAIN_MOTOR_PORT);
  VictorSP leftMotor2 = new VictorSP(Constants.DriveTrainConstants.LEFT_2_DRIVETRAIN_MOTOR_PORT);
  VictorSP rightMotor1 = new VictorSP(Constants.DriveTrainConstants.RIGHT_1_DRIVETRAIN_MOTOR_PORT);
  VictorSP rightMotor2 = new VictorSP(Constants.DriveTrainConstants.RIGHT_2_DRIVETRAIN_MOTOR_PORT);

  MotorControllerGroup leftControllerGroup = new MotorControllerGroup(leftMotor1, leftMotor2);
  MotorControllerGroup rightControllerGroup = new MotorControllerGroup(rightMotor1, rightMotor2);
  
  DifferentialDrive differentialDrive = new DifferentialDrive(leftControllerGroup, rightControllerGroup);

  /** Creates a new ExampleSubsystem. */
  public DrivetrainSubsystem() {
    
    leftControllerGroup.setInverted(true);
    rightControllerGroup.setInverted(false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void arcadeDrive(double fwd, double rot) {
    differentialDrive.arcadeDrive(fwd, rot);
  
    
  }

}