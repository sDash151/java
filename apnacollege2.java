// import java.util.*;

// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number 1 : ");
//         int a = sc.nextInt();
//         System.out.print("Enter number 2 : ");
//         int b = sc.nextInt();
//         System.out.println("Sum is : " + (a+b));
//         System.out.println("Hello");
//         System.out.print("World");
//         System.out.print("!!!");
//     }
// }





// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the value of b : ");
//         int b = sc.nextInt();
//         System.out.println("The result is : " + ((a*b)/(a+b)));

//     }
// }





// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
//     }
// }




// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age>18){
//             System.out.println("Adult");
//         }else{
//             System.out.println("Not Adult");
//         }
//     }
// }




// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextint();
//         if(a%2!=0){
//             System.out.println("The number is Odd.");
//         }else{
//             System.out.println("The number is Even.");
//         }
//     }
// }





// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextint();
//         if(a%2==1){
//             System.out.println("The number is Odd.");
//         }else{
//             System.out.println("The number is Even.");
//         }
//     }
// }




// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input a :");
//         int a = sc.nextInt();
//         System.out.print("Input b :");
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("a is equal to b.");
//         }else{
//             if(a>b){
//                 System.out.println("a is greater than b.");
//             }else{
//                 System.out.println("a is lesser than b.");
//             }
//         }
//     }
// }





// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input a :");
//         int a = sc.nextInt();
//         System.out.print("Input b :");
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("a is equal to b.");
//         }else if(a>b){
//                 System.out.println("a is greater than b.");
//             }else{
//                 System.out.println("a is lesser than b.");
//             }
//     }
// }




// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input a :");
//         int a = sc.nextInt();
//         System.out.print("Input b :");
//         int b = sc.nextInt();
//         if(a==b)                        // if there is a single statement after 'if', 'elseif' or 'else' there is no need to use curly braces
//             System.out.println("a is equal to b.");
//         else if(a>b)
//                 System.out.println("a is greater than b.");
//             else
//                 System.out.println("a is lesser than b.");
//     }
// }




// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int Button = sc.nextInt();
//         if(Button==1)
//         System.out.println("HELLO");
//         else if(Button==2)
//         System.out.println("NAMASTE");
//         else if(Button==3)
//         System.out.println("Bonjour");
//         else
//         System.out.println("INVALID BUTTON");
//     }
// }




// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int Button = sc.nextInt();
//         switch(Button){
//             case 1: System.out.println("HELLO");
//             break;
//             case 2: System.out.println("NAMASTE");
//             break;
//             case 3: System.out.println("BONJOUR");
//             break;
//             default: System.out.println("INVALID BUTTON");
//         }
//     }
// }




// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
//     2 : - (Subtraction) a - b
//     3 : * (Multiplication) a * b
//     4 : / (Division) a / b
//     5 : % (Modulo or remainder) a % b
//     Calculate the result according to the operation given and display it to the user.
    


//     import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input a : ");
//         float a = sc.nextFloat();
//         System.out.print("Input b : ");
//         float b = sc.nextFloat();
//         System.out.print("Input the operation : ");
//         char c = sc.next().charAt(0);
//         switch(c){
//             case '+': System.out.println(a+b);
//             break;
//             case '-': System.out.println(a-b);
//             break;
//             case '*': System.out.println(a*b);
//             break;
//             case '/': System.out.println(a/b);
//             break;
//             case '%': System.out.println(a%b);
//         }
//     }
// }




// Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.print("Enter the number of the month : ");
//         int num = sc.nextInt();
//         System.out.print("The month is : ");
//         switch(num){
//             case 1: System.out.println("January");
//             break;
//             case 2: System.out.println("February");
//             break;
//             case 3: System.out.println("March");
//             break;
//             case 4: System.out.println("April");
//             break;
//             case 5: System.out.println("May");
//             break;
//             case 6: System.out.println("June");
//             break;
//             case 7: System.out.println("July");
//             break;
//             case 8: System.out.println("August");
//             break;
//             case 9: System.out.println("September");
//             break;
//             case 10: System.out.println("October");
//             break;
//             case 11: System.out.println("November");
//             break;
//             case 12: System.out.println("December");
//             break;
//             default: System.out.println("Invalid month");
//         }

//     }
// }




// FOR LOOP


// public class apnacollege2{
//     public static void main(String[] args) {
//         for(int i=0;i<=10;i++){
//             System.out.println(i);
//         }
//     }
// }




// Print all even numbers till n and count them.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number until which u want all the even numbers : ");
//         int n = sc.nextInt();
//         int a=0;
//         for(int i=0;i<=n;i++){
//             if(i%2==0){
//                 System.out.println(i);
//                 a++;
//             }
//         }
//         System.out.println("Total number of even numbers between 0 and " + n + " is " + a);

//     }
// }



// Print the sum of first n natural numbers.




// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number until which u want the sum : ");
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum=sum+i;
//         }
//         System.out.println("Total sum is : " + sum);
//     }
// }



// PRINT THE TABLE OF A NUMBER INPUT BY THE USER.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number whose multiplication table u want : ");
//         int a = sc.nextInt();
//         int mul;
//         for(int i=0;i<=10;i++){
//             mul=a*i;
//             System.out.println(a + "*" + i +"=" + mul);
//         }
//     }
// }




// Print if a number is prime or not (Input n from the user). 



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//         boolean isPrime = true;
//         for(int i=2;i<=n/2;i++){
//             if(n%i==0){
//                 isPrime = false;
//                 break;
//             }
//         }
//             if(isPrime==true){
//                 if(n==1){
//                 System.out.println("The number is neither Prime nor Composite.");
//                 }else{
//                 System.out.println("The number is a Prime Number.");
//                 }
//             }else{
//                 System.out.println("The number is not a Prime Number.");
//             }
        
//     }
// }




// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.





// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input;
//         do{
//             System.out.print("Enter the Marks : ");
//             int marks = sc.nextInt();
//             if(marks>=90 && marks<=100){
//                 System.out.println("This is Good.");
//             }else if(marks<=89 && marks>=60){
//                 System.out.println("This is also Good.");
//             }else if(marks<=59 && marks>=0){
//                 System.out.println("This is Good as well.");
//             }
//             System.out.println("If you want to continue Press 1 . If you dont want to continue press 0.");
//             input=sc.nextInt();
//         }while(input==1);
//     }

// }    





// NESTED LOOPS


// PRINT THE PATTERN(RECTANGLE)


// import java.util.*;
// public class apnacollege2{
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows you want to print : ");
//         int n = sc.nextInt();
//         System.out.println("Enter the number of column : ");
//         int m = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=m; j++){
//                 System.out.print("*");
//             }
//         System.out.println();
//         }
//      }
    
// }




// HOLLOW RECTANGLE



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows you want to print : ");
//         int n = sc.nextInt();
//         System.out.println("Enter the number of column : ");
//         int m = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=m; j++){
//                 if(i==1 || i==n || j==1 || j==m){
//                 System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//                 System.out.println();
            

//         }
//     }
// }




// HALF PYRAMID



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }




// INVERTED HALF PYRAMID



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=i; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }



// OR



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }




// ROTATED BY 180 DEGREES HALF PYRAMID




// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


//         }
//     }





// HALF PYRAMID WITH NUMBERS



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




// INVERTED HALF PYRAMID WITH NUMBERS



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//             n--;
//         }
//     }
// }



// OR



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




// OR



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




// FLOYD'S TRIANGLE



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int m=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(m);
//                 m++;
//             }
//              System.out.println();
//         }
//     }
// }




// 0-1 TRIANGLE



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 int sum=i+j;
//                 if(sum%2==0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }/



// Print a solid rhombus.


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// OR


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n;i>0;i--){
//             for(int k=i;k>0;k--){
//                 System.out.print(" ");
//             }
//             for(int j=n;j>0;j--){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }



// Print a number pyramid.


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }




// Print a palindromic number pyramid.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             int m;
//             for(m=1;m<=i;m++){
//                 System.out.print(m);
//             }
//             a=m-1;
//             for(int k=2;k<=i;k++){
//                 a--;
//                 System.out.print(a);
//                 }
//             System.out.println();
//         }

//     }
// }




// OR


// import java.util.*;


// public class apnacollege2{
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//         //first part
//            for(int j=i; j>=1; j--) {
//                System.out.print(j);
//            }
//          //second part
//            for(int j=2; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }   
// }




// BUTTERFLY PATTERN



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     for(int i=n;i>=1;i--){
//         for(int j=i;j>=1;j--){
//             System.out.print("*");
//         }
//         for(int j=2*(n-i);j>=1;j--){
//             System.out.print(" ");
//         }
//         for(int j=i;j>=1;j--){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }
     


//       OR



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// }
// }



// SOLID RHOMBUS


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.*;
// public class apnacollege2{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



// DIAMOND PATTERN



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//         OR
        



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
            
//             System.out.println();
//         }
        
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
            
//             System.out.println();
//         }
//         }
//     }
  
  
//   COPIED CODE

  
//         import java.util.*;

// public class Solutions {
//    public static void main(String args[]) {
//        int n = 5;
       

//          upper part
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
       


//         lower part
//        for(int i=n; i>=1; i--) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }   
// }



// HOLLOW RECTANGLE



// import java.util.*;
// public class apnacollege2{
// public static void main(String args[]) {
// int n = 4;
// int m = 5;
// for(int i=0; i<n; i++) {
// for(int j=0; j<m; j++) {
// if(i == 0 || i == n-1 || j == 0 || j == m-1) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }



// PRINT A HOLLOW RHOMBUS.


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=m;j++){
//                 if(i==1 || i==n || j==1 || j==m ){
//                 System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





// PRINT A HOLLOW BUTTERFLY.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if( j==1 || j==i){
//                 System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 if( j==1 || j==i){
//                 System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 if( j==1 || j==i){
//                 System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 if( j==1 || j==i){
//                 System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }




// PRINT PASCAL'S TRIANGLE(INCOMPLETE)


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int pas=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-(i-1);j++){
//                 System.out.print(" ");
//             }
//         System.out.print( pas);
            
//             pas=pas * 11;
//             System.out.println();
//         }
//     }
// }



// PRINT HALF PYRAMID OF NUMBERS.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }




// PRINT INVERTED HALF PYRAMID OF REPEATING NUMBERS



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n;i>=1;i--){
//             int j=i;
//             for(int m=1;m<=n-i;m++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();

//         }
//     }
// }



// MAKE A FUNCTION TO ADD 2 NUMBERS AND RETURN THE SUM.



// import java.util.*;
// public class apnacollege2{
//     public static int calculateSum(int a, int b){
//         int sum =a + b;
//         return sum;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         // System.out.println(calculateSum(a, b));
//         int sum = calculateSum(a, b);
//         System.out.println("The sum of above two numbers is : " + sum);
//     }
// }



// PRINT A GIVEN NAME IN A FUCTION


// import java.util.*;
// public class apnacollege2{
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         printMyName(name);
//     }
// }




// MAKE A FUNCTION TO MULTIPLY TWO NUMBERS AND RETURN THE PRODUCT.



// import java.util.*;
// public class apnacollege2{
//     public static void product(int a, int b){
//         int mul=a*b;
//         System.out.println("The product  of above two numbers is : " + mul);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         product(a, b);
//     }
// }



// OR



// import java.util.*;
// public class apnacollege2{
//     public static int product(int a, int b){
//         int mul=a*b;
//         return mul;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("The product of above two numbers is : " + product(a, b));
//     }
// }



// FIND THE FACTORIAL OF A NUMBER.


// import java.util.*;
// public class apnacollege2{
//     public static void printFactorial(int n){
//         if(n<0){
//             System.out.println("INVALID NUMBER");
//             return;
//         }
//         int factorial=1;
//         for(int i=n;i>=1;i--){
//             factorial=factorial*i;
//         }
//         System.out.println("The factorial of " + n + " is : " + (factorial));
//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printFactorial(n);
//     }
// }




// Make a function to check if a number is prime or not.



// import java.util.*;
// public class apnacollege2{
//     public static void isPrime(int a){
//         boolean primeNum = true;
//         for(int i=2;i<=a/2;i++){
//             if(a%i==0){
//                 primeNum = false;
//                 break;
//             }
//         }
//             if(primeNum==true){
//              if(a==1){
//                 System.out.println("The number is neither Prime nor Composite.");
//             }else{
//                 System.out.println("The number is a Prime number.");
//             }
//         }else{
//             System.out.println("The number is not a Prime number.");
//         }
        
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         isPrime(a);
//     }
// }



// Make a function to check if a given number n is even or not.



// import java.util.*;
// public class apnacollege2{
//     public static void isEven(int n){
//         if(n%2==0){
//             System.out.println("The number is even.");
//         }else{
//             System.out.println("The number is odd.");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         isEven(n);
//     }
// }





// Make a function to print the table of a given number n.



// import java.util.*;
// public class apnacollege2{
//     public static void mulTable(int n){
//         for(int i=0;i<=10;i++){
//             System.out.println(n + "*" + i + "=" + (n*i));
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         mulTable(n);
//     }
// }




// Enter 3 numbers from the user & make a function to print their average.



// import java.util.*;
// public class apnacollege2{
//     public static void avgNum(int a, int b, int c){
//         int avg = (a+b+c)/3;
//         System.out.println("The average of above 3 numbers is : " + avg); 
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         avgNum(a, b, c);

//     }
// }




// Write a function to print the sum of all odd numbers from 1 to n.



// import java.util.*;
// public class apnacollege2{
//     public static void printOdd(int n){
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             if(i%2==1){
//                 sum=sum+i;
//         }else{
//             sum=sum+0;
//         }
//         }
//         System.out.println("The sum of all odd numbers from 1 to " + n + " is : " + sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printOdd(n);
//     }
// }



// Write a function which takes in 2 numbers and returns the greater of those two.




// import java.util.*;
// public class apnacollege2{
//     public static void greaterNum(int a, int b){
//         if(a>b){
//             System.out.println("The greater number is : " + a);
//         }else{
//             System.out.println("The greater number is : " + b);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         greaterNum(a, b);
//     }
// }




// Write a function that takes in the radius as input and returns the circumference of a circle.




// import java.util.*;
// public class apnacollege2{
//     public static void cirCum(int  r){
//         double circum= 2*(3.14)*r;
//         System.out.println("The circumference of the circle of radius " + r + " is : " + circum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         cirCum(r);
//     }
// }




// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.




// import java.util.*;
// public class apnacollege2{
//     public static void eligVote(int age){
//         if(age>18){
//             System.out.println("The person is eligible to vote.");
//         }else{
//             System.out.println("The person is not eligible to vote.");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         eligVote(age);
//     }
// }



// Write an infinite loop using do while condition.


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         String i = "LUND LELO!!!!";
//         int j=1;

//         do{
//             System.out.println(i);
//             j++;
//         }while(j>0);
//     }
// }




// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 





// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Press 1 to continue & 0 to stop.");
//         int input = sc.nextInt();
//         int positive = 0;
//         int negative = 0;
//         int zeros = 0;
//         while(input==1){
//             System.out.print("Enter your number : ");
//             int num = sc.nextInt();
//             if(num>0){
//                 positive++;
//             }else if(num<0){
//                 negative++;
//             }else if(num==0){
//                 zeros++;
//             }
//             System.out.println("Press 1 to continue & 0 to stop.");
//             input = sc.nextInt();
//         }
//         System.out.println("POSITIVE NUMBERS : " + positive);
//         System.out.println("NEGATIVE NUMBERS : " + negative);
//         System.out.println("ZEROS : " + zeros);
//     }
// }




// COPIED CODE




// import java.util.*;


// public class apnacollege2 {
//    public static void main(String args[]) {
//        int positive = 0, negative = 0, zeros = 0;
//        System.out.println("Press 1 to continue & 0 to stop");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();


//        while(input == 1) {
//            System.out.println("Enter your number : ");
//            int number = sc.nextInt();
//            if(number > 0) {
//                positive++;
//            } else if(number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }


//            System.out.println("Press 1 to continue & 0 to stop");
//            input = sc.nextInt();
//        }


//        System.out.println("Positives : "+ positive);
//        System.out.println("Negatives : "+ negative);
//        System.out.println("Zeros : "+ zeros);
//    }   
// }





// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.




// import java.util.*;
// public class apnacollege2{
//     public static void poWer(int a, int b){
//         int exp=a;
//         for(int i=1;i<b;i++){
//             exp = exp*a;
//         }
//         System.out.println(a + " raised to the power " + b + " is : " +exp);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Base Value : ");
//         int a = sc.nextInt();
//         System.out.println("Enter the Index Value : ");
//         int b = sc.nextInt();
//         poWer(a, b);   
//     }
// }




// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)




// import java.util.*;


// public class apnacollege2 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();


//        while(n1 != n2) { 
//            if(n1>n2) {
//                n1 = n1 - n2;
//            } else {
//                n2 = n2 - n1;
//            }
//        }
//        System.out.println("GCD is : "+ n2);
//    }   
// }






// MRIDUL QUESTION




// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("   ");
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }


//     }
// }




// FIBONACCI SERIES 


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int j=0;
//         int k=1;
//         System.out.print(j + " ");
//         for(int i=1;i<=n;i++){
//             System.out.print(k + " ");
//             int temp = k;
//             k=j + k;
//             j=temp;
//         }
//     }
// }





// Taking an array as an input and printing its elements.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int [] numbers = new int[size];

//         for(int i=0;i<size;i++){
//             numbers[i] = sc.nextInt();
//         }

//         //     for(int i=0;i<size;i++){                           
//         //     System.out.println(numbers[i]);
//         // }


//         // or


//         for(int i=0;i<numbers.length;i++){
//             System.out.println(numbers[i]);
//         }


//     }
// }





// practice

// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         for(int i=0;i<size;i++){
//             numbers[i]=sc.nextInt();
//         }

//         for(int i=0;i<numbers.length;i++){
//             System.out.print(numbers[i]);
//         }
        
//     }
// }





// Take an array of names as input from the user and print them on the screen.




// import  java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count = sc.nextInt();
//         String names[] = new String[count];
//         for(int i=0;i<count;i++){
//             names[i] = sc.nextLine();
//         }
//         for(int i=0;i<count;i++){
//             System.out.println(names[i]);
//         }

//     }
// }




// Find the maximum & minimum number in an array of integers. 



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("How many numbers you want to input : ");
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         for(int i=0;i<size;i++){
//             System.out.print("Number " + (i+1) + ": ");
//             numbers[i] = sc.nextInt();
//         }
//         int min = Integer.MAX_VALUE; 
//         int max = Integer.MIN_VALUE;                       //Integer.MAX_VALUE
//                                                           // Integer.MAX_VALUE is a constant in the Integer class of java.lang package that specifies that stores the maximum possible value for any integer variable in Java. The actual value of this is
//                                                          // 2^31-1 = 2147483647
//          for(int i=0;i<numbers.length;i++){              //Any integer variable cannot store any value beyond this limit. Upon doing so, the memory will overflow and the value will get negative.

//                                                         //Integer.MIN_VALUE is a constant in the Integer class of java.lang package that specifies that stores the minimum possible value for any integer variable in Java. The actual value of this is
//                                                         // -2^31 = -2147483648
//             if(numbers[i]<min){                        
//                 min = numbers[i];
//             }
//             if(numbers[i]>max){
//                 max = numbers[i];
//             }
            
//         }
//         System.out.println("The greatest number is : " + max);
//         System.out.println("The smallest number is : " + min);
//     }
// }





// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.


// import java.util.*;


// public class apnacollege2 {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       int numbers[] = new int[size];


//       //input
//       for(int i=0; i<size; i++) {
//           numbers[i] = sc.nextInt();
//       }
//       System.out.println(numbers.length);

//       boolean isAscending = true;
     
//        for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
//            if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
//                isAscending = false;
//            }
//        }


//        if(isAscending) {
//            System.out.println("The array is sorted in ascending order");
//        } else {
//            System.out.println("The array is not sorted in ascending order");
//        }
      
//    }
// }





// Taking a matrix as an input and printing its elements.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int matrix[][] = new int[rows][cols];
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<rows;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// Searching for an element x in a matrix.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        int matrix[][] = new int[rows][cols];
//        for(int i=0;i<rows;i++){
//         for(int j=0;j<cols;j++){
//             matrix[i][j] = sc.nextInt();
//         }
//        } 
//        System.out.println("Enter the number you want to search : ");
//        int x = sc.nextInt();
//        for(int i=0;i<rows;i++){
//         for(int j=0;j<cols;j++){
//             if(matrix[i][j]==x){
//                 System.out.println("Your number is in : [" + (i+1) + "," + (j+1) + "]");
//             }
//         }
//        }
//     }
// }


// Print the spiral order matrix as output for a given matrix of numbers. 



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         int n = sc.nextInt();
//         int matrix[][] = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//             int row_start = 0;
//             int row_end = m-1;
//             int col_start = 0;
//             int col_end = n-1;

//             while( row_start<=row_end && col_start<=col_end ){
//                 for(int col = col_start; col<=col_end;col++ ){
//                     System.out.print(matrix[row_start][col] + " ");
//                 }
//                 row_start++;

//                 for(int row = row_start;row<=row_end;row++){
//                     System.out.print(matrix[row][col_end] + " ");
//                 }
//                 col_end--;

//                 for(int col = col_end;col>=col_start;col--){
//                     System.out.print(matrix[row_end][col] + " ");
//                 }
//                 row_end--;

//                 for(int row = row_end;row>=row_start;row-- ){
//                     System.out.print(matrix[row][col_start]);
//                 }
//                 col_start++;

//                 System.out.println();
//              }
//      }
// }




// PRACTISEEEEEEEE


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         int n = sc.nextInt();
//         int matrix[][] = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         int row_start = 0;
//         int row_end = m-1;
//         int col_start = 0;
//         int col_end = n-1;

//         while(row_start<=row_end && col_start<=col_end){
//             for(int col=col_start;col<=col_end;col++){
//                 System.out.print(matrix[row_start][col] + " ");
//             }
//             row_start++;

//             for(int row=row_start;row<=row_end;row++){
//                 System.out.print(matrix[row][col_end] + " ");
//             }
//             col_end--;

//             for(int col=col_end;col>=col_start;col--){
//                 System.out.print(matrix[row_end][col] + " ");
//             }
//             row_end--;

//             for(int row=row_end;row>=row_start;row--){
//                 System.out.print(matrix[row][col_start] + " ");
//             }
//             col_start++;
//             System.out.println();
//         }
//     }
// }




// For a given matrix of N x M, print its transpose.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int M = sc.nextInt();
//         int matrix[][] = new int[N][M];
//         for(int i=0;i<N;i++){
//             for(int j=0;j<M;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         for(int i=0;i<N;i++){
//             for(int j=0;j<M;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println("The transpose of the given matrix is : ");

//         for(int j=0;j<M;j++){
//             for(int i=0;i<N;i++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }




// TAKE A STRING AS INPUT AND PRINT IT.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
//     }
// }



// CONCATENATION,PRINT LENGTH OF A STRING;ACCESS CHARACTERS OF A STRING.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String firstname = sc.nextLine();
//         String middlename= sc.nextLine();
//         String lastname = sc.nextLine();
//         String fullname = firstname + " " + middlename + " " + lastname;    //CONCATENATION
//         System.out.println(fullname);
//         System.out.println("The length of the whole string is : " + fullname.length());

//         for(int i=0;i<fullname.length();i++){
//             System.out.println(fullname.charAt(i));
//         }

//     }
// }




// COMPARE 2 STRINGS.


// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         String name1 = sc.nextLine();
//         String name2 = sc.nextLine();
//         // if(name1.equals(name2)){
//         //     System.out.println("The strings are equal.");
//         // }else{
//         //     System.out.println("The strings are not equal.");
//         // }

//         if(name1.compareTo(name2) == 0){
//             System.out.println("The strings are equal.");
//         }else{
//             System.out.println("The strings are not equal.");
//         }
//     }
// }




// PRINT THE SUBSTRING OF A STRING.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name.substring(3,5));
//     }
// }



// TO CONVERT A STRING INTO AN INTEGER.

// public class apnacollege2{
//     public static void main(String[] args) {
//         String str = "123";
//         int number = Integer.parseInt(str);
//         System.out.println(number);
//     }
// }



// TO CONVERT AN INTEGER INTO A STRING.


// public class apnacollege2{
//     public static void main(String[] args) {
//         int number = 123;
//         String str = Integer.toString(number);
//         System.out.println(str);
//         System.out.println(str.length());
//     }
// }




// ALWAYS REMEMBER : Java Strings are Immutable.






// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String arr[] = new String[n];
//         int length=0;
//         for(int i=0;i<n;i++){
//             arr[i]= sc.next();
//             length = length + arr[i].length();
//         }
//         System.out.println(length);  
//     }
// }




// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//     //    String result;
//     //    System.out.println("Input the name : ");
//     //     String Original = sc.next();

//     //      result =  Original.replace("e", "i");
//     //      System.out.println(result);

//         String Original = sc.nextLine();
//         String result="";
//         for(int i=0;i<Original.length();i++){
//             if(Original.charAt(i)== 'e'){
//                 result += 'i';
//             }else{
//                 result += Original.charAt(i);
//             }
//         }
//         System.out.println(result);

//         }
//     }




// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your Email : ");
//         String email = sc.nextLine();
//         String username="";
//         for(int i=0;i<email.length();i++){
//             if(email.charAt(i)!= '@'){
//                 username += email.charAt(i);
//             }else{
//                 break;
//             }
//         }
//         System.out.println(username);    
//     }
// }




// Get A Character from Index



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder();
//         String input = sc.nextLine();
//         sb.append(input);
//         System.out.println(sb.charAt(0));
//     }
// }




// Set a Character at Index


// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new  Scanner(System.in);
//         StringBuilder sb = new StringBuilder();
//         String input = sc.nextLine();
//         sb.append(input);
//         sb.setCharAt(0,'G');
//         System.out.println(sb);
//     }
// }




// Insert a Character at Some Index



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder();
//         String input = sc.nextLine();
//         sb.append(input);
//         sb.insert(2, 'E');
//         System.out.println(sb);
//     }
// }


// Delete char at some Index



// import java.util.*;
// public class apnacollege2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder();
//         String input = sc.nextLine();
//         sb.append(input);
//         sb.deleteCharAt(1);
//         System.out.println(sb);
//     }
// }



// Append a char 


// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder("Lund kaat ke ");
//         String input = sc.nextLine();
//         // sb.append("Teri maa ki choot");
//         sb.append(input);
//         System.out.println(sb);
//     }
// }



// Print Length of String



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder();
//         String input = sc.nextLine();
//         sb.append(input);
//        System.out.println( sb.length());
//     }
// }



// Reverse a String (using StringBuilder class)




// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder();
//         String input = sc.nextLine();
//         sb.append(input);
//         for(int i=0;i<sb.length()/2;i++){
//             int front = i;
//             int back = sb.length()-i-1;
//             char frontchar = sb.charAt(front);
//             char backchar = sb.charAt(back);
//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back, frontchar);
//         }
//         System.out.println(sb);
//     }
// }




// PRACTICEEEEE




// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder();
//         String input = sc.nextLine();
//         sb.append(input);
//         for(int i=0;i<sb.length()/2;i++){
//             int front = i;
//             int back = sb.length()-i-1;
//             char frontchar = sb.charAt(front);
//             char backchar = sb.charAt(back);
//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back, frontchar);
//         }
//         System.out.println(sb);
//     }
// }





// BIT MANIPULATION.




// GET BIT



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         int n=5;    //0101
//         int pos = 3;
//         int bitmask = 1<<pos;
//         if((bitmask&n)== 0){
//             System.out.println("Bit was zero.");
//         }else{
//             System.out.println("Bit was one.");
//         }

//     }
// }





// USER INPUT PROGRAM(GET BIT)



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         System.out.print("Enter the position : ");
//         int pos = sc.nextInt();
//         int bitmask = 1<<pos;
//         if((bitmask&n)==0){
//             System.out.println("Bit was zero.");
//         }else{
//             System.out.println("Bit was one.");
//         }

//     }
// }





// SET BIT



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         int n = 5;    //5 = 0101
//         int pos = 1;
//         int bitmask = 1<<pos;
//         int newNumber = bitmask | n;
//         System.out.println(newNumber); 
//     }
// }



// USER INPUT PROGRAM(SET BIT)



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         System.out.print("Enter the position : ");
//         int pos = sc.nextInt();
//         int bitmask = 1<<pos;
//         int newNumber = bitmask | n;
//         System.out.println(newNumber);
//     }
// }




// CLEAR BIT



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 2;
//         int bitmask = 1<<pos;
//         int newBitmask = ~(bitmask);
//         int newNumber = newBitmask & n;
//         System.out.println(newNumber);
//     }
// }



// USER INPUT PROGRAM(CLEAR BIT)



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         System.out.print("Enter the position : ");
//         int pos = sc.nextInt();
//         int bitmask = 1<<pos;
//         int newBitmask = ~(bitmask);
//         int newNumber = newBitmask & n;
//         System.out.println(newNumber);

//     }
// }




// UPDATE BIT 



// import java.util.*;
// public class apnacollege2 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int operation = sc.nextInt();
//         //OPERATION 1->SET  ;  OPERATION 0->CLEAR
//         int n = 5;
//         int pos = 1;
//         int bitmask = 1<<pos;

//         if(operation == 1){
//             //SET OPERATION
//             int newNumber = bitmask | n;
//             System.out.println(newNumber);
//         }else{
//             //CLEAR OPERATION
//             int newBitmask = ~(bitmask);
//             int newNumber = newBitmask & n;
//             System.out.println(newNumber);
//         }
//     }
// }




// BUBBLE SORT



// import java.util.*;
// public class apnacollege2 {

//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }

//         // BUBBLE SORT

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     //SWAP
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         printArray(arr);

//     }
// }




// PRACTICEEEEEEE




// import java.util.*;
// public class apnacollege2 {

//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         printArray(arr);
//     }
// }





// SELECTION SORT




// import java.util.*;
// public class apnacollege2 {

//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         // SELECTION SORT
//         for(int i=0;i<arr.length-1;i++){
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[smallest]){
//                     smallest=j;
//                 }
//             }
//             // SWAP
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i]=temp;
//         }
//         printArray(arr);
//     }
// }




// PRACTICEEEEE



// import java.util.*;
// public class apnacollege2 {

//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0;i<arr.length-1;i++){
//             int smallest =i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[smallest]){
//                     smallest  = j;
//                 }
//             }
//             int temp = arr[smallest];;
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printArray(arr);
//     }
// }






// INSERTION SORT




// import java.util.*;
// public class apnacollege2 {

//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         //INSERTION SORT

//         for(int i=1;i<arr.length;i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && arr[j]>current){
//                 //KEEP SWAPPING

//                 arr[j+1]=arr[j];
//                 j--; 
//             }
//             arr[j+1] = current;
//         }
//         printArray(arr);
//     }
// }




// PRACTICEEEEEE




// import java.util.*;
// public class apnacollege2 {

//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=1;i<arr.length;i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && arr[j]>current){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }
//         printArray(arr);
//     }
// }




// PRACTICEEEE



// import java.util.*;
// public class apnacollege2 {

//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         printArray(arr);
//     }
// }




// PRACTICEEEE



// import java.util.*;
// public class apnacollege2 {

//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i] + " ");
//         }
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0;i<arr.length-1;i++){
//             int smallest = i;
//             for(int j=i+1;i<arr.length;i++){
//                 if(arr[j]<arr[smallest]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;

//         }
//         printArray(arr);

//     }
// }




// RECURSION



// PRINT NUMBERS FROM n TO 1.


// import java.util.*;
// public class apnacollege2 {

//     public static void printNumb(int n){
//         if(n==0){
//             return;
//         }
//         System.out.print(n + " ");
//         printNumb(n-1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printNumb(n);
//     }
// }




// PRINT NUMBERS FROM 1 TO n.



// import java.util.*;
// public class apnacollege2 {

//     public static void printNumb(int n, int m){
//         if(n==m){
//             return;
//         }
//         System.out.print(n + " ");
//         printNumb(n+1,m);
//         }

//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int m = sc.nextInt();
//             printNumb(n,m);
//         } 
//     }




// PRINT SUM OF FIRST n NATURAL NUMBERS.




// import java.util.*;
// public class apnacollege2 {

//     public static void sumNumb(int i,int n,int sum){
//         if(i==n){
//             sum+=i;
//             System.out.println("The sum of first " + n + " natural numbers is : " +sum);
//             return;
//         }
//         sum+=i;
//         sumNumb(i+1, n, sum);
//         System.out.println(i);  //To understand how function returns inside a stack.
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i = 0;
//         int n=sc.nextInt();
//         int sum = 0;
//         sumNumb(i, n, sum);
//     }
// }




// PRINT FACTORIAL OF A NUMBER N.



// import java.util.*;
// public class apnacollege2 {

//     public static int calcFactorial(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int factnm1 = calcFactorial(n-1);
//         int factn = n*factnm1;
//         return factn;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int ans = calcFactorial(n);
//         System.out.print("The factorial of " + n + " is : " + ans);

//     }
// }




//OR 



// import java.util.*;

// public class apnacollege2  {
//     public static void printFactorial(int n, int fact) {
//     if(n == 0) {
//     System.out.println("The factorial of the number is : " + fact);
//     return;
//     }
//     fact *= n;
//     printFactorial(n-1, fact);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//     printFactorial(n, 1);
//     }
//     }





//PRINT FIBONACCI SEQUENCE TILL nth TERM.




// import java.util.*;
// public class apnacollege2 {

//     public static void printFib(int a, int b , int n){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.print(c);
//         printFib(b, c, n-1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a=0;
//         int b=1;
//         System.out.print(a);
//         System.out.print(b);
//         printFib(a, b, n);
//     }
// }












