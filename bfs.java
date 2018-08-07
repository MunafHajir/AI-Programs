import java.util.*;

public class bfs{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			//ArrayList<HashMap<String><String>> al=new ArrayList<HashMap<String><String>>();  
			// Initializing a Dictionary
			Dictionary tree = new Hashtable();
			ArrayList<String> open=new ArrayList<String>();  
			ArrayList<String> close=new ArrayList<String>();  
			
			System.out.println("Enter Root Node Name: ");
			String root = sc.next();		   //root
			sc.nextLine();
			System.out.println("Enter Child Name of  "+root+" with seperated by space");
			String child = sc.nextLine();
			tree.put(root,child);
			
			
			
			String root_child = tree.get(root).toString(); // root k child
			String[] childArray = root_child.split(" ");   // phir child split kyuke apne ko uske bhi child ;lene h
			
				for (int i = 0; i < childArray.length; i++)
				{
				System.out.println("Child With Space of: " + childArray[i]);
				System.out.println("Enter Child Name of  "+childArray[i]+" with seperated by space");
				child = sc.nextLine();
				
				if(child.isEmpty()){
					System.out.println("NULL VALUE IT MEANS NONE CHILD");
				}
				else{
				tree.put(childArray[i],child);
				}
				
				
			System.out.println("Enter Goal Node Name: ");
			String goal = sc.next();		
			sc.nextLine();
			
			if (root == goal){
				System.out.println("Success");
				}	
				
			
				
		}
			
		}
} 
