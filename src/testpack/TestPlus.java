package testpack;
import org.junit.Test;
import static org.junit.Assert.*;


import simplejavacalculator.Calculator;
import simplejavacalculator.Calculator.BiOperatorModes;

public class TestPlus {

	@Test
	public void test() {
		Calculator.BiOperatorModes mode = BiOperatorModes.add;
		Calculator calc = new Calculator();
		calc.setNum1(21.0);
		calc.setMode(mode);
		calc.setNum2(8.99);
		Double wynik = calc.calculateBiImpl();
		assertEquals(29.99, wynik, 0.0000001);
	}

}
