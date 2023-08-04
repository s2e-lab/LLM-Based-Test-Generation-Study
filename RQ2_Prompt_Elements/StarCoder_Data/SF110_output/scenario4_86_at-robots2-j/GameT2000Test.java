// GameTest.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#stepRound()} method.
*/
class GameTest {

    private static final int ROUNDS = 10;

    private static final int ENTRANTS = 10;

    private static final int MAX_PROCESSOR_SPEED = 5;

    private static final int MAX_PROCESSOR_SPEED_STEP = 1;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME = 100;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_STEP = 10;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN = 10;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_STEP = 10;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_STEP = 1;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN = 10;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN = 100;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX = 10;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX_STEP = 10;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_STEP = 1;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_STEP = 10;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_STEP = 100;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MIN = 10;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MIN = 100;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MIN = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MAX = 100;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX_MIN = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MIN_STEP = 1;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MIN_STEP = 10;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MIN_STEP = 100;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX_MIN_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MIN_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MIN_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MIN_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX_MIN_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MIN_MIN = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MIN_MIN = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MIN_MIN = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MAX_MIN = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MAX_MIN = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MAX_MIN = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX_MIN_MIN = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MIN_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MIN_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MIN_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MAX_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MAX_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MAX_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX_MIN_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MIN_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MIN_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MIN_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MAX_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MAX_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MAX_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX_MIN_MAX_MAX = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MIN_MIN_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MIN_MIN_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MIN_MIN_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MAX_MIN_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MAX_MIN_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MAX_MIN_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MAX_MIN_MIN_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MIN_MIN_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MAX_MIN_MIN_MAX_STEP = 1000;

    private static final int MAX_PROCESSOR_SPEED_STEP_TIME_MIN_MAX_MIN_