package org.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sample {

	public static void main(String[] args) {
	
		
		Set<Character> si=new TreeSet<Character>();
				
		si.add('A'); //65-90
		si.add(' '); //32
		si.add('9'); //48-57
		si.add('a'); //97-122
		si.add('*'); //42
		
		System.out.println(si);
		
	}

}
