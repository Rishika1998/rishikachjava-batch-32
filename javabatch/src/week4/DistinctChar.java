package week4;

import java.util.HashMap;
import java.util.Map;

public class DistinctChar{
    public static void main(String[] args) {
        String input = "test string";
        input=input.replaceAll(" ","");
        char[] numb=input.toCharArray();


        HashMap<Character, Integer> num=new HashMap<Character, Integer>();

        for(char s:numb){
            if(num.containsKey(s)){
                num.put(s,num.get(s)+1);
            }
            else{
                num.put(s,1);
            }
        }

        for(Map.Entry<Character, Integer> news:num.entrySet()){
            System.out.println(news.getKey()+" "+news.getValue());
        }


}
}