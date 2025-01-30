package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayList {
public static void main(String[] args) {
	ArrayList list=new ArrayList<>(Arrays.asList("sakshi","krishna","pruthvi","apoorva"));
	
	
	Collections.reverse(list);
	
	
	System.out.println(list);
}
}
