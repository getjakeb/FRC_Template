package com.bovine.frc;

import com.bovine.frc.config.ConfigurationRegistry;
import com.bovine.frc.handler.ConfigurationHandler;
import com.bovine.frc.init.MotorControllers;
import com.bovine.frc.init.Pneumatics;
import edu.wpi.first.wpilibj.SimpleRobot;

public class Robot extends SimpleRobot
{

    /**
     * Robot-wide initialization code should go here.
     * <p/>
     * Users should override this method for default Robot-wide initialization which will
     * be called when the robot is first powered on.
     * <p/>
     * Called exactly 1 time when the competition starts.
     */
    @Override
    protected void robotInit()
    {
        super.robotInit();
        MotorControllers.init();
        Pneumatics.init();
        ConfigurationRegistry.init();
    }

    /**
     * Disabled should go here.
     * Users should overload this method to run code that should run while the field is
     * disabled.
     * <p/>
     * Called once each time the robot enters the disabled state.
     */
    @Override
    protected void disabled()
    {
        super.disabled();
    }

    /**
     * Autonomous should go here.
     * Users should add autonomous code to this method that should run while the field is
     * in the autonomous period.
     * <p/>
     * Called once each time the robot enters the autonomous state.
     */
    @Override
    public void autonomous()
    {
        super.autonomous();
    }

    /**
     * Operator control (tele-operated) code should go here.
     * Users should add Operator Control code to this method that should run while the field is
     * in the Operator Control (tele-operated) period.
     * <p/>
     * Called once each time the robot enters the operator-controlled state.
     */
    @Override
    public void operatorControl()
    {
        super.operatorControl();
    }

    /**
     * Test code should go here.
     * Users should add test code to this method that should run while the robot is in test mode.
     */
    @Override
    public void test()
    {
        super.test();
    }
}
