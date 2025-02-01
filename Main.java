import java.util.*;
class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array-:");
int n = sc.nextInt();
int [] arr = new int[n];
System.out.println("Enter the elements of array-:");
for(int i =0;i<n;i++){
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
ArrayList<Integer> temp = new ArrayList<>();
for(int i =0;i<n;i++){
for(int j =i+1;j<n;j++){
if(arr[i] == arr[j]){
temp.add(arr[i]);
}
}
}
ArrayList<Integer> temp2= new ArrayList<>();
int c=0;
temp2.add(temp.get(0));
for(int i =1;i<temp.size()-1;i++){
if(temp.get(i) == temp.get(i+1)){
c=1;
}
else{
temp2.add(temp.get(i+1));
}
}
System.out.println(temp2);
}
}

