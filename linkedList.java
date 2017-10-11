/* Name:Zhiwei LIN
   Section: 12:30-1:50
*/



import java.util.LinkedList;
import java.util.ListIterator;
public class linkedList {
      public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String> address = new LinkedList<String>();
	 address.add("Tulsa");
	 address.add("Ada");
	 address.add("Broken Arrow");
	 address.add("Owasso");
	 address.add(1,"OKC");
	 System.out.println("Linkedlist 1 is:"+ address);
	 
	LinkedList<String> data= new LinkedList<String>();
	 data.add("74104");
	 data.addFirst("74135");
	 data.add("foo");
	 data.add("hello world");
	 data.add("777");
	 System.out.println("Linkedlist 2 is"+ data);
	 
	LinkedList<String>mergedList= new LinkedList<String>();
	ListIterator<String> aIer= address.listIterator();
	ListIterator<String> dIer= data.listIterator();
	 for(int i=0;i<address.size();i++)  {
		 mergedList.add(aIer.next());
	 }
	 for(int i=0; i<data.size();i++) {
		 mergedList.add(dIer.next());
	 }
	 System.out.println("Merged List 2 into list 1:"+mergedList);
	
	 aIer= address.listIterator();
	 for(int i =0; i<address.size();i+=2) {
		 aIer.next();
		 aIer.next();
		 aIer.remove();
	 }
	 System.out.println("ListAddress with every 2nd word removed:"+address);
	 
	 LinkedList<String> copydata= new LinkedList<String>();
      while(data!= null) { 
	   copydata.add(dIer.next());
   }
   

	  
	}

}