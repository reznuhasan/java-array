import java.util.Scanner;
class Enhanced{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter array index"+i +" :-");
            arr[i]=sc.nextInt();
        }
        for(int value:arr){
            System.out.print(value+" ");
        }
        

    }
}