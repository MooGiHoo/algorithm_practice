package stack_queue;

import java.io.*;
import java.util.*;

public class correct_brackets {
    public static String solution(String str){
        String answer = "NO";
        boolean flag = true;
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char x : chars) {
            if(stack.isEmpty()) {
                if(x == '(') stack.push(x);
                else {
                    flag = false;
                    break;
                }
            }
            else {
                if(x == '(') stack.push(x);
                else {
                    if(stack.peek()== '(') stack.pop();
                    else {
                        flag = false;
                        break;
                    }
                }
            }
        }
        if(stack.isEmpty()&&flag) return "YES";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}

