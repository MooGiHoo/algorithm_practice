package String;

import java.io.*;
import java.util.*;

public class case_conversion {
    public static String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()) {
            if(x-97<0) {
                answer += Character.toLowerCase(x);
            }
            else {
                answer += Character.toUpperCase(x);
            }
        }
        return answer;
    }
    // 아스키 코드 A~Z -> 65~90
    //           a~z -> 97~122

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
