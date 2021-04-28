import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

class DecimalToRomanTest {

    private DecimalToRoman converter;

    @BeforeEach
    private void initEach() {
        converter = new DecimalToRoman();
    }

	@Test
	public void should_create_a_decimal_to_roman() {
		assertThat(converter, instanceOf(DecimalToRoman.class));
	}

	@Test
    public void should_convert_1_to_I() {
        assertEquals(converter.convert(1), "I");
    }

    @Test
    public void should_convert_2_to_II() {
        assertEquals(converter.convert(2), "II");
    }

    @Test
    public void should_convert_3_to_III() {
        assertEquals(converter.convert(3), "III");
    }

    @Test
    public void should_convert_4_to_IV() {
        assertEquals(converter.convert(4), "IV");
    }

    @Test
    public void should_convert_5_to_V(){
	    assertEquals(converter.convert(5),"V");
    }

    @Test
    public void should_convert_6_to_VI(){
	    assertEquals(converter.convert(6),"VI");
    }

    @Test
    public void should_convert_9_to_IX() {
        assertEquals(converter.convert(9), "IX");
    }

    @Test
    public void should_convert_10_to_X() {
        assertEquals(converter.convert(10), "X");
    }

    @Test
    public void should_convert_13_to_XIII() {
        assertEquals(converter.convert(13), "XIII");
    }

    @Test
    public void should_convert_14_to_XIV() {
        assertEquals(converter.convert(14),"XIV");
    }

    @Test
    public void should_convert_19_to_XIX() {
        assertEquals(converter.convert(19),"XIX");
    }

    @Test
    public void should_convert_24_to_XXIV() {
        assertEquals(converter.convert(24),"XXIV");
    }

    @Test
    public void should_convert_25_to_XXV() {
    assertEquals(converter.convert(25),"XXV");
    }

    @Test
    public void should_convert_29_to_XXIX() {
        assertEquals(converter.convert(29),"XXIX");
    }

    @Test
    public void should_convert_30_to_XXX() {
        assertEquals(converter.convert(30),"XXX");
    }

    @Test
    public void should_convert_34_to_XXXIV() {
        assertEquals(converter.convert(34),"XXXIV");
    }

    @Test
    public void should_convert_35_to_XXXV() {
        assertEquals(converter.convert(35),"XXXV");
    }

    @Test
    public void should_convert_50_to_L() {
        assertEquals(converter.convert(50),"L");
    }

    @Test
    public void should_convert_40_to_XL() {
        assertEquals(converter.convert(40),"XL");
    }

    @Test
    public void should_convert_49_to_XLIX() {
        assertEquals(converter.convert(49),"XLIX");
    }

    @Test
    public void should_convert_90_to_XC() {
        assertEquals(converter.convert(90),"XC");
    }

    @Test
    public void should_convert_100_to_C() {
        assertEquals(converter.convert(100),"C");
    }

    @Test
    public void should_convert_200_to_CC() {
        assertEquals(converter.convert(200),"CC");
    }

    @Test
    public void should_convert_301_to_CCCI() {
        assertEquals(converter.convert(301),"CCCI");
    }

    @Test
    public void should_convert_400_to_CD() {
        assertEquals(converter.convert(400),"CD");
    }

    @Test
    public void should_convert_500_to_D() {
        assertEquals(converter.convert(500),"D");
    }

    @Test
    public void should_convert_900_to_CM() {
        assertEquals(converter.convert(900),"CM");
    }

    @Test
    public void should_convert_1000_to_M() {
        assertEquals(converter.convert(1000),"M");
    }

    @Test
    public void should_convert_1491_to_MCDXCI() {
        assertEquals(converter.convert(1491),"MCDXCI");
    }
}
