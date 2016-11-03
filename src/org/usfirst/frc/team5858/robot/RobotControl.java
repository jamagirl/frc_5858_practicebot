package org.usfirst.frc.team5858.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * Weird Robot Flipper Thingy class for controlling all actions of the robot!!!!
 *
 *  The robot shall do the following
 *   + Have flips in the front and back on each side that are for deflecting balls?
 *     - Each flipper will operate on it's own
 *     - A helper method is added that will flip them all at once
 *   + Use a west coast drive train (subclass of tank drive train), to move forward/backward and rotate left and right
 *      - 3 wheels on each side, and middle one at different height (Ange - i think that is what I heard)
 *   + An arm that is responsible for the robot to hang with (will have grips on it to hook better)
 *
 *   \todo Add method descriptions of how each one will work.  Try to leave out implementation details (such as the type of drive train)
 *          it can be added in the top description up here
 *
 *   \todo Verify the value types that the joystick sends out via the Software API,  will want to note if +Y is forward or if -Y is forward
 */
public class RobotControl {

	VictorSP leftFrontFlipper;
	double flipperSpeed;
	double flipperTime;
	
    public RobotControl() {
    	leftFrontFlipper = new VictorSP(0);
    	flipperSpeed = 1.0;
    	flipperTime = 0.5;
    }
    
    // DRIVE TRAIN
    /**
     * THIS IS AN EXAMPLE COMMENT ON HOW THESE SHOULD LOOK
     *
     * Commands the robot to move in the forward direction with a range of 0.0 to 1.0, where 0.0 is at the stop position,
     * 0.5 is half speed, and 1.0 is moving forward at maximum speed.
     * @param speed
     */
    public void moveFoward( double speed ) {

    }

    /**
     * Hint:  To change direction the robot will need to turn.
     * @param speed
     */
    public void rotateLeft( double speed ) {


    }

    public void rotateRight( double speed ) {

    }


    // ARM
    /**
     * \todo Talk about how the speed of the forward will be calculated (avoid using acronyms and spell out full words)
     */
    public void armPivotForward() {

    }

    public void armPivotBackwards() {

    }

    public void armExtendOut() {

    }

    public void armRetractIn() {

    }

    // FLIPPERS

    // 4 buttons on the joy stick, each joy stick contains (pair in the front and back)
    // trigger at once
    public void flipFrontLeftFlippers() {
    	leftFrontFlipper.set(flipperSpeed);
    	Timer.delay(flipperTime);
    	leftFrontFlipper.set(-flipperSpeed);
    	Timer.delay(flipperTime);
    	leftFrontFlipper.set(0);
    }

    public void flipFrontRightFlipper() {

    }

    public void flipBackLeftFlipper() {

    }

    public void flipBackRightFlipper() {

    }

    public void flipAllFlippers() {

    }
}