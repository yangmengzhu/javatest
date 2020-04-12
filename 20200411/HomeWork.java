 
 
 //import java.util.Rondom;
 import java.util.*;
 public class HomeWork {
	 public static void main(String[] args){//按顺序输出一个整数的每一位
		 Scanner scan = new Scanner(System.in);
		 int num = scan.nextInt();
		 while(num!=0){
			 int a = num;
			 int count = 0;
			 while(a>9){
				 a=a/10;
				 count++;
			 }if(a>=0&&a<10){
				 System.out.print(a+" ");
			 }
			 num=num%(int)Math.pow(10, count);
			 if(num>=0&&num<10){
				 System.out.print(num+" ");
				 break;
			 }
		 }
	 }
 }
	 /* public static void main(String[] args){//模拟3次输入密码
		Scanner scan = new Scanner(System.in);
		int count = 3;
		while(count!=0){
		System.out.println("请输入密码");
		String password = scan.nextLine();
		    if(password.equals("123456")){
			    System.out.println("密码正确");
				break;
		    }else{
			    count--;
			    System.out.println("密码错误，你还有"+count+"次机会");
		    }
		}
	 } */
	 /* public static void main(String[] args){//n*n乘法口诀表
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 int i = 1;
		 for(i=1;i<=n;i++){
			 int j = 1;
			 for(j=1;j<=i;j++){
				 System.out.print(i+"*"+j+"="+i*j+" ");
			 }
			 System.out.println();
		 }
	 } */
	 /* public static void main(String[] args){//一个整数二进制序列中奇数位和偶数位
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 int i = 0;
		 int ret = 0;
		 for(i=30;i>=0;i-=2){
			 ret=(n>>i)&1;
			 System.out.print(ret + " ");
		 }
		 System.out.println();
		 for(i=31;i>0;i-=2){
			 ret=(n>>i)&1;
			 System.out.print(ret + " ");
		 }
	 } */
	/* public static void main(String[] args){//求一个整数二进制中1的个数
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count= 0;
		while(n!=0){
			n=n&(n-1);
			count++;
		}
		System.out.println(count);
	} */
	/* public static void main(String[] args){//求两个正整数的最大公约数
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int tmp = n;
		while(m%n!=0){
			tmp=m%n;
			m = n;
			n = tmp;
		}
		System.out.println(tmp);
	} */
 
	 /* public static void main(String[] args){
		int i = 1;
		double sum = 0;
		int flag = 1;
		for(i=1;i<=100;i++){
			sum=sum+1.0/i*flag;
			flag = -flag;
		}
		System.out.println(sum);
	 } */
       //import java.util.Random;
	/* public static void main(String[] args){//猜数字游戏
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int randNum = random.nextInt(100);
		while(true){
			System.out.println("请输入一个数字");
			int num = scan.nextInt();
			if(num>randNum){
				System.out.println("猜大了");
			}else if(num<randNum){
				System.out.println("猜小了");
			}else{
				System.out.println("恭喜你，猜对了");
				break;
			}
		}
	} */
 
	/* public static void main(String[] args){//0-999之间的水仙花数
		int i = 0;
		for(i=1;i<=100000;i++){
			int sum =0;
			int count = 0;
			int tmp = i;
			while(tmp!=0){
				count++;
				tmp=tmp/10;
			}
		    tmp=i;
		    while(tmp!=0){
			   sum+=Math.pow(tmp%10,count);
			   tmp = tmp/10;
	        }if(sum==i){
			   System.out.print(i +" ");
			}
		}
		
	} */
	/* public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age<=18){
			System.out.println("少年");
		}else if(age>18&& age<=28){
			System.out.println("青年");
		}else if(age>28&&age<=55){
			System.out.println("中年");
		}else{
			System.out.println("老年");
		}
	} */
 
	/* public static void main(String[] args){//给定一个数判断它是否是素数
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 2;
		for(i=2;i<=Math.sqrt(n); i++){
			if(n%i==0){
				System.out.println(n+"不是素数");
				break;
			}
		}if(i>Math.sqrt(n)){
			System.out.println(n+"是素数");
		}
	}  */
 
    /* public static void main(String[] args) {//打印1-100之间所有的素数
		int i = 1;
		for(i=1;i<=100;i++) {
			int j = 2;
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0){
					break;
				}
			}if(j>Math.sqrt(i)){
				System.out.print(i+" ");
			}
		}
		
	} */
 
	/* public static void main(String[] args) {//1000-2000之间的闰年
		int year = 1000;
		for(year=1000;year<=2000;year++) {
			if((year%4==0 && year%100!=0) || (year%400==0)) {
				System.out.print(year+" ");
			}
		}
	} */
 
 
	 /* public static void main (String[] args) {//1-100中出现多少个9
	    int i = 0;
	    int count = 0;
		for(i=1;i<=100;i++){
		    if(i%10==9) {
				count++;
			}if(i/10==9){
				 count++;
			}
		}
		System.out.println(count);
	 } */
 