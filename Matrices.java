public class Matrices {
    public static void Transpose(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void printmatrix(int[][]a){
        System.out.print(" matrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
    public static void mirrorMatrix(int[][]a){
        Transpose(a);
        int k=a.length-1;
        for(int i=0;i<k;i++,k--){
            for(int j=0;j<a[i].length;j++){
                int temp=a[i][j];
                a[i][j]=a[k][j];
                a[k][j]=temp;
            }
        }

    }
    public static void spiralMatrix(int [][]a){
        int top=0;
        int left=0;
        int right=a[0].length-1;
        int bottom=a.length-1;
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" "); 
              
            }
            right--;
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                System.out.print(a[i][left]+" ");
            }
            left++;
        }
        
    }
    public static void snakePattern(int [][]a){
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
            else{
                for(int j=a[i].length-1;j>=0;j--){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
    public static void boundaryTraversal(int[][]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[0][i]+" ");
        }
        System.out.println();
        for(int i=1;i<a.length;i++){
            System.out.print(a[i][a[i].length-1]+" ");
        }
        System.out.println();
        for(int i=a[0].length-2;i>=0;i--){
            System.out.print(a[a.length-1][i]+" ");
        }
        System.out.println();
        for(int i=a.length-1;i>=1;i--){
            System.out.print(a[i][0]+" ");
        }
    }
    
    public static void main(String[] args) {
        int[][]a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.print("given matrix: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        //Transpose(a);
        //printmatrix(a);
        //mirrorMatrix(a);
        //printmatrix(a);
        //spiralMatrix(a);
        //snakePattern(a);
        boundaryTraversal(a);
    }
    
}
