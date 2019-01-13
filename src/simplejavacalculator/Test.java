package simplejavacalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import simplejavacalculator.Calculator.BiOperatorModes;

class Test {

	void testPlus() {
		Calculator.BiOperatorModes mode = BiOperatorModes.add;
		Calculator calc = new Calculator();
		calc.setNum1(21.0);
		calc.setMode(mode);
		calc.setNum2(8.99);
		Double wynik = calc.calculateBiImpl();
		assertEquals(29.99, wynik, 0);
		
		
	}

}
