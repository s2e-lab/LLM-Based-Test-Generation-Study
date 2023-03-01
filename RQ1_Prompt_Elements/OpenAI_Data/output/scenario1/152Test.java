// CompareTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

	/**
	* Test case 1.
	* The game list is empty.
	* The guess list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCompare_1() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The game list is empty.
	* The guess list is not empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCompare_2() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The game list is not empty.
	* The guess list is empty.
	* The expected result is an empty list.
	*/
	@Test
	void testCompare_3() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	*/
	@Test
	void testCompare_4() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	*/
	@Test
	void testCompare_5() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	* The game list and the guess list have the same elements but in different order and with different values.
	*/
	@Test
	void testCompare_6() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	* The game list and the guess list have the same elements but in different order and with different values.
	* The game list and the guess list have the same elements but in different order and with different values and with different size.
	*/
	@Test
	void testCompare_7() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	* The game list and the guess list have the same elements but in different order and with different values.
	* The game list and the guess list have the same elements but in different order and with different values and with different size.
	* The game list and the guess list have the same elements but in different order and with different values and with different size and with different values.
	*/
	@Test
	void testCompare_8() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	* The game list and the guess list have the same elements but in different order and with different values.
	* The game list and the guess list have the same elements but in different order and with different values and with different size.
	* The game list and the guess list have the same elements but in different order and with different values and with different size and with different values.
	* The game list and the guess list have the same elements but in different order and with different values and with different size and with different values and with different size.
	*/
	@Test
	void testCompare_9() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The game list is not empty.
	* The guess list is not empty.
	* The expected result is not empty.
	* The game list and the guess list have the same size.
	* The game list and the guess list have the same elements.
	* The game list and the guess list have the same elements but in different order.
	* The game list and the guess list have the same elements but in different order and with different values.
	* The game list and the guess list have the same elements but in different order and with different values and with different size.
	* The game list and the guess list have the same elements but in different order and with different values and with different size and with different values.
	* The game list and the guess list have the same elements but in different order and with different values and with different size and with different values and with different size.
	* The game list and the guess list have the same elements but in different order and with different values and with different size and with different values and with different size and with different values.
	*/
	@Test
	void testCompare_10() {
		List<Integer> game = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		List<Integer> guess = new ArrayList<>();
		guess.add(4);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
}

// Game.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Game {

    private List<Integer> game;
    private List<Integer> guess;
    private List<Integer> result;

    public Game() {
        game = new ArrayList<>();
        guess = new ArrayList<>();
        result = new ArrayList<>();
    }

    public void generateGame() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            game.add(random.nextInt(10));
        }
    }

    public void generateGuess() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            guess.add(random.nextInt(10));
        }
    }

    public void compare() {
        result = Compare.compare(game, guess);
    }

    public List<Integer> getGame() {
        return game;
    }

    public List<Integer> getGuess() {
        return guess;
    }

    public List<Integer> getResult() {
        return result;
    }
}

// GameTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#generateGame()}, {@link Game#generateGuess()} and {@link Game#compare()} methods.
*/
class GameTest {
		
	/**
	* Test case 1.
	* The game list is empty.
	* The guess list is empty.
	* The result list is empty.
	*/
	@Test
	void testGame_1() {
		Game game = new Game();
		game.generateGame();
		game.generateGuess();
		game.compare();
		List<Integer> expectedGame = new ArrayList<>();
		List<Integer> expectedGuess = new ArrayList<>();
		List<Integer> expectedResult = new ArrayList<>();
		List<Integer> actualGame = game.getGame();
		List<Integer> actualGuess = game.getGuess();
		List<Integer> actualResult = game.getResult();
		assertEquals(expectedGame, actualGame);
		assertEquals(expectedGuess, actualGuess);
		assertEquals(expectedResult, actualResult);
	}
	
	/**
	* Test case 2.
	* The game list is empty.
	* The guess list is not empty.
	* The result list is empty.
	*/
	@Test
	void testGame_2() {
		Game game = new Game();
		game.generateGame();
		game.generateGuess();
		game.compare();
		List<Integer> expectedGame = new ArrayList<>();
		List<Integer> expectedGuess = new ArrayList<>();
		expectedGuess.add(1);
		expectedGuess.add(2);
		expectedGuess.add(3);
		expectedGuess.add(4);
		List<Integer> expectedResult = new ArrayList<>();
		List<Integer> actualGame = game.getGame();
		List<Integer> actualGuess = game.getGuess();
		List<Integer> actualResult = game.getResult();
		assertEquals(expectedGame, actualGame);
		assertEquals(expectedGuess, actualGuess);
		assertEquals(expectedResult, actualResult);
	}
	
	/**
	* Test case 3.
	* The game list is not empty.
	* The guess list is empty.
	* The result list is empty.
	*/
	@Test
	void testGame_3() {
		Game game = new Game();
		game.generateGame();
		game.generateGuess();
		game.compare();
		List<Integer> expectedGame = new ArrayList<>();
		expectedGame.add