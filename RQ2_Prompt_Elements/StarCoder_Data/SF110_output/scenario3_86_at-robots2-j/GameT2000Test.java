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

    /**
     * Test of {@link Game#stepRound()} method.
     */
    @Test
    void testStepRound() {
        final RobotFactory robotFactory = new RobotFactory();
        final RobotScoreKeeper robotScoreKeeper = new RobotScoreKeeper();
        final Game game = new Game(robotFactory, robotScoreKeeper);
        final SimulationObserver simulationObserver = new SimulationObserver();
        final FrameBuilder frameBuilder = new FrameBuilder();
        final RoundState roundState = new RoundState(simulationObserver, frameBuilder);
        final Robot robot = robotFactory.createRobot(roundState);
        final RobotScore robotScore = new FinalRobotScore(robot);
        robotScoreKeeper.addRobotScore(robotScore);
        game.addRoundListener(robotScore);
        game.addRoundListener(simulationObserver);
        game.addRoundListener(frameBuilder);
        game.addRoundListener(robot);
        game.addRoundListener(robotScoreKeeper);
        game.addRoundListener(game);
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {
                System.out.println("Round started.");
            }

            @Override
            public void roundEnded(RoundState roundState) {
                System.out.println("Round ended.");
            }
        });
        game.addRoundListener(new RoundListener() {
            @Override
            public void roundStarted(RoundState roundState) {