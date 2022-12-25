package String;

import java.io.*;
import java.util.*;

public class reverse_char {
    public static String solution(String str){
        String answer = "";
        for(int i=str.length()-1; i>=0; i--){
            answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            System.out.println(solution(str));
        }
    }
}
