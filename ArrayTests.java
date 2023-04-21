import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3, 2, 1}, input2);
  }

  @Test
  public void testReversed2() {
    int [] input2 = { 1, 2, 3 };
    assertArrayEquals(new int[] {3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAvgWOutLowest() {
    double[] input1 = { };
    double[] input2 = { 2.4 };
    double[] input3 = { 2.4, 1.7, 23.6 };
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 0.0, 0.001);
    assertEquals(ArrayExamples.averageWithoutLowest(input2), 0.0, 0.001);
    assertEquals(ArrayExamples.averageWithoutLowest(input3), 13.0, 0.001);
  }
}
