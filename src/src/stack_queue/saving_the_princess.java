package stack_queue;

import java.io.*;
import java.util.*;

public class saving_the_princess {
    public static int solution(int n, int k){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++) {
            q.offer(i);
        }
        int cnt = 0;
        while(q.size()>1) {
            cnt++;
            if(cnt == k) {
                q.poll();
                cnt = 0;
            }
            else {
                int i = q.poll();
                q.offer(i);
            }
        }
        return q.poll();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(solution(n, k));
    }
}
