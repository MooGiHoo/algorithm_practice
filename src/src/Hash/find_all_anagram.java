package Hash;

import java.io.*;
import java.util.*;

public class find_all_anagram {
    public static int solution(String str, String target){
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char x : target.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0)+1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        char[] chars = new char[str.length()+1];
        for(int i=0; i<str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        int lt = 0;
        for(int rt = 0; rt<chars.length; rt++) {
            boolean flag = true;
            if(rt-lt == target.length()) {
                for(char key : map1.keySet()) {
                    if(!map2.containsKey(key)) {
                        flag = false;
                        break;
                    }
                    else {
                        if(map1.get(key) != map2.get(key)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) answer++;
                map2.put(chars[lt], map2.get(chars[lt])-1);
                lt++;
                if(map2.get(chars[lt])==0) {
                    map2.remove(chars[lt]);
                }
                map2.put(chars[rt], map2.getOrDefault(chars[rt], 0)+1);
            }
            else {
                map2.put(chars[rt], map2.getOrDefault(chars[rt], 0)+1);
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String target = br.readLine();
        System.out.println(solution(str, target));
    }
}


