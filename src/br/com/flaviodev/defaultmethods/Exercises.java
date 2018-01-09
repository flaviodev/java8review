package br.com.flaviodev.defaultmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Exercises {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		// exercise 2: implementing sorting
		palavras.sort(new Comparator<String>() {
			@Override
			public int compare(String p1, String p2) {
				if (p1.length() < p2.length())
					return -1;
				if (p1.length() > p2.length())
					return 1;
				return 0;
			}
		});

		// exercise 3: implementing remove if 
		palavras.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String palavra) {
				return palavra.length()<7;
			}
		});
		
		// exercise 3: implementing replace all 
		palavras.replaceAll(new UnaryOperator<String>() {
			@Override
			public String apply(String palavra) {
				return palavra.replaceAll("a", "A");
			}
		});
		
		// exercise 1: implementing foreach
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String palavra) {
				System.out.println(palavra);
			}
		});
		
		
		
	}
}
