package stack_queue;

import java.io.*;
import java.util.*;

public class Curriculum_design {
    public static String solution(String str1, String str2){
        String answer =  "YES";
        Queue<Character> q = new LinkedList<>();
        for(char x : str1.toCharArray()) {
            q.offer(x);
        }
        for(char x : str2.toCharArray()) {
            if(q.contains(x)) {
                if(q.peek()==x) {
                    q.poll();
                }
                else {
                    return "NO";
                }
            }
        }
        if(!q.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solution(str1, str2));
    }
}

