package project;
class animal{
	String name;
	int age;
	void makesound() {
		System.out.println("animal makes sound");
	}
}
class Dog extends animal{
	String breed;
	
	void makesound() {
		System.out.println("dog barks");
	}
	void fetch() {
		System.out.println("dog is fetching");
	}
	
}
class cat extends animal{
	String color;
	void makesound() {
		System.out.println("cat meows");
	}
	void climb() {
		System.out.println("cat is climbing");
	}
	
}


public class Zoo2 {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.name="tim";
		d1.age=45;
		d1.breed="golden";
		d1.makesound();
		d1.fetch();
		cat c =new cat();
		c.color="black";
		c.makesound();
		c.climb();
		
	}

}
