public class Recursion {
    public static void print1to5(int start,int end){
        if(start>end) return;
        System.out.println(start);
        print1to5(start+1, end);

    }
    public static void sum(int start,int end,int sum){
        if(start>end){
            System.out.println(sum);
             return;
        }
        
        sum(start+1, end,sum+start);

    }
    public static void fact(int n,int fact) {
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact(n-1,fact*n);

    }
    public static void fib(int n,int a,int b){
        if(b>n) return;
        System.out.println(a+b);
        fib(n-1,b,a+b);    
    }
    public static int fib2(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
    else    return fib2(n-1)+fib2(n-2);
    }
    public static boolean sort(int[] a,int i){
        if(i==a.length-1) return true;
        if(a[i]<a[i+1]){
            return sort(a,i+1);
        }
        return false;
    }
    public static void movextoend(String s,int i,String newstr,int count){
        if(i==s.length()){
            for(int j=0;j<count;j++){
                newstr+='x';
            }
        }
        if(s.charAt(i)=='x'){
            movextoend(s, i+1, newstr, count+1);
        }
        else{
            movextoend(s, i+1, newstr+s.charAt(i), count);
        }
    }
    
    public static void removeDuplicates(String s,int i,String newstr){
        if(i==1) newstr+=s.charAt(0);
        if(i==s.length()) {
            System.out.println(newstr);
            return;
        }
        if(s.charAt(i)!=s.charAt(i-1)){
            removeDuplicates(s, i+1, newstr+s.charAt(i));
        }
        else {   
            removeDuplicates(s, i+1, newstr);
        }
    }
    public static void printSubsequences(String s,int i,String newstr){
        if(i==s.length()){
            System.out.print(newstr+" ");
            return;
        }
        printSubsequences(s, i+1, newstr+s.charAt(i));
        printSubsequences(s, i+1, newstr);
    }
    public static void permutations(String s,String per){
        if(s.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            String newString=
            permutations(s,per+s.charAt(c));
        }
    }


    public static void main(String[] args) {
        //print1to5(1,5);
        //sum(1,5,0);
        //fact(5,1);
        //fib(20,0,1);
        //System.out.println(fib2(20));
        //int[] a={1,2,3,5,4};
        //System.out.println(sort(a,1));
        //movextoend("abxcsxvx", 0,"", 0);
        //removeDuplicates("abbcdde", 1, "");
        //printSubsequences("abcd", 0, "");
        permutations("abcd","");
    } 
    

}
  