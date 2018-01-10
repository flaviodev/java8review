package br.com.flaviodev.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class UsingLambdas {

	public static void main(String[] args) {

		List<String> words = new ArrayList<String>();
		words.add("updating");
		words.add("and");
		words.add("reviewing");
		words.add("java");
		words.add("knowledge");

		// iteration using Consumer interface (default method forEach on Iterable)
		words.forEach(new Consumer<String>() {
			@Override
			public void accept(String word) {
				System.out.println(word);
			}
		});

		// functional interfaces has just one method and can be used on lambda expression

		// sorting using lambda
		words.sort((w1, w2) -> w1.length() - w2.length());

		// a lambda expression can be converted to a functional interface 
		Consumer<String> linePrinter = word -> System.out.println(word);
		words.forEach(linePrinter);
		
		// iteration using lambda (passing the lambda expression directly)  
		words.forEach(word -> System.out.println(word));
		
		new Thread(()-> System.out.println("Executing a Runnable")).start();
	}
}
