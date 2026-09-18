TASK8:Smart Traffic Navigation System
import java.util.*;
public class SmartTraffic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<=N;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int source = sc.nextInt();
        int destination = sc.nextInt();
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current == destination){
                System.out.println("YES");
                return;
            }
            for(int neighbor : graph.get(current)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println("NO");
        sc.close();
    }
}
## sample input
5 4
1 2
2 3
3 4
4 5
1 5
2 3
3 4 
##sample output
YES
