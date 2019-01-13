package simplejavacalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

import simplejavacalculator.Calculator;
import simplejavacalculator.Calculator.BiOperatorModes;

class Test {

	@org.junit.jupiter.api.Test
	void testPlus() {
		Calculator.BiOperatorModes mode = BiOperatorModes.add;
		Calculator calc = new Calculator();
		calc.setNum1(21.00);
		calc.setMode(mode);
		calc.setNum2(8.99);
		Double wynik = calc.calculateBiImpl();
		assertEquals(29.99, wynik, 0.00000001);
		
		
	}

}
