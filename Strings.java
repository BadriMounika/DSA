import java.util.*;
public class Strings {
    public static boolean isAnagram(String a,String b){
        char[] arr=new char[100];
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)-97]++;
        }
        for(int i=0;i<b.length();i++){
            arr[b.charAt(i)-97]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
    public static boolean isAnagram2(String a,String b){
        if(a.length()!=b.length()) return false;
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<a.length();i++){
            map1.put(a.charAt(i),map1.getOrDefault(a.charAt(i),0)+1);
        }
        for(int i=0;i<b.length();i++){
            if(map1.containsKey(b.charAt(i))){
                map1.put(b.charAt(i),map1.get(b.charAt(i))-1);
            }
        }
        for(char c:map1.keySet()){
            if(map1.get(c)!=0){
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagram3(String a,String b){
        if(a.length()!=b.length()) return false;
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<a.length();i++){
            map1.put(a.charAt(i),map1.getOrDefault(a.charAt(i),0)+1);
        }
        for(int i=0;i<b.length();i++){
            map2.put(b.charAt(i),map2.getOrDefault(b.charAt(i),0)+1); 
        }
        return map1.equals(map2);
    }
    public  long[] printFirstNegativeInteger(long A[],int N,int K){
        ArrayList<Long> neg=new ArrayList<>();
        long[] ans=new long[N-K+1];
        int left=0;
        int right=0;
        int k=0;
        int z=0;
        while(right<N){
            if(A[right]<0) neg.add(A[right]);
            if(right-left+1==k){
                if(k==neg.size()) ans[z++]=0;
                else ans[z++]=neg.get(k);
                if(k!=neg.size()&& A[left]==neg.get(k)) k++;
                left++;
            }
            right++;
        }
        return ans;

    }
         int search1(String pat,String txt){
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<pat.length();i++){
            map.put(pat.charAt(i),map.getOrDefault(pat.charAt(i),0 )+1);
        }
        int count=map.size();
        int left=0;
        int right=0;
        int ans=0;
        while(right<txt.length()){
            char c1=txt.charAt(right);
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)-1);
                if(map.get(c1)==0) count--;
            }
            if(right-left+1==pat.length()){
                if(count==0) ans++;
                char c2=txt.charAt(left);
                if(map.containsKey(c2)){
                    map.put(c2,map.get(c2)+1);
                    if(map.get(c2)==0) count++; 
                }
                left++;
            }
            right++;
        }
        return ans;
    }
    int search(String pat,String txt){

    HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<pat.length();i++){
            map.put(pat.charAt(i),map.getOrDefault(pat.charAt(i),0)+1);
        }
        int count = map.size();
        int left = 0;
        int right = 0;
        int ans = 0;
        while(right<txt.length()){
            char c1 = txt.charAt(right);
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)-1);
                if(map.get(c1)==0) count--;
            }
            if(right-left+1==pat.length()){
                if(count==0) ans++;
                char c2 = txt.charAt(left);
                if(map.containsKey(c2)){
                    map.put(c2,map.get(c2)+1);
                    if(map.get(c2)==1) count++;
                }
                left++;
            }
            right++;
        }
        return ans;
    }
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int left=0;
        int right=0;
        int sum=0;
        int ans=0;
        while(right<N){
            sum+=A[right];
            if(sum==K) {
                ans=Math.max(ans,right-left+1);
            }
            else if(sum>K){
                while(sum>K){
                sum-=A[left];
                left++;
                }
                if(sum==K) ans=Math.max(ans,right-left+1);
            }
            right++;
        }
     return ans;   
    }
    public static int lengthOfLongestSubstring(String s) {
        int max_length=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char c1=s.charAt(right);
            if(map.containsKey(c1)){
                left=Math.max(left,map.get(c1)+1);
            }
            map.put(c1,right);
            max_length=Math.max(max_length,right-left+1);
        }
        return max_length;
        
        
    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String pat=sc.next();
        String txt=sc.next();
        int N=sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int K=sc.nextInt();
        //String pat=sc.next();
        //String txt=sc.next();


        //System.out.println(isAnagram(s1, s2));
        //System.out.println(isAnagram2(s1, s2));
        //System.out.println(isAnagram3(s1, s2));
        //System.out.println(printFirstNegativeInteger(A[],N,K));
        //System.out.println(search1(pat,txt));
        System.out.println(lenOfLongSubarr(A, N, K));
        String s=sc.next();
        System.out.println(lengthOfLongestSubstring(s));


    }
 
}
