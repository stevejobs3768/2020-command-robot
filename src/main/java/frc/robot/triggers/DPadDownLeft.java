/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.triggers;

import edu.wpi.first.wpilibj2.command.button.Trigger;

import frc.robot.Constants.OIConstants;

/**
 * DPad Down Left Trigger
 */
public class DPadDownLeft extends Trigger {
    private final int id;

    public DPadDownLeft(int joyID) {
        id = joyID;
    }

    @Override
    public boolean get() {
        return OIConstants.joysticks[id].getPOV(0) <= 247
                && OIConstants.joysticks[id].getPOV(0) >= 202;
    }
}