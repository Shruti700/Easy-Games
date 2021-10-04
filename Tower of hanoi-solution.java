import java.util.*;
public class tower{
    static int count=0;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a = sc.nextInt();
    String s1="First_tower";
    String s2="Second_tower";
    String s3="Third_tower";

    hanoi(a,s1,s2,s3);
    int o = counting();
    System.out.println("Total moves "+o-1);
}
static int counting(){
    count+=2;
    return count;
}
static void hanoi(int n, String source, String aux, String des){

    if(n==1){
        System.out.println("Move "+n+" from "+source+" to "+des);
    }
    else{

        hanoi(n-1,source,des,aux);
        System.out.println("Move "+n+" from "+source+" to "+des);

        hanoi(n-1,aux,source,des);
        counting();
    }

}
}
//Alternatively you can calculate no. of moves for n disks ==> (2^n) -1
