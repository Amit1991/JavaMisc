package designPatterns.prototype.one;

import java.util.stream.IntStream;

public class PrototypeTest {

	public static void main(String[] args) {
		
		IntStream.range(0, 20).forEach(a -> System.out.println(GrizzlyBear.getPrototype()));
	}
}
