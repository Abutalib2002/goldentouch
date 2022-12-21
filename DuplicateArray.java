package CodeDays;

public class DuplicateArray {
private static void FindingDuplicate(int [] array)
{
	for(int i = 0 ; i < array.length; i ++) {
		for(int j= i +1; j < array.length;j ++) {
			if (array[i] == array[j]) {
				System.out.println("The Duplicate Elements are " + array[i]);
			}
		}
	}
}
public static void main(String[] args)


{
	int [] array = {1,3,3,2,5,6,6,45,664,64,64,64,8,9,0};
	FindingDuplicate(array);
}
}
