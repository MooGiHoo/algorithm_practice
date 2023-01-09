package stack_queue;

import java.io.*;
import java.util.*;

class Person {
    int emergency;
    int priority;
    public Person(int emergency, int priority) {
        this.emergency = emergency;
        this.priority = priority;
    }
}

public class emergency_room {
    public static int solution(int n, int m, int[] emergency){
        int answer = 0;
        Queue<Person> q = new LinkedList<>();
        for(int i=0; i<n; i++) {
            q.offer(new Person(emergency[i], i));
        }
        while(!q.isEmpty()) {
            Person temp = q.poll();
            for(Person x : q) {
                if(x.emergency > temp.emergency) {
                    q.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp != null) {
                answer++;
                if(temp.priority==m) return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] emergency = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            emergency[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, m, emergency));
    }
}

