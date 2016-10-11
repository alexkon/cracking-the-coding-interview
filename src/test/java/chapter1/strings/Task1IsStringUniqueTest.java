package chapter1.strings;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class Task1IsStringUniqueTest {

    @Test
    public void testIsUniqueWithSetMethod() {

        Task1IsStringUnique uniqueUtil = new Task1IsStringUnique();

        // test normal string
        assertThat(uniqueUtil.isUniqueWithSet("abcdef"), is(true));

        // test bad string
        assertThat(uniqueUtil.isUniqueWithSet("abcdefa"), not(true));

        // test one character  string
        assertThat(uniqueUtil.isUniqueWithSet("a"), is(true));

        // test empty string
        assertThat(uniqueUtil.isUniqueWithSet(""), is(true));

        // test null string
        assertThat(uniqueUtil.isUniqueWithSet(null), is(true));
    }

    @Test
    public void testIsUniqueWithSortMethod() {

        Task1IsStringUnique uniqueUtil = new Task1IsStringUnique();

        // test normal string
        assertThat(uniqueUtil.isUniqueWithSort("abcdef"), is(true));

        // test bad string
        assertThat(uniqueUtil.isUniqueWithSort("abcdefa"), not(true));

        // test one character  string
        assertThat(uniqueUtil.isUniqueWithSort("a"), is(true));

        // test empty string
        assertThat(uniqueUtil.isUniqueWithSort(""), is(true));

        // test null string
        assertThat(uniqueUtil.isUniqueWithSort(null), is(true));
    }

    @Test
    public void testIsUniqueWithAsciiMethod() {

        Task1IsStringUnique uniqueUtil = new Task1IsStringUnique();

        // test normal string
        assertThat(uniqueUtil.isUniqueWithAscii("abcdef"), is(true));

        // test bad string
        assertThat(uniqueUtil.isUniqueWithAscii("abcdefa"), not(true));

        // test one character  string
        assertThat(uniqueUtil.isUniqueWithAscii("a"), is(true));

        // test empty string
        assertThat(uniqueUtil.isUniqueWithAscii(""), is(true));

        // test null string
        assertThat(uniqueUtil.isUniqueWithAscii(null), is(true));

        // test not ASCII symbols
        assertThat(uniqueUtil.isUniqueWithAscii("abcdefы"), not(true));

        // test all ASCII symbols
        assertThat(uniqueUtil.isUniqueWithAscii("abcxyz"), is(true));

        // test digits
        assertThat(uniqueUtil.isUniqueWithAscii("abc123"), not(true));
    }
}
