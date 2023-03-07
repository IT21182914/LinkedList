
public class LinkedList {

	private Link first;
	
	
	public LinkedList() {
		
		this.first=null;
		
		
	}
	
	public boolean isEmpty() {
		
		
		return (first==null);
		
	}
	public void displayList() {
		
		
		Link cur = first;
		
		while(cur==null) {
			
			cur.displayDetails();
			cur=cur.next;
		}
	}
	
	
	public void insertFirst(String name,double avg) {
		
		Link newLink = new Link(name,avg);
		newLink.next = first;
		first = newLink;
		
	}
	
	public Link deleteFirst()
	{
		
		Link temp = first;
		first = first.next;
		
		return temp;
		
	}
	
	
	
}
