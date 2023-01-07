package stack_queue;

import java.io.*;
import java.util.*;

public class pickUp_doll_kakao {
    public static int solution(int n, int m, int[][] arr, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<m; i++) {
            int target = moves[i]-1;
            int doll = 0;
            for(int j=0; j<n; j++) {
                if(arr[j][target]!=0) {
                    doll = arr[j][target];
                    arr[j][target] = 0;
                    break;
                }
            }
            if(stack.isEmpty()) {
                stack.push(doll);
            }
            else {
                if(stack.peek()==doll) {
                    stack.pop();
                    answer +=2;
                }
                else stack.push(doll);
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, m, arr, moves));
    }
}
