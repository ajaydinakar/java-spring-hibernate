package debugpractice;

import java.util.*;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] j = { 1, 2, 5, 4, 6, 9 };
		int sum = 0;
		for (int i : j)
			sum = sum + i;

		System.out.println(sum);
	}
}
