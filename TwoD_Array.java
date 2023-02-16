import java.util.Scanner;
class Array2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of n:");
        int n=sc.nextInt();
        System.out.print("Size of m:");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("i= "+i+" j= "+j+":-");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int a[]:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}