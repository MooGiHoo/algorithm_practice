package Hash;

import java.io.*;
import java.util.*;

public class Anagram {
    public static String solution(String str1, String str2){
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0)+1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0)+1);
        }
        for(char key : map1.keySet()) {
            if(map2.containsKey(key)) {
                if(!(map1.get(key)==map2.get(key))) {
                    return "NO";
                }
            }
            else {
                return "NO";
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solution(str1, str2));
    }
}


