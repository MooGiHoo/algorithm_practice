package String;

import java.io.*;
import java.util.*;

public class extract_numbers {
    public static int solution(String str){
        str = str.replaceAll("[^0-9]","");
        if(str.charAt(0)=='0'){
            str = str.substring(1);
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}

