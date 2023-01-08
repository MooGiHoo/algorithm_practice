package stack_queue;

import java.io.*;
import java.util.*;

public class postfix {
    public static int solution(String str){
        char[] chars = str.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<chars.length; i++) {
            if(stack.isEmpty()) {
                stack.push(chars[i]-'0');
            }
            else {
                if(chars[i]=='+'||chars[i]=='-'||chars[i]=='*'||chars[i]=='/') {
                    int p2 = stack.pop();
                    int p1 = stack.pop();
                    if(chars[i]=='+') stack.push(p1+p2);
                    else if(chars[i]=='-') stack.push(p1-p2);
                    else if(chars[i]=='*') stack.push(p1*p2);
                    else stack.push(p1/p2);
                }
                else {
                    stack.push(chars[i] -'0');
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
