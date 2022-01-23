package BasicPrograms;
import  java.util.*;
public class Cpp {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
    }
        public static boolean isValid(String s) {
            if(s.length()<0){
                return false;
            }
            Stack<Character> stk = new Stack<>();
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch == '(' || ch == '{' || ch == '['){
                    stk.push(ch);
                    continue;
                }
                else if(ch == ')'){
                    if(stk.peek() != '('){
                        return false;
                    }
                    stk.pop();
                }
                else if(ch == '}'){
                    if(stk.peek() != '{'){
                        return false;
                    }
                    stk.pop();
                }
                else if(ch == ']'){
                    if(stk.peek() != '['){
                        return false;
                    }
                    stk.pop();
                }
            }
            if(stk.isEmpty()){
                return true;
            }
            return false;
        }
    }


