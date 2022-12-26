package String;

import java.io.*;
import java.util.*;

public class reverse_specific_char {
    public static String solution(String str){
        String answer = "";
        char[] chars = str.toCharArray();
        int lt =0, rt = chars.length-1;
        while(lt<rt) {
            if(Character.isAlphabetic(chars[lt])&&Character.isAlphabetic(chars[rt])) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            else if(!Character.isAlphabetic(chars[lt])&&Character.isAlphabetic(chars[rt])) {
                lt++;
            }
            else {
                rt--;
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
