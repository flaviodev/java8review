package br.com.flaviodev.methodreferences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReferences {

	public static void main(String[] args) {

		List<String> words = new ArrayList<String>();
		words.add("updating");
		words.add("and");
		words.add("reviewing");
		words.add("Java");
		words.add("knowledge");

		// sorting using lambda
		words.sort((w1, w2) -> w1.length() - w2.length());

		// passing a function to factory method comparing
		Function<String, Integer> function = s -> s.length();
		words.sort(Comparator.comparing(function));
		
		// or
		words.sort(Comparator.comparing(word -> word.length()));
		
		// or yet (using method reference / as a short lambda)
		words.sort(Comparator.comparing(String::toLowerCase));
		
		// using System.out.println(s) as  method reference
		words.forEach(System.out::println);
		
	}
}
