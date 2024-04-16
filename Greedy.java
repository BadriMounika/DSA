import java.util.Arrays;
import java.util.Comparator;

public class Greedy {
    public static int activitySelection(int start[],int end[], int n){
        int[][] a=new int[start.length][2];
        for(int i=0;i<a.length;i++){
            a[i][0]=start[i];
            a[i][1]=end[i];
        } 
        Arrays.sort(a,Comparator.comparingDouble(o ->o[1]));
        int maxAct=1;
        int lastAct=end[0];
        for(int i=1;i<a.length;i++){
            if(start[i]>=lastAct){
                maxAct++;
                lastAct=end[i];
            }
        }
        return maxAct;
       }
       public static int fractionalKnapsack(int value[],int weight[],int W){
        double [][]a=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            a[i][0]=value[i];
            a[i][1]=weight[i];
        }
        Arrays.sort(a,Comparator.comparingDouble(o->o[0]/o[1]));
        int capacity=W;
        int val=0;
        for(int i=a.length-1;i>=0;i--){
            if(capacity>a[i][1]){
                capacity-=a[i][1];
                val+=a[i][0];
            }
            else{
                val+=(a[i][0]/a[i][1])*capacity;
                capacity=0;
                break;
            }
        }
        return val;
       }
       public static int minAbsolutePairs(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff=0;
        for(int i=0;i<a.length;i++){
            minDiff+=Math.abs(a[i]-b[i]);
        }
        return minDiff;
       }
       public static int maxLengthChain(int a[][]){
        Arrays.sort(a,Comparator.comparingDouble(o->o[1]));
        int chainlen=1;
        int chainEnd=a[0][1];
        for(int i=1;i<a.length;i++){
            if(a[i][0]>chainEnd){
                chainlen++;
                chainEnd=a[i][1];

            }     
        }
        return chainlen;

       }
       public static void main(String[] args) {
        //int[] start={10,12,20};
        //int[] end={20,25,30};
        //System.out.println(activitySelection(start, end, 3));
        //int[] value={60,100,120};
        //int[] weight={10,20,30};
        //int W=50;
        //System.out.println(fractionalKnapsack(value, weight, W));
        //int[] a={2,1,3};
        //int[] b={1,2,3};
        //System.out.println(minAbsolutePairs(a, b));
        int[][] a={{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(maxLengthChain(a));
       }
    
}
