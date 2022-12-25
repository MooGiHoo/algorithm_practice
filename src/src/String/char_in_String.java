package String;

import java.io.*;
import java.util.*;

public class char_in_String {
    public static String solution(String str){
        String answer = "";
        String[] strings = str.split(" ");
        int num = 0;
        for(String x : strings) {
            int length = x.length();
            if(length > num){
                num = length;
                answer = x;
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
