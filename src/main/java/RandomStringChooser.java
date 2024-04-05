import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> result = new ArrayList <String>();
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  public RandomStringChooser(String[] w){
    for (int i = 0; i < w.length; i++){
      result.add(w[i]);
    }
  }

  public String getNext(){
    if (result.size() == 0){
    return "NONE";
    }
    
    int random = (int)(Math.random() * result.size());
    int temp = result.get(random);
    result.remove(random);
    return temp;
  }
}
