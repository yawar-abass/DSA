package StackPackage;

import java.util.Stack;
/*
Algorithm for Prefix to Postfix:

Read the Prefix expression in reverse order (from right to left)
If the symbol is an operand, then push it onto the Stack
If the symbol is an operator, then pop two operands from the Stack
Create a string by concatenating the two operands and the operator after them.
string = operand1 + operand2 + operator
And push the resultant string back to Stack
Repeat the above steps until end of Prefix expression.
 */
public class Prefix_Postfix {
    public String prefixtoPostfix(String prefix){
        Stack<String> stk = new Stack<>();
        String postfix ="";
        for (int i = prefix.length()-1; i >=0 ; i--) {
            char ch = prefix.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                stk.push(ch+"");
            }
            else{
                String str ="";
                String opr1 = stk.peek();
                stk.pop();
                String opr2 = stk.peek();
                stk.pop();
                str= opr1+opr2+ch;
                stk.push(str);
            }
        }
        while (!stk.isEmpty()){
            postfix+=stk.peek();
            stk.pop();
        }
        return postfix;
    }

    public static void main(String[] args) {
        Prefix_Postfix pp = new Prefix_Postfix();
        System.out.println(pp.prefixtoPostfix("*-A/BC-/AKL"));
    }
}
