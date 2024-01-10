import java.util.ArrayList;
import java.util.List;

public class Gen{
	
	public static void main(String[] args) {
		Node<Object> objNode = null;
		Node<Integer> intNode = null;
		Node<Number> numNode = null;
		
		Node<? extends Integer> extIntNode = intNode;
		Node<? super Integer> supIntNode = numNode;
		supIntNode = objNode;
		
		// numNode = intNode;   => not related types.
		
		Node<? super Number> supNumNode = null;
		Node<? extends Object> extObjNode = null;
		Node<? super Object> supObjNode = null;
		 
		// extNumNode = supNumNode;  => compile time error
		 extObjNode = supObjNode;
		// supObjNode = extObjNode;  => Compile time error i.e narrowing 
		 
		 Node rawNode = null;
		 Node<?> anyNode = null;
		 rawNode = anyNode;
		 anyNode = rawNode;
		 
		 anyNode = extObjNode;
		 extObjNode = anyNode;
		 //extObjectNode = rawNode;  => unchecked conversion error!
		 
		 List list = new ArrayList<String>();
		 list.add(700);
		 //String s = list.get(0);
		 Object s = list.get(0);
	}
} 