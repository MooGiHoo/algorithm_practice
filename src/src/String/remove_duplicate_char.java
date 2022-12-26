package String;

import java.io.*;
import java.util.*;

public class remove_duplicate_char {
    public static String solution(String str){
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char x : chars) {
            if(!map.containsKey(x)){
                answer += x;
            }
            map.put(x, map.getOrDefault(map.get(x),0)+1);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
