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

		private static final int TOTAL_ROUNDS = 1;
		
		private static final int MAX_PROCESSOR_SPEED = 5;
		
		private static final int MAX_ROBOTS = 2;
		
		private static final int MAX_ROBOT_ID = 1;
		
		private static final int MAX_ROBOT_HEALTH = 100;
		
		private static final int MAX_ROBOT_SCORE = 100;
		
		private static final int MAX_ROBOT_KILLS = 1;
		
		private static final int MAX_ROBOT_DEATHS = 1;
		
		private static final int MAX_ROBOT_RANK = 1;
		
		private static final int MAX_ROBOT_RANK_CHANGE = 1;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE = 100;
		
		private static final int MAX_ROBOT_RANK_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT_CHANGE_PERCENT = 100;
		
		private static final int MAX_