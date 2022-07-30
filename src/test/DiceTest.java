package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.skt.entity.Dice;

class DiceTest {
	Dice dice;
	
	@BeforeEach
	void initialiseNewDice() {
		dice = new Dice();
	}

	@RepeatedTest(1000)
	void valueRangeVarificationTest() {
		int actual = dice.roll();
		assertTrue(actual>=1 && actual<=6);
	}

}
