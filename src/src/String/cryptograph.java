package String;

import java.io.*;
import java.util.*;

public class cryptograph {
    public static String solution(int n, String str){
        String answer = "";
        String[] strs = new String[n];
        for(int i=0; i<n; i++) {
            strs[i] = str.substring(0, 7);
            str = str.substring(7);
        }
        for(int i=0; i<n; i++){
            strs[i] = strs[i].replace('#','1').replace('*','0');
            int num = Integer.parseInt(strs[i],2);
            answer += (char)num;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(solution(n ,str));
    }
}

