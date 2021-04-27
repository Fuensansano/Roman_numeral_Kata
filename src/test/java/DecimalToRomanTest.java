import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalToRomanTest {

	@Test
	public void should_create_a_decimal_to_roman() {
		DecimalToRoman decimalToRoman = new DecimalToRoman();

		boolean result = decimalToRoman.theMethod();

		assertEquals(true, result);
		assertThat(result, equalTo(true));
	}
}
