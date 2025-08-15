package project;
class animal{
	void eat() {
		System.out.println("this animal can eat");
	}
}
class dog extends animal{
	void bark() {
		System.out.println("this dog can bark");
	}
}
class cat extends animal{
	void sound() {
		System.out.println("this can sound");
	}
}
public class man{
	public static void main(String[] args) {
		cat d1=new cat();
		d1.eat();
	
		d1.sound();
		
	}
}
