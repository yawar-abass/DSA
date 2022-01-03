package StackPackage;

import java.util.Stack;
/*
Algorithm for Prefix to Infix:

1. Read the Prefix expression in reverse order (from right to left)
2. If the symbol is an operand, then push it onto the Stack
3. If the symbol is an operator, then pop two operands from the Stack
4. Create a string by concatenating the two operands and the operator between them.
   string = (operand1 + operator + operand2)
5. And push the resultant string back to Stack
6. Repeat the above steps until end of Prefix expression.
 */
public class Prefix_Infix {
    public String prefixtoinfix(String prefix){
        Stack<String> stk = new Stack<>();
        String result = "";
        for (int i = prefix.length()-1; i >=0 ; i--) {// traverse from the back of string
            char ch = prefix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stk.push(ch+"");
            }
            else{
                String newstr = "";
                String opr1 = stk.peek();
                stk.pop();
                String opr2 = stk.peek();
                stk.pop();
                newstr = '('+opr1+ ch +opr2+')';
                stk.push(newstr);
            }
        }
       while (!stk.isEmpty()){
           result+=stk.peek();
           stk.pop();
       }
        return result;
    }

    public static void main(String[] args) {
        Prefix_Infix pi = new Prefix_Infix();
        System.out.println(pi.prefixtoinfix("*+AB-CD"));
    }
}
