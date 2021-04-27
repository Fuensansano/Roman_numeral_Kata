import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

class DecimalToRomanTest {

	@Test
	public void should_create_a_decimal_to_roman() {
		DecimalToRoman decimalToRoman = new DecimalToRoman();
		assertThat(decimalToRoman, instanceOf(DecimalToRoman.class));
	}
}
