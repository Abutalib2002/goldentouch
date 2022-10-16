package JavaExercise;
import java.util.Arrays;
import java.util.Collections;
public class Reversearray {
public static void main(String[] args) {
	int array[] = {10,20,30,40,50,60};
	System.out.println(Arrays.toString(array));
Collections.reverse(Arrays.asList(array));
System.out.println(Arrays.asList(array));

}
}
