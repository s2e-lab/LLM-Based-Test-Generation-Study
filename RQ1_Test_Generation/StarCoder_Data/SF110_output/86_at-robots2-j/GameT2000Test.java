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

    private final FrameBuilder frameBuilder = new FrameBuilder();

    private final Game game = new Game(10, frameBuilder);

    private final RobotFactory robotFactory = new RobotFactory() {
        public Robot createRobot(RoundState roundState, int maxProcessorSpeed, RobotScoreKeeper robotScoreKeeper, FrameBuilder frameBuilder, int id) {
            return new Robot() {
                public void step() {
                }
            };
        }
    };

    @Test
    void testStepRound() {
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robotFactory);
        game.addEntrant(robot