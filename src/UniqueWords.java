import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  ArrayList <String> result = new ArrayList<>();
	  result.addAll(list);
      for (int i = 0; i < result.size(); i++)
      {	
    	  for (int j = i+1; j < result.size(); j++)
    	  {
    		  if(result.get(i)==result.get(j)) 
    		  {
    				result.remove(j);
    				j--;
    		  }
		  }
      }
      count = result.size();
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
	  words.add("apple");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
	  words.add("apple");
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
