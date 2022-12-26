package String;

import java.io.*;
import java.util.*;

public class String_compression {
    public static String solution(String str){
        String answer = "";
        int k = 1;
        str = str + " ";
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)) {
                k++;
            }
            else {
                if(k==1) {
                    answer += String.valueOf(str.charAt(i));
                }
                else {
                    answer += String.valueOf(str.charAt(i)) + k;
                }
                k=1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
