package listjava;

public class MyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mylist<Integer> lstInterger= new Mylist<>();
		lstInterger.add(2);
		lstInterger.add(3);
		lstInterger.add(5);
		System.out.println(lstInterger.get(1));
		System.out.println(lstInterger.get(0));
	}

}
