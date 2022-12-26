package String;

import java.io.*;
import java.util.*;

public class shortest_char_distance {
    public static String solution(String str, char t){
        String answer = "";
        char[] chars = str.toCharArray();
        int[] arr = new int[chars.length];
        int d = 10000;
        for(int i=0; i<chars.length; i++) {
            if(chars[i] == t) {
                d = 0;
                arr[i] = d;
            }
            else{
                d++;
                arr[i] = d;
            }
        }
        d = 10000;
        for(int i=chars.length-1; i>=0; i--){
            if(chars[i] == t) {
                d = 0;
                arr[i] = d;
            }
            else{
                d++;
                arr[i] = Integer.min(arr[i], d);
            }
        }
        for(int x : arr) {
            answer += x + " ";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char t = st.nextToken().charAt(0);
        System.out.println(solution(str, t));
    }
}

