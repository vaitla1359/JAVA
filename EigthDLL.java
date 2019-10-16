
public class EigthDLL {
       class Node{  
	        int data;  
	        Node previous;  
	        Node next;  
	  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
       public int size = 0;  
   
         
	    Node head, tail = null;  
	  
	    public void addNode(int data) {  
	        Node newNode = new Node(data);  
	  
	      
	        if(head == null) {  
	            head = tail = newNode;  
	            head.previous = null;  
	            tail.next = null;  
	        }  
	        else {  
	            tail.next = newNode;  
	            newNode.previous = tail;  
	            tail = newNode;  
	            tail.next = null;  
	        }  
	    }  
	    public void addInMid(int data) {  
	         Node newNode = new Node(data);  
	   
	         if(head == null) {  
	             head = tail = newNode;  
	             head.previous = null;  
	             tail.next = null;  
	         }  
	         else {  
	             Node current = head, temp = null;  
	   
	             int mid = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
	   
	             for(int i = 1; i < mid; i++){  
	                 current = current.next;  
	             }  
	   
	             temp = current.next;  
	             temp.previous = current;  
	   
	             current.next = newNode;  
	             newNode.previous = current;  
	             newNode.next = temp;  
	             temp.previous = newNode;  
	         }  
	         size++;  
	     }  
	    public void deleteFromMid() {  
	        if(head == null) {  
	            return;  
	        }  
	        else {  
	            Node current = head;  
	  
	            int mid = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
	  
	            for(int i = 1; i < mid; i++){  
	                current = current.next;  
	            }  
	  
	            if(current == head) {  
	                head = current.next;  
	            }  
	            else if(current == tail) {  
	                tail = tail.previous;  
	            }  
	            else {  
	                current.previous.next = current.next;  
	                current.next.previous = current.previous;  
	            }  
	            current = null;  
	        }  
	        size--;  
	    }  
	  
	   
	    public int countNodes() {  
	        int counter = 0;  
	        Node current = head;  
	  
	        while(current != null) {  
	            counter++;  
	            current = current.next;  
	        }  
	        return counter;  
	    }  
	  
	    public void display() {  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        System.out.println("Nodes of doubly linked list: ");  
	        while(current != null) {  
	  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	    }  
	  
	    public static void main(String[] args) {  
	  
	    	EigthDLL dList = new EigthDLL();  
	        dList.addNode(1);  
	        dList.addNode(2);  
	        dList.addNode(3);  
	       
	        dList.addNode(4);  
	        dList.addNode(5);  
	        dList.addInMid(6);  
	        System.out.println( "Updated List: ");  
	        dList.display();  
	        while(dList.head != null) {  
	            dList.deleteFromMid();  
	            System.out.println("Updated List: "); 
	            dList.display();  

	        }
	  
	        System.out.println("\nCount of nodes present in the list: " + dList.countNodes());  
	    }  
	}  

