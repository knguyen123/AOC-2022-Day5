import java.io.*;
import java.util.*;
public class day5P2 {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("crates.txt"));   
      ArrayList<LinkedList<Character>> a = new ArrayList<>();
      for(int i = 0; i < 9; i++){
      	a.add(new LinkedList());
      }
      for(int i = 0; i < 8; i++){
      	String s = f.nextLine();
      	for(int j = 0; j < a.size(); j++){
      	   if(s.charAt(j) != ' '){
      	   	a.get(j).addLast(s.charAt(j));
      	   }
      	}
      }
      while(f.hasNextLine()){
      	f.next();
         int n1 = Integer.parseInt(f.next());
         f.next();
         int s1 = Integer.parseInt(f.next());
         f.next();
         int s2 = Integer.parseInt(f.next());
         LinkedList<Character> q = new LinkedList<>();
      	for(int i = 0; i < n1; i++){
            q.addFirst(a.get(s1-1).removeLast());
      	}
         for(int i = 0; i < n1; i++){
            a.get(s2-1).addLast(q.removeFirst());
         }
      }
      for(int i = 0; i < a.size(); i++){
      	System.out. print(a.get(i).getLast());
      }
   }
}