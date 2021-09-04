import java.util.Scanner;

public class project{
    public static void main(String[] args){

        System.out.println("Hello welcome to the food app.");
        System.out.println("Please create the password: ");
        Scanner scan = new Scanner(System.in);
        String pass = scan.next();
        System.out.println("Your password is now: " + pass);

        System.out.println("Please enter your password: ");
        String pass1 = scan.next();
        int try_num = 1;

        while(!pass1.equals(pass) && try_num < 3){
            System.out.println("This is not the right password, please try again: ");
            try_num += 1;
            System.out.println("You have " + (4 - try_num) + " opportunities.");
            pass1 = scan.next();
        }

        if(try_num >= 3){
            System.out.println("You have to reset your password: ");
            pass = scan.next();
        }

        System.out.println("Now your password is " + pass);

        System.out.println("Access granted.");
        System.out.println("Are you hungry? Yes or No");
        String ans1 = scan.next();

        if(ans1.equals("Yes")){
            System.out.println("Choose what you want to eat between pizza, burger or fish: ");
            String ans2 = scan.next();

            while(!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish")){
                System.out.println("Sorry we don't have it please choose between pizza, burger or fish: ");
                ans2 = scan.next();
            }

            if(ans2.equals("pizza") || ans2.equals("burger") || ans2.equals("fish")){
                System.out.println("Do you want something to drink? Yes or No: ");
                String ans3 = scan.next();

                while(!ans3.equals("Yes") && !ans3.equals("No")){
                    System.out.println("Wrong command please try again");
                    ans3 = scan.next();
                }

                if(ans3.equals("Yes")){
                    System.out.println("What would you like to drink coke or juice?");
                    String ans4 = scan.next();

                    while(!ans4.equals("coke") && !ans4.equals("juice")){
                        System.out.println("Sorry we don't have it. What would you like between coke and juice.");
                        ans4 = scan.next();
                    }

                    if(ans4.equals("coke") || ans4.equals("juice")){
                        System.out.println("Great you have ordered " + ans2 + " and " + ans4 );
                    }

                    System.out.println("Please confirm your password: ");
                    pass1 = scan.next();
                    while(!pass1.equals(pass)){
                        System.out.println("This is not the right password, please try again: ");
                        pass1 = scan.next();
                    }
                    System.out.println("Thank you. Your order is on it's way.");
                }

                else{
                    System.out.println("You have ordered " + ans2);
                    System.out.println("Please confirm your password: ");
                    pass1 = scan.next();
                    while(!pass1.equals(pass)){
                        System.out.println("This is not the right password, please try again: ");
                        pass1 = scan.next();
                    }
                }
            }
        }

        else{
            System.out.println("Have a nice day!");
        }
    }
}