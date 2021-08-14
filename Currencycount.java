import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter amount : ");
int amount=sc.nextInt();
Currencycount(amount);
}
public static void Currencycount(int amount)
{
int a[]=new int[]{2000,500,200,100,50,20,10,5,1};
int t=amount;
int count=0;
int total=0;
System.out.println("Currency Count");
for(int i=0;i<9;i++)
{
count=amount/a[i];
if(count!=0)
{
System.out.println((a[i]+" : "+count));
}
total=total+count;
amount=amount%a[i];
}
System.out.println("Minimum number of notes = "+total);
}
}

output1:

Enter amount : 800
Currency Count
500 : 1
200 : 1
100 : 1
Minimum number of notes = 3

output2:

Enter amount : 2456
Currency Count
2000 : 1
200 : 2
50 : 1
5 : 1
1 : 1
Minimum number of notes = 6
