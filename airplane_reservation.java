
import java.util.*;

public class airplane_reservation {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String result = "";
        int ans = 0;
        String seat = "";
        economy_class e = new economy_class();
        first_class f = new first_class();
customer c=new customer();
        while (ans != 6) {
            System.out.print("\t\tWelcome to BZU Sky Reservation System,\nchoose:\n1_To reserve one economy seat.\n2_To reserve one first class seat.\n"
                    + "3-To remove one reserved economy seat.\n4-To remove one reserved first class seat.\n5-To print reservation details.\n6_To exist.\n"
                    + "\t\tEnter Your choice(1 - 6)?\n");
           if(f.first.size()==0){
               System.out.println("We are sorry , all seats of first class are sold\n");
           }
              if(e.eco.size()==0){
               System.out.println("We are sorry , all seats of economy class are sold ");
           }
            ans = scn.nextInt();

            if (ans == 1) {
                System.out.println("Economy class available seats :- " + e.eco);

                System.out.println("Please enter your seat :-");
                seat = scn.next();
                result = e.reservation_economy(seat);
                System.out.println(result);
                                System.out.println("\nthe number of the total reserved seats so far :- "+c.total+"\n");

            } else if (ans == 2) {
                System.out.println("First class available seats :- " + f.first+"\n");

                System.out.println("Please enter your seat  :-");

                seat = scn.next();
                result = f.reservation_first(seat);

                System.out.println(result);
                System.out.println("\nthe number of the total reserved seats so far :- "+c.total+"\n");
            } else if (ans == 3) {
                System.out.println("Please enter your seat :-");
                seat = scn.next();
                result = e.remove_seatE(seat);

                System.out.println(result);
                                System.out.println("\nthe number of the total reserved seats so far :- "+c.total+"\n");

            } else if (ans == 4) {
                System.out.println("Please enter your seat :-");
                seat = scn.next();
                result = f.remove_seatF(seat);
                System.out.println(result);
                                System.out.println("\nthe number of the total reserved seats so far :- "+c.total+"\n");

            } else if (ans == 5) {
                System.out.println("Your information of reservation :-\nYour seats : - " +c.customer);
                System.out.println("Total seats :- "+c.total);
                System.out.println("number of seats of First class :- "+c.first_customer+"\nnumber of seats of Economy  class :- "+c.economy_customer);
                System.out.println("\n---------------------------------------------------------------------------------------------------------------------\n");
                System.out.println("The number of Busy seats are :- "+(f.busyf+e.busye)+"\nnumber of busy seats of First class :- "+f.busyf+"\nnumber of busy seats of Economy class :- "+e.busye+"\n--------------------------------------------------\n");
                System.out.println("The number of Empty seats are :- "+((3-f.busyf)+(24-e.busye))+"\nnumber of empty seats of First class :- "+(3-f.busyf)+"\nnumber of busy seats of Economy class :- "+(24-e.busye)+"\n");
            }
            else{
                System.out.println("\n---------------------------Thank you---------------------------");
            }
        }

    }
}
