import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
    public void filterTest() {
        StringCheckerObj sc = new StringCheckerObj();

        List<String> input1 = new ArrayList<>(
            Arrays.asList("asdf", "bcd", "efas")
        );
        List<String> check = new ArrayList<>(
            Arrays.asList("asdf", "efas")
        );
        assertEquals(ListExamples.filter(input1, sc), check);
    }
}

class StringCheckerObj implements StringChecker {
    @Override
    public boolean checkString(String s) {
        return s.contains("a");
    }
}