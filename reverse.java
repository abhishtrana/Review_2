import java.util.*;
class reverse{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String-");
String temp = sc.next();
char [] arr= temp.toCharArray();
String ans="";
for(int i =arr.length-1;i>=0;i--){
ans+=arr[i];
}
System.out.println("Reverse of this string is -:" + ans);
}
}
