
public class SetGetGeneric {
public static void main(String[] args) {
	
}


	static Object object = new Object(); 
	static Number number = 1.5; 
	static Integer integer = 10;

static void checkIt(Node n) {
	n.setData(object);
	n.setData(number);
	n.setData(integer);
}
static void check(Node<?> n) {
	
}
static void check(Node<? extends Number> n) {
	
}
}
