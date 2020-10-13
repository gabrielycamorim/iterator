

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorDinheiro { 
    public static void main(String[] args) 
    { 
    
	  ArrayList<String> list = new ArrayList<String>(); 
	  
      list.add("R$ 10,00"); 
      list.add("R$ 20,00"); 
      list.add("R$ 30,00"); 
      list.add("R$ 40,00"); 
      list.add("R$ 50,00"); 
      
      ListIterator iterator = list.listIterator(); 

      System.out.println("Quantia do menor para o maior: "); 

      while (iterator.hasNext()) 
          System.out.print(iterator.next() + " "); 

      System.out.println(); 

      System.out.println("Quantia do maior para o menor: "); 

      while (iterator.hasPrevious()) 
          System.out.print(iterator.previous() + " "); 

      System.out.println(); 
  } 
} 