package String;

import java.io.*;
import java.util.*;

public class valid_palindrome {
    public static String solution(String str){
        String answer = "YES";
        char[] chars = str.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
        int lt = 0;
        int rt = chars.length-1;
        while(lt<rt) {
            if(chars[lt] != chars[rt]) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}

