package com.everis;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaApplication.class, args);
		int count = 0;

		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		//imperativa y funcional
		for(Integer number : numbers) {
		 if(number>=10) {
			count = count + 1;
		 }
		}
		System.out.println(count);

		Long county = numbers.stream().filter(num -> num > 10).count();
	
		System.out.println(county);
		public class Taxx {
		enum Taxx {
			SUPERREDUCED(4), REDUCED(10), NORMAL(21);

			public int percent;

			private Tax(int percent) {
				this.percent = percent;
			}

			public int getPercent() {
				return percent;
			}
		}
		//lista 
		List<Product> shoppingCart = List.of(new Product("Clothes", new BigDecimal("15.90"), Taxx.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Taxx.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Taxx.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Taxx.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Taxx.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Taxx.NORMAL));

		// Implementación
	
	}
		
	}
	//suma lista
	shoppingCart.stream().map(product -> product.price.add(product.multiply(new BigDecima(product.tax.percent).divide(new BigDecimal(109))))))
	.reduce(BigDecimal.Zero, (x, y) -> x.add(y));
	//que empieza por c
	String result2 = shoppingCart.stream().filter(product -> product.mane.startsWith("C"))
			.map(product -> product.name)
			.collect(collectors.joining(", ","resultados",", "));
}
