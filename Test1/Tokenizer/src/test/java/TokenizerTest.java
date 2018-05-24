import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TokenizerTest {

    @Test
    public void shouldReturnEmptySetWhenStringEmpty() {
        assertThat(Tokenizer.tokenize("")).isEqualTo(new ArrayList<>());
    }

    @Test
    public void shouldReturnEmptySetWhenStringNull() {
        assertThat(Tokenizer.tokenize(null)).isEqualTo(new ArrayList<>());
    }

    @Test
    public void shouldReturnOneElementSet() {
        List<String> expected = new ArrayList<>();
        expected.add("1");
        assertThat(Tokenizer.tokenize("1")).isEqualTo(expected);
    }

    @Test
    public void shouldReturnThreeElementSet() {
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("+");
        expected.add("1");
        assertThat(Tokenizer.tokenize("1+1")).isEqualTo(expected);
    }

}

