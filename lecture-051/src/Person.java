import java.io.Serializable;

public class Person implements Serializable {

	private final static long serialVersionUID = 4801633306273802062L;
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
