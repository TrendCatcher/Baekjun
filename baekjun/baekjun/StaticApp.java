package baekjun;

 class Foo {
	public static String classVar= "I class var";
	public String instanceVar="I instance Var";

	public static void classMethod() {
		System.out.println(classVar);// static void classMethod내의 static String 으로 선언한 classVar의 접근을 시도, ok
		//System.out.println(instanceVar); // static void classMethod내의 String으로 선언한 instanceVar를 접근 시도, Error
	}
	public void instanceMethod() {
		System.out.println(classVar);	 // void instanceMethod내의 static String으로 선언된 classVar를 접근시도, ok
		System.out.println(instanceVar); // void instanceMethd내의 String로 선언된 instanceVar를 접근시도, ok
	}
	public class StaticApp{
		public static void main(String [] args) {
			System.out.println(Foo.classVar);	//OK
		//	System.out.println(Foo.instanceVar);// Error
			Foo.classMethod();
			//Foo.instanceMethod();

			Foo f1= new Foo();
			Foo f2= new Foo();

			System.out.println(f1.classVar);
			System.out.println(f1.instanceVar);

			f1.classVar="changed by f1";
			System.out.println(Foo.classVar);
			System.out.println(f2.classVar);

			f1.instanceVar="changed by f1";
			System.out.println(f1.instanceVar);
			System.out.println(f2.instanceVar);
		}
	}
}


