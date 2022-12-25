package String;

import java.io.*;
import java.util.*;

public class finding_char {
    public static int solution(String str, char ch){
        int answer = 0;
        for(char x : str.toCharArray()) {
            if(x == ch) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        char ch = br.readLine().charAt(0);
        ch = Character.toLowerCase(ch);
        System.out.println(solution(str, ch));
    }
}
