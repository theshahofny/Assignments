package com.tiy.ssa.weektwo.assignmentone;

//import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lists {

	public static <T>List<T> match(List<T> one, List<T> other)
	{

		List<T> sameItems = new ArrayList<T>();

		for(T item1 : one ){
			for(T item2 : other){
				if(item1.equals(item2) && !(sameItems.contains(item1) || sameItems.contains(item2)) ){
					sameItems.add(item1);
				}
			}
		}

		return sameItems;
	}

	public static List<String> descendingBySize(List<String> input)
	{
		List<String> sorted = new ArrayList<>(input);
		sorted.sort(Comparator.comparing(String::length).reversed());

		//		for(int i=0;i<input.size();i++){
		//            for(int j=0;j<input.size()-i-1;j++){
		//                if( (input.get(j)).length() > (input.get(j+1)).length() ){
		//                    Collections.swap(input, j, j+1);
		//                }
		//            }
		//        }

		return sorted;

	}
}

