import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack= new Stack<>();
    char[] chars = s.toCharArray();
   for(int i =0;i<chars.length;i++)
    {
        if(chars[i]=='(' || chars[i]=='[' || chars[i]=='{' )
        {
          stack.push(chars[i]);
        }
        else 
        {
            if(stack.isEmpty())
            {
                return false;
            }
            char top = stack.pop();
            if (!pair(top, chars[i]))
                {
                    return false; 
                }
            }
        
    }
        return stack.isEmpty();
    
    }
      private boolean pair(char op, char cl) {
        return (op == '(' && cl == ')') ||
               (op == '{' && cl == '}') ||
               (op == '[' && cl == ']');
    }
    }
