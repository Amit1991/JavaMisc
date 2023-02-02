package designPatterns.prototype.two;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Parent implements Cloneable {

	private String surname;
	private Heritage heritage;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return new Parent(this.getSurname(),
							new Heritage(this.getHeritage().getBankBalance()));
	}
}
