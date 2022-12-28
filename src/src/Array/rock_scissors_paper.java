package Array;

import java.io.*;
import java.util.*;

public class rock_scissors_paper {
    static final String draw = "D";
    static final String win_a = "A";
    static final String win_b = "B";

    public static String solution(int[] a, int[] b){
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<a.length; i++) {
            if(a[i]==b[i]) answer.append(draw + "\n");
            else if((a[i]==1&&b[i]==3)||(a[i]==2&&b[i]==1)||(a[i]==3&&b[i]==2)) answer.append(win_a + "\n");
            else answer.append(win_b + "\n");
        }
        return answer.toString();
    }
    //1 가위, 2 바위, 3 보
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(a ,b));
    }
}
