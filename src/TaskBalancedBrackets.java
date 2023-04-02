import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TaskBalancedBrackets {


       /*
       BalancedBrackets

       Create a method that will accept a String of brackets.Determine if the brackets are balanced.
       Brackets are balanced if there is a closing bracket for every corresponding opening bracket.THere should not be an extra opening or closing bracket.

       ex:

       {([])} -> balanced
       {[(])]} -> not balanced

        */
      public static boolean balanced(String str){

          //stack:{([

          Map<Character, Character> map=new HashMap<>();
          map.put('{','}');
          map.put('(',')');
          map.put('[',']');

          Stack<Character> stack =new Stack();

          for(int i=0;i<str.length();i++){

              char eachChar=str.charAt(i);
              if(map.containsKey(eachChar)){

                  stack.push(eachChar);

              }else{//the current character is closing bracket
                  if(stack.isEmpty()  || map.get(stack.pop()) !=eachChar){
                      return false; //the opening bracket did not match with the closing bracket
                  }


              }
          }

          return stack.isEmpty();


      }

    public static void main(String[] args) {
        System.out.println(balanced("{([])}"));
        System.out.println(balanced("{([{])}"));
        System.out.println(balanced("{{}}({})"));
    }
}
