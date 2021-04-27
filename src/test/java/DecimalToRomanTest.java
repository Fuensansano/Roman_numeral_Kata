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
}
