package designPatterns.prototype.two;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Heritage h = new Heritage(15466.89);
		
		Parent p = new Parent("Tiwari",  h);
		Parent m = (Parent) p.clone();
		h.setBankBalance(50000.56);
		p.setHeritage(h);
		System.out.println(p);
		System.out.println(p.hashCode() + " / " + p.getHeritage().hashCode());
		System.out.println(m);
		System.out.println(m.hashCode() + " / " + m.getHeritage().hashCode());
	}
}
