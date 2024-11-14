import java.util.Scanner;
public class GPAFinder {
    public static void main(String args[]){
        Scanner Hello = new Scanner(System.in);
        System.out.println("Hello Student , How many subjects you have in this semester?");
        int subj = Hello.nextInt();

        int arr[] = new int[subj];
        int sum = 0;
       for(int i = 0;i<arr.length ;i++){
           System.out.println("What are the marks in the subject " + (i+1) + ":");
          arr[i]= Hello.nextInt();   //Assigning the values directly into the array by this statement
       }
       for(int i =0 ; i<arr.length;i++){
           sum = sum+arr[i];
       }
       System.out.println("The sum of the " + subj + " subjects marks : " + sum);
       double avg = sum/arr.length ;
       System.out.println("The average of all subjects : "+avg);
    }
}


//GRADES ARE PENDING IN THIS PROGRAM ---- IT CAN BE DONE USING THE IF AND ELSE IF STATEMENTS