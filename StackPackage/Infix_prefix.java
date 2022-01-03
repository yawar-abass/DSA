package StackPackage;
// Algorithm :
/*
Step 1: Reverse the infix expression i.e A+B*C will become C*B+A. Note while reversing each ‘(‘ will become ‘)’ and each ‘)’ becomes ‘(‘.
Step 2: Obtain the “nearly” postfix expression of the modified expression i.e CB*A+.
Step 3: Reverse the postfix expression. Hence in our example prefix is +A*BC.
 */
import java.util.Stack;
public class Infix_prefix {
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
                else if (ch == ')'){ // because the string is now reversed
                    stk.push(ch);
                }
                else if(ch == '('){
                    while (!stk.isEmpty() && stk.peek()!=')'){// pop until we get the closing parenthesis.
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
            Infix_prefix ip = new Infix_prefix();
            String str = "a*(b+c)"; // Infix expression --> prefix( a* +bc --> *a+bc)
            StringBuffer strb = new StringBuffer();
            strb.append(str);
            strb.reverse();// reverse the infix expression
            StringBuffer strb1 = new StringBuffer();
            strb1.append(ip.postfix(strb.toString()));// get the postfix of expression
            strb1.reverse();// and reverse the postfix reverse --> get the prefix exp.
            System.out.println(strb1);

        }
    }



