package ARRAY;

public class Arraysum {
void Sum(){
    int arr[]={1,2,3,4};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];

    }
    System.out.print(sum);
}
    public static void main(String[] args) {
       Arraysum bo=new Arraysum();
       bo.Sum();
    }

}
