public class Patterns {
    public static void pattern1(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public static void pattern2(){
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void pattern3(){
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public static void pattern4(){
        int n=5;
        for(int i=1;i<=5;i++){
            int a=65;
            for(int j=1;j<=i;j++){
                System.out.print((char)(a)+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void pattern5(){
        int n=5;
        int a=65;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(a)+" ");
            }
            a++;
            System.out.println();
        }
    }

    public static void pattern6(){
        int n=5;
        int k=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

    }
    public static void pattern7(){
        int n=5;   
        for(int i=1;i<n;i++){
            int k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

    }
    public static void pattern8(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            int a=65;
            for(int j=1;j<=n-i+1;j++){
                System.out.print((char)(a));
                a++;
            }
            System.out.println();
        }
    }
    public static void pattern9(){
        int n=15;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public static void pattern10(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern11(){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }



    
    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4();
        //pattern5();
        //pattern6();
        //pattern7();
       // pattern8();
       //pattern9();
       //pattern10();
       pattern11();
    }
    
    
}
