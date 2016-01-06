import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		try (ObjectInputStream os = 
				new ObjectInputStream(new FileInputStream("test.ser"))) {
			
			// No constructor is used to create this Person object
			// So don't expect a constructor to run when deserializing an object
			Person person = (Person)os.readObject();
			System.out.println(person);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
