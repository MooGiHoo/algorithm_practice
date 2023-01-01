package Hash;

import java.io.*;
import java.util.*;

public class class_leader {
    public static Character solution(int n, String str){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            if(map.get(key)>max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(solution(n, str));
    }
}


