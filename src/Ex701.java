
public class Ex701 {

	public static void main(String[] args) {
		cat my_cat = new cat();
		my_cat.setAge(14);
		my_cat.setName("Aaron");
		
		System.out.println("Say hi to my cat, " + my_cat.getName());
		System.out.println("my cat is " + my_cat.getAge() + " years old");
		
		my_cat.setAge(6);
		System.out.println("my cat is " + my_cat.getAge() + " years old");

	}

}
