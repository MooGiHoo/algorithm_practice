package stack_queue;

import java.io.*;
import java.util.*;

public class iron_bar {
    public static int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length; i++) {
            if(chars[i]=='(') stack.push(chars[i]);
            else {
                stack.pop();
                if(chars[i-1]=='(') answer += stack.size();
                else answer++;
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
