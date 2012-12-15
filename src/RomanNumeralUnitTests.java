import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
	//	assertEquals("I", number.toRoman(1));//GREEN I
		//assertEquals("CCCXXXII", number.toRoman(333));//RED CCCXXXIII
		assertEquals("CCCXXXIII", number.toRoman(333));//GREEN CCCXXXIII
		//assertEquals("MI", number.toRoman(1001));//GREEN MI
		//assertEquals("DCL", number.toRoman(555));//RED DLV
	//	assertEquals("CCCLXIX", number.toRoman(369));//GREEN CCCLXIX
	//	assertEquals("II", number.toRoman(123));//RED CXXIII
		//assertEquals("MMMC", number.toRoman(4000));//RED MMMM
		//assertEquals("CII", number.toRoman(102));//GREEN CII
		//assertEquals("IIC", number.toRoman(3650));//RED MMMDCL
		
	}
	

}
