package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog() {}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException{
		out.writeUTF(name);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		name = in.readUTF();
	}
	@Override
	public String toString() {
		return name;
	}
}
public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog myDog = new Dog();
		myDog.setName("멍멍이");
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try(fos;oos){
			oos.writeObject(myDog); // 직렬화를 하는 메서드
		} catch(IOException e) {
			e.printStackTrace();
		}
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject();
		System.out.println(dog);
	}

}
