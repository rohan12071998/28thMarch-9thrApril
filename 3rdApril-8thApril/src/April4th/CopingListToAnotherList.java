package April4th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopingListToAnotherList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> first=Arrays.asList(2,3,4);
		List<Integer>copy=new ArrayList<>(first);
		System.out.println(copy.toString());
		

	}

}
