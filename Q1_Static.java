class MyStatic {

 public static void staticMethod() {
 // Body of method
	 i = 4;
	 System.out.print(i);
 }
 static int i;
}
class Q1 {
 public static void main(String[] args) {
 MyStatic.staticMethod();
 System.out.print(MyStatic.i);
 }
}
