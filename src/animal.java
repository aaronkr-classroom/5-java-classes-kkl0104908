
public class animal {
	public int numLegs = 4;
	public int age;
	public String name;
	
	public int getAge() { return age; } //this.age?
	public void setAge(int age) { this.age = age; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	
	public void myRole(int age) {
		System.out.println("나는 고양이 집사입니다. 나이는 " + age + "입니다.");
		
	}
	public void myRole(String name) {
		System.out.println(name + "은 고양이 학생입니다.");
	}
	public void myRole(int age, String name) {
		System.out.println(name + "은 고양이 자녀입니다. 나이는 " + age + "입니다.");
	}
	public void sound() { //매서드 오버라이딩 (다른 객체 덮어쓰기)
		System.out.println("동물의 울음소리~~");
	}

}
