import java.util.*;
public class Graphs {
    public static void main(String[] args) {
        //adjacencyMatrix(3, 4);
        //adjacencyList(3, 4);
        //ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

         //adj.add(new ArrayList<>());
         //adj.add(new ArrayList<>());
         //adj.add(new ArrayList<>());
         //adj.add(new ArrayList<>());
         //adj.add(new ArrayList<>());
         //adj.get(0).add(1);
         //adj.get(0).add(2);
         //adj.get(0).add(3);
         //adj.get(2).add(4);

         //ArrayList<Integer> ans = bfsOfGraph(5, adj);
         //for (Integer i : ans) {
         //System.out.print(i + " ");
         //}
         //System.out.println();

        // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // adj.add(new ArrayList<>(List.of(2, 3, 1)));
        // adj.add(new ArrayList<>(List.of(0)));
        // adj.add(new ArrayList<>(List.of(0, 4)));
        // adj.add(new ArrayList<>(List.of(0)));
        // adj.add(new ArrayList<>(List.of(2)));
        // ArrayList<Integer> ans = dfsOfGraph(5, adj);
        // for (Integer i : ans) {
        // System.out.print(i + " ");
        // }
        // System.out.println();

        //ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        // adj.add(new ArrayList<>(Arrays.asList(3)));
        // adj.add(new ArrayList<>(Arrays.asList(3)));
        // adj.add(new ArrayList<>());
        // int[] ans = topoSort(4, adj);
        // for (int i : ans) {
        // System.out.print(i + " ");
        // }
    }
    public static void adjacencyList(int n,int m){
        ArrayList<ArrayList<Integer> > al=new ArrayList< >(); 
            for(int i=0;i<n;i++){
                al.add(new ArrayList<>());
            }
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v =sc.nextInt();
            al.get(u).add(v);
            al.get(v).add(u);
        }
        System.out.println("ARRAYLIST: ");
           for(int i=1;i<al.size();i++){
            for(int j=0;j<al.get(i).size();j++){
                System.out.print(al.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }     
    public static void adjacencyMatrix(int n,int m){
        int[][] matrix=new int[n][n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            matrix[u][v]=1;
            matrix[v][u]=1;
        }
        System.out.println("adjacency matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        } 
    } 
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int temp = q.remove();
            ans.add(temp);
            for (Integer i : adj.get(temp)) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return ans;
    }  
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfs(adj, ans, visited, 0);
        return ans;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, boolean[] visited, int temp) {
        visited[temp] = true;
        ans.add(temp);
        for (Integer i : adj.get(temp)) {
            if (!visited[i]) {
                dfs(adj, ans, visited, i);
            }
        }
    } 
    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] incomingEdges = new int[V];
        int[] ans = new int[V];
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                incomingEdges[adj.get(i).get(j)]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (incomingEdges[i] == 0)
                q.add(i);
        }

        int k = 0;
        while (!q.isEmpty()) {
            int temp = q.remove();
            ans[k++] = temp;
            for (int i = 0; i < adj.get(temp).size(); i++) {
                incomingEdges[adj.get(temp).get(i)]--;
                if (incomingEdges[adj.get(temp).get(i)] == 0)
                    q.add(adj.get(temp).get(i));
            }
        }
        return ans;
    }public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] incomingEdges = new int[V];
        int[] ans = new int[V];
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                incomingEdges[adj.get(i).get(j)]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (incomingEdges[i] == 0)
                q.add(i);
        }

        int k = 0;
        while (!q.isEmpty()) {
            int temp = q.remove();
            ans[k++] = temp;
            for (int i = 0; i < adj.get(temp).size(); i++) {
                incomingEdges[adj.get(temp).get(i)]--;
                if (incomingEdges[adj.get(temp).get(i)] == 0)
                    q.add(adj.get(temp).get(i));
            }
        }
        return ans;
    }
}

