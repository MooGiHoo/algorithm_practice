package stack_queue;

import java.io.*;
import java.util.*;

public class remove_chars_in_brackets {
    public static String solution(String str){
        String answer = "";
        char[] chars = str.toCharArray();
        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        for(char x : chars) {
            if(x == '(') {
                stack.push(x);
                flag = false;
            }
            else {
                if(x == ')') {
                    stack.pop();
                    if(stack.isEmpty()) flag = true;
                }
                else {
                    if(flag) answer += x;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}


