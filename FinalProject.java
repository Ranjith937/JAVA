//To use the same scanner variable multiple times we don't have to give the String or anyother datatype again.
//Instead we have to give only the existing scanner name i.e., pass1

import java.util.Scanner;
public class FinalProject {
    public static void main(String[] args) {
        Scanner proj = new Scanner(System.in);
        System.out.println("Hello , Welcome to the Food App!");
        System.out.print("Create your password : ");
        String pass = proj.next();
        System.out.print("Your Password is : " + pass);

        System.out.print("\nConfirm the Password : ");
        String pass1 = proj.next();

        while (!pass1.equals(pass)) {
            System.out.print("You have entered incorrect password.\nPlease re-enter your password: ");
            pass1 = proj.next();
        }
        System.out.println("Assess Granted");

        System.out.print("Are You Hungry? Yes or No : ");
        String ans1 = proj.next();

        if (ans1.equals("Yes")) {
            System.out.print("What would you like to eat? Biryani or Egg: ");
            String ans2 = proj.next();

            while (!ans2.equals("Biryani") && !ans2.equals("Egg")) {
                System.out.print("Sorry,We don't serve it here.Please , order the items in the list . Biryani or Egg : ");
                ans2 = proj.next();
            }
            if(ans2.equals("Biryani") || ans2.equals("Egg")) {
                System.out.print("OKay , you want " + ans2 + " Would you like to order any drinks ? Yes or No: ");
                String ans3 = proj.next();

                while (!ans3.equals("Yes") && !ans3.equals("No")) {
                    System.out.print("You have given a wrong input. \nPlease give the correct input : ");
                    ans3 = proj.next();
                }
                if (ans3.equals("Yes")) {
                    System.out.print("What would you like to drink ? Sprite or ThumsUp: ");
                    String ans4 = proj.next();

                    while (!ans4.equals("Sprite") && !ans4.equals("ThumsUp")) {
                        System.out.println("Sorry , we don't have that drink right now.\nChoose between Sprite or ThumsUp");
                        ans4 = proj.next();
                    }
                    if (ans4.equals("Sprite") || ans4.equals("ThumsUp")) {
                        System.out.print("You have ordered " + ans2 + " and " + ans4);
                    }
                    System.out.print("\nEnter the password: ");
                    pass1 = proj.next();

                    while (!pass1.equals(pass)) {
                        System.out.print("You have entered incorrect password.\nPlease try again: ");
                        pass1 = proj.next();
                    }
                }
                else {
                    System.out.println("You ordered " + ans2);
                    System.out.println("Please enter the password : ");
                    ans1 = proj.next();

                    while(!pass1.equals(pass)) {
                        System.out.println("You have entered incorrect password.Please try again.");
                        pass1 = proj.next();
                    }

                }
                System.out.println("Thanks for the order . Your order is on its way");
            }
        }
        else
        {
            System.out.println("Alright , Have a Good Day");
        }
    }
}
