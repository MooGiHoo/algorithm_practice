package sorting;

import java.io.*;
import java.util.*;


class Point implements Comparable<Point>{
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override // 무조건 음수가 되도록 리턴을 해야 함, 오름차순 -> this - object , 내림차운 -> object - this
    public int compareTo(Point o) {
        if(this.x==o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class coordinate_alignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Point> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x,y));
        }
        Collections.sort(list);
        for(Point p : list) {
            System.out.print(p.x + " " + p.y);
            System.out.println();
        }
    }
}

