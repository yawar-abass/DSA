package StackPackage;
/* Infix to postfix conversion?
Algorithm
1. Scan the infix expression from left to right.
2. If the scanned character is an operand, output it.
3. Else,
      1 If the precedence of the scanned operator is greater than the precedence of the operator in the stack(or the stack is empty or the stack contains a ‘(‘ ), push it.
      2 Else, Pop all the operators from the stack which are greater than or equal to in precedence than that of the scanned operator. After doing that Push the scanned operator to the stack. (If you encounter parenthesis while popping then stop there and push the scanned operator in the stack.)
4. If the scanned character is an ‘(‘, push it to the stack.
5. If the scanned character is an ‘)’, pop the stack and output it until a ‘(‘ is encountered, and discard both the parenthesis.
6. Repeat steps 2-6 until infix expression is scanned.
7. Print the output
8. Pop and output from the stack until it is not empty.
 */
import java.util.Stack;

public class Infix_Postfix {
    public int prec(char ch){ // setting the precedence of operators
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public String postfix(String infix){
        Stack<Character> stk = new Stack<>();
        String str ="";
        for (int i = 0; i <infix.length() ; i++) { // Scaning the infix expression
            char ch =infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){ // check the scanned char is letter or digit
                str+=ch; // add this letter or digit to new string (postfix exp).
            }
            else if (ch == '('){
                stk.push(ch);
            }
            else if(ch == ')'){
                while (!stk.isEmpty() && stk.peek()!='('){// pop until we get the opening parenthesis.
                    str+=stk.pop(); // and add them in new string.
                     }
                stk.pop();// poping the closing parenthesis also.
            }
            else {
                while (!stk.isEmpty() && prec(ch)<=prec(stk.peek())){ // Checking the precendence of operators
                    str+=stk.pop();//if the operator has lower precendence than the peek elements. then pop the all operators with higher precedence than the given oprator
                             }
                stk.push(ch); // else if the operator has higher precedence than the peek element , then push it on the top of stack;
            }

        }
        while (!stk.isEmpty()){// poping the remaining operators in stack;
            if(stk.peek()=='('){ // if any extra parenthesis is remaining in the stack --> invalid parenthesis
                return "invalid parenthesis";
            }
            str+=stk.pop(); // put the other operators in the string;
        }
        return str;
    }
    public static void main(String []args){ // Main method
        Infix_Postfix ip = new Infix_Postfix();
        System.out.println(ip.postfix("A*B+C/D"));
    }
}
