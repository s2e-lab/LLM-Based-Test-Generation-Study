// GameModel_1Test.java
package common;

import java.awt.Point;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
import java.util.Map.Entry;
import messages.round.RoundTimeOverMsg;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameModel}.
* It contains ten unit test cases for the {@link GameModel#getGameObjectById(int)} method.
*/
class GameModel_1Test {

		/**
		* Test case 1 for {@link GameModel#getGameObjectById(int)}
		* 
		* @see GameModel#getGameObjectById(int)
		*/
		@Test
		void testGetGameObjectById_1() {
				GameModel gameModel = new GameModel();
				gameModel.addGameObject(1, new Player(1, new Point(0, 0), "", ""));
				gameModel.addGameObject(2, new Player(2, new Point(0, 0), "", ""));
				gameModel.addGameObject(3, new Player(3, new Point(0, 0), "", ""));
				gameModel.addGameObject(4, new Player(4, new Point(0, 0), "", ""));
				gameModel.addGameObject(5, new Player(5, new Point(0, 0), "", ""));
				gameModel.addGameObject(6, new Player(6, new Point(0, 0), "", ""));
				gameModel.addGameObject(7, new Player(7, new Point(0, 0), "", ""));
				gameModel.addGameObject(8, new Player(8, new Point(0, 0), "", ""));
				gameModel.addGameObject(9, new Player(9, new Point(0, 0), "", ""));
				gameModel.addGameObject(10, new Player(10, new Point(0, 0), "", ""));
				gameModel.addGameObject(11, new Player(11, new Point(0, 0), "", ""));
				gameModel.addGameObject(12, new Player(12, new Point(0, 0), "", ""));
				gameModel.addGameObject(13, new Player(13, new Point(0, 0), "", ""));
				gameModel.addGameObject(14, new Player(14, new Point(0, 0), "", ""));
				gameModel.addGameObject(15, new Player(15, new Point(0, 0), "", ""));
				gameModel.addGameObject(16, new Player(16, new Point(0, 0), "", ""));
				gameModel.addGameObject(17, new Player(17, new Point(0, 0), "", ""));
				gameModel.addGameObject(18, new Player(18, new Point(0, 0), "", ""));
				gameModel.addGameObject(19, new Player(19, new Point(0, 0), "", ""));
				gameModel.addGameObject(20, new Player(20, new Point(0, 0), "", ""));
				gameModel.addGameObject(21, new Player(21, new Point(0, 0), "", ""));
				gameModel.addGameObject(22, new Player(22, new Point(0, 0), "", ""));
				gameModel.addGameObject(23, new Player(23, new Point(0, 0), "", ""));
				gameModel.addGameObject(24, new Player(24, new Point(0, 0), "", ""));
				gameModel.addGameObject(25, new Player(25, new Point(0, 0), "", ""));
				gameModel.addGameObject(26, new Player(26, new Point(0, 0), "", ""));
				gameModel.addGameObject(27, new Player(27, new Point(0, 0), "", ""));
				gameModel.addGameObject(28, new Player(28, new Point(0, 0), "", ""));
				gameModel.addGameObject(29, new Player(29, new Point(0, 0), "", ""));
				gameModel.addGameObject(30, new Player(30, new Point(0, 0), "", ""));
				gameModel.addGameObject(31, new Player(31, new Point(0, 0), "", ""));
				gameModel.addGameObject(32, new Player(32, new Point(0, 0), "", ""));
				gameModel.addGameObject(33, new Player(33, new Point(0, 0), "", ""));
				gameModel.addGameObject(34, new Player(34, new Point(0, 0), "", ""));
				gameModel.addGameObject(35, new Player(35, new Point(0, 0), "", ""));
				gameModel.addGameObject(36, new Player(36, new Point(0, 0), "", ""));
				gameModel.addGameObject(37, new Player(37, new Point(0, 0), "", ""));
				gameModel.addGameObject(38, new Player(38, new Point(0, 0), "", ""));
				gameModel.addGameObject(39, new Player(39, new Point(0, 0), "", ""));
				gameModel.addGameObject(40, new Player(40, new Point(0, 0), "", ""));
				gameModel.addGameObject(41, new Player(41, new Point(0, 0), "", ""));
				gameModel.addGameObject(42, new Player(42, new Point(0, 0), "", ""));
				gameModel.addGameObject(43, new Player(43, new Point(0, 0), "", ""));
				gameModel.addGameObject(44, new Player(44, new Point(0, 0), "", ""));
				gameModel.addGameObject(45, new Player(45, new Point(0, 0), "", ""));
				gameModel.addGameObject(46, new Player(46, new Point(0, 0), "", ""));
				gameModel.addGameObject(47, new Player(47, new Point(0, 0), "", ""));
				gameModel.addGameObject(48, new Player(48, new Point(0, 0), "", ""));
				gameModel.addGameObject(49, new Player(49, new Point(0, 0), "", ""));
				gameModel.addGameObject(50, new Player(50, new Point(0, 0), "", ""));
				gameModel.addGameObject(51, new Player(51, new Point(0, 0), "", ""));
				gameModel.addGameObject(52, new Player(52, new Point(0, 0), "", ""));
				gameModel.addGameObject(53, new Player(53, new Point(0, 0), "", ""));
				gameModel.addGameObject(54, new Player(54, new Point(0, 0), "", ""));
				gameModel.addGameObject(55, new Player(55, new Point(0, 0), "", ""));
				gameModel.addGameObject(56, new Player(56, new Point(0, 0), "", ""));
				gameModel.addGameObject(57, new Player(57, new Point(0, 0), "", ""));
				gameModel.addGameObject(58, new Player(58, new Point(0, 0), "", ""));
				gameModel.addGameObject(59, new Player(59, new Point(0, 0), "", ""));
				gameModel.addGameObject(60, new Player(60, new Point(0, 0), "", ""));
				gameModel.addGameObject(61, new Player(61, new Point(0, 0), "", ""));
				gameModel.addGameObject(62, new Player(62, new Point(0, 0), "", ""));
				gameModel.addGameObject(63, new Player(63, new Point(0, 0), "", ""));
				gameModel.addGameObject(64, new Player(64, new Point(0, 0), "", ""));
				gameModel.addGameObject(65, new Player(65, new Point(0, 0), "", ""));
				gameModel.addGameObject(66, new Player(66, new Point(0, 0), "", ""));
				gameModel.addGameObject(67, new Player(67, new Point(0, 0), "", ""));
				gameModel.addGameObject(68, new Player(68, new Point(0, 0), "", ""));
				gameModel.addGameObject(69, new Player(69, new Point(0, 0), "", ""));
				gameModel.addGameObject(70, new Player(70, new Point(0, 0), "", ""));
				gameModel.addGameObject(71, new Player(71, new Point(0, 0), "", ""));
				gameModel.addGameObject(72, new Player(72, new Point(0, 0), "", ""));
				gameModel.addGameObject(73, new Player(73, new Point(0, 0), "", ""));
				gameModel.addGameObject(74, new Player(74, new Point(0, 0), "", ""));
				gameModel.addGameObject(75, new Player(75, new Point(0, 0), "", ""));
				gameModel.addGameObject(76, new Player(76, new Point(0, 0), "", ""));
				gameModel.addGameObject(77, new Player(77, new Point(0, 0), "", ""));
				gameModel.addGameObject(78, new Player(78, new Point(0, 0), "", ""));
				gameModel.addGameObject(79, new Player(79, new Point(0, 0), "", ""));
				gameModel.addGameObject(80, new Player(80, new Point(0, 0), "", ""));
				gameModel.addGameObject(81, new Player(81, new Point(0, 0), "", ""));
				gameModel.addGameObject(82, new Player(82, new Point(0, 0), "", ""));
				gameModel.addGameObject(83, new Player(83, new Point(0, 0), "", ""));
				gameModel.addGameObject(84, new Player(84, new Point(0, 0), "", ""));
				gameModel.addGameObject(85, new Player(85, new Point(0, 0), "", ""));
				gameModel.addGameObject(86, new Player(86, new Point(0, 0), "", ""));
				gameModel.addGameObject(87, new Player(87, new Point(0, 0), "", ""));
				gameModel.addGameObject(88, new Player(88, new Point(0, 0), "", ""));
				gameModel.addGameObject(89, new Player(89, new Point(0, 0), "", ""));
				gameModel.addGameObject(90, new Player(90, new Point(0, 0), "", ""));
				gameModel.addGameObject(91, new Player(91, new Point(0, 0), "", ""));
				gameModel.addGameObject(92, new Player(92, new Point(0, 0), "", ""));
				gameModel.addGameObject(93, new Player(93, new Point(0, 0), "", ""));
				gameModel.addGameObject(94, new Player(94, new Point(0, 0), "", ""));
				gameModel.addGameObject(95, new Player(95, new Point(0, 0), "", ""));
				gameModel.addGameObject(96, new Player(96, new Point(0, 0), "", ""));
				gameModel.addGameObject(97, new Player(97, new Point(0, 0), "", ""));
				gameModel.addGameObject(98, new Player(98, new Point(0, 0), "", ""));
				gameModel.addGameObject(99, new Player(99, new Point(0, 0), "", ""));
				gameModel.addGameObject(100, new Player(100, new Point(0, 0), "", ""));
				gameModel.addGameObject(101, new Player(101, new Point(0, 0), "", ""));
				gameModel.addGameObject(102, new Player(102, new Point(0, 0), "", ""));
				gameModel.addGameObject(103, new Player(103, new Point(0, 0), "", ""));
				gameModel.addGameObject(104, new Player(104, new Point(0, 0), "", ""));
				gameModel.addGameObject(105, new Player(105, new Point(0, 0), "", ""));
				gameModel.addGameObject(106, new Player(106, new Point(0, 0), "", ""));
				gameModel.addGameObject(107, new Player(107, new Point(0, 0), "", ""));
				gameModel.addGameObject(108, new Player(108, new Point(0, 0), "", ""));
				gameModel.addGameObject(109, new Player(109, new Point(0, 0), "", ""));
				gameModel.addGameObject(110, new Player(110, new Point(0, 0), "", ""));
				gameModel.addGameObject(111, new Player(111, new Point(0, 0), "", ""));
				gameModel.addGameObject(112, new Player(112, new Point(0, 0), "", ""));
				gameModel.addGameObject(113, new Player(113, new Point(0, 0), "", ""));
				gameModel.addGameObject(114, new Player(114, new Point(0, 0), "", ""));
				gameModel.addGameObject(115, new Player(115, new Point(0, 0), "", ""));
				gameModel.addGameObject(116, new Player(116, new Point(0, 0), "", ""));
				gameModel.addGameObject(117, new Player(117, new Point(0, 0), "", ""));
				gameModel.addGameObject(118, new Player(118, new Point(0, 0), "", ""));
				gameModel.addGameObject(119, new Player(119, new Point(0, 0), "", ""));
				gameModel.addGameObject(120, new Player(120, new Point(0, 0), "", ""));
				gameModel.addGameObject(121, new Player(121, new Point(0, 0), "", ""));
				gameModel.addGameObject(122, new Player(122, new Point(0, 0), "", ""));
				gameModel.addGameObject(123, new Player(123, new Point(0, 0), "", ""));
				gameModel.addGameObject(124, new Player(124, new Point(0, 0), "", ""));
				gameModel.addGameObject(125, new Player(125, new Point(0, 0), "", ""));
				gameModel.addGameObject(126, new Player(126, new Point(0, 0), "", ""));
				gameModel.addGameObject(