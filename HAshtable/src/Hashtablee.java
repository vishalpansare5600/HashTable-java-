import java.util.Hashtable;

public class Hashtablee {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> htable=new Hashtable<Integer,String>();

		htable.put(10, "vishal");
		htable.put(20, "sumit");
		htable.put(30, "ganesh");
		//htable.put(null, "umesh"); //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
		//htable.put(50, null);  //null pointer Exception value should not be null
		htable.put(30, "ganesh");
		
		Hashtable htable1=new Hashtable ();
		htable1.put(new Temp(60),"A");
		
		try {
			htable1.put(new Temp(70), null);
			
		}catch(Exception e)
		{
			System.out.println("null value not allowed plz enter valid value Ex:10,20,30,.....etc,hello...etc");
		}
		
		System.out.println("hastable =:"+htable);
	}

}
