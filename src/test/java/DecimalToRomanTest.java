import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

class DecimalToRomanTest {

	@Test
	public void should_create_a_decimal_to_roman() {
		DecimalToRoman decimalToRoman = new DecimalToRoman();
		assertThat(decimalToRoman, instanceOf(DecimalToRoman.class));
	}

	@Test
    public void should_convert_1_to_I() {
        DecimalToRoman decimalToRoman = new DecimalToRoman();
        assertEquals(decimalToRoman.convert(1), "I");
    }

    @Test
    public void should_convert_2_to_II() {
        DecimalToRoman decimalToRoman = new DecimalToRoman();
        assertEquals(decimalToRoman.convert(2), "II");
    }

    @Test
    public void should_convert_3_to_III() {
        DecimalToRoman decimalToRoman = new DecimalToRoman();
        assertEquals(decimalToRoman.convert(3), "III");
    }

    @Test
    public void should_convert_4_to_IV() {
        DecimalToRoman decimalToRoman = new DecimalToRoman();
        assertEquals(decimalToRoman.convert(4), "IV");
    }

    @Test
    public void should_convert_5_to_V(){
	    DecimalToRoman decimalToRoman = new DecimalToRoman();
	    assertEquals(decimalToRoman.convert(5),"V");
    }

    @Test
    public void should_convert_6_to_VI(){
	    DecimalToRoman decimalToRoman = new DecimalToRoman();
	    assertEquals(decimalToRoman.convert(6),"VI");
    }
}
