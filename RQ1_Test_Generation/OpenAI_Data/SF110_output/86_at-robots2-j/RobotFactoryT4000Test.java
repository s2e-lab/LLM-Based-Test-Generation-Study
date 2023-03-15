// RobotFactoryTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.computer.*;
import net.virtualinfinity.atrobots.debugger.*;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RobotFactory}.
* It contains ten unit test cases for the {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)} method.
*/
class RobotFactoryTest {

		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
		
		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot2() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
		
		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot3() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
		
		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot4() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
		
		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot5() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
		
		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot6() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
		
		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot7() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
		
		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot8() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
		
		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot9() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
		
		/**
		* Test case for {@link RobotFactory#createRobot(RoundState, int, RobotScoreKeeper, Arena, int)}
		*
		* @throws Exception
		*/
		@Test
		void testCreateRobot10() throws Exception {
				RobotFactory robotFactory = new RobotFactory("name", new Program(new byte[0]), new HardwareSpecification(), new DebugInfo(), 0, "message");
				Robot robot = robotFactory.createRobot(new RoundState(), 0, new RobotScoreKeeper(), new Arena(), 0);
				assertNotNull(robot);
		}
}

// RobotScoreKeeper.java
package net.virtualinfinity.atrobots.robot;

import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.computer.Computer;
import net.virtualinfinity.atrobots.computer.DebugListener;
import net.virtualinfinity.atrobots.computer.Debugger;
import net.virtualinfinity.atrobots.computer.Memory;
import net.virtualinfinity.atrobots.debugger.DebugConsole;
import net.virtualinfinity.atrobots.debugger.DebuggerFactory;
import net.virtualinfinity.atrobots.debugger.DebuggerFactoryImpl;
import net.virtualinfinity.atrobots.debugger.DebuggerFactoryListener;
import net.virtualinfinity.atrobots.debugger.DebuggerListener;
import net.virtualinfinity.atrobots.debugger.DebuggerListenerAdapter;
import net.virtualinfinity.atrobots.debugger.DebuggerState;
import net.virtualinfinity.atrobots.debugger.DebuggerStateListener;
import net.virtualinfinity.atrobots.debugger.DebuggerStateListenerAdapter;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSource;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceImpl;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListener;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerAdapter;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl2;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl3;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl4;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl5;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl6;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl7;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl8;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl9;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl10;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl11;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl12;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl13;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl14;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl15;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl16;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl17;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl18;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl19;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl20;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl21;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl22;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl23;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl24;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl25;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl26;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl27;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl28;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl29;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl30;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl31;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl32;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl33;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl34;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl35;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl36;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl37;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl38;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl39;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl40;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl41;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl42;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl43;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl44;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl45;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl46;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl47;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl48;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl49;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl50;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl51;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl52;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl53;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl54;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl55;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl56;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl57;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl58;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl59;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl60;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl61;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl62;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl63;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl64;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl65;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl66;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl67;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl68;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl69;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl70;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl71;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl72;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl73;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl74;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl75;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl76;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl77;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl78;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl79;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl80;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl81;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl82;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl83;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl84;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl85;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl86;
import net.virtualinfinity.atrobots.debugger.DebuggerStateSourceListenerImpl87;
import net.virtualinfinity.atrobots.debugger.