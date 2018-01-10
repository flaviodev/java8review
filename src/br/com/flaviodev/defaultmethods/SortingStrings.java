package br.com.flaviodev.defaultmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class SortingStrings {

	public static void main(String[] args) {

		List<String> words = new ArrayList<String>();
		words.add("updating");
		words.add("and");
		words.add("reviewing");
		words.add("java");
		words.add("knowledge");

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() < o2.length())
					return -1;
				if (o1.length() > o2.length())
					return 1;
				return 0;
			}			
		};

		// old way for sorting words
		Collections.sort(words, comparator);
		System.out.println(words);

		// using default method sort from interface List
		words.sort(comparator);
		System.out.println(words);

		// old way to print each element from a collection
		for (String word : words) {
			System.out.println(word);
		}

		// iteration using Consumer interface (default method forEach on Iterable)
		words.forEach(new Consumer<String>() {
			@Override
			public void accept(String word) {
				System.out.println(word);
			}
		});
	}
}


