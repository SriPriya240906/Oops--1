package project;
class vechile1{
   void start() {
		System.out.println();
	}}

	class car extends vechile1{
		void drive() {
		System.out.println("Car is starting ");
	}}
	class bike extends vechile1{
		void turbo() {
		System.out.println("bike is stsrting");
	}}
	class evechile extends vechile1{
		void electric() {
			System.out.println("bike is charging");
		}
	}

public class  prime{
	public static void main(String[] args) {
		car run=new car();
		run.drive();
		bike r = new bike();
		r.turbo();
		evechile ev=new evechile();
		ev.electric();
		
	}
}
