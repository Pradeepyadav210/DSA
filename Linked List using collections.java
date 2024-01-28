import java.util.LinkedList;
public class Main{
	public static void main(String[] args) {
	LinkedList<String>list = new LinkedList<>();
	
	
	list.addFirst("Namasthe");
	list.addLast("Jay shree Krishna");
	list.add("Ram Ram");
	System.out.println(list);
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++){
	    System.out.print(list.get(i) + "->");
	}
	System.out.println("NULL");
	}
}
