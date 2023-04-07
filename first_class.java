
import java.util.ArrayList;

public class first_class extends customer {

    static ArrayList<String> first = new ArrayList<>();
static int busyf;
    public first_class() {
        first.add("F1");
        first.add("F2");
        first.add("F3");
    }

    public String reservation_first(String seat) {
        String answer = "";
        seat = seat.toUpperCase();

        if (first.contains(seat)) {
            answer = "The seat is available ,The reservation is successful ";
            first.remove(seat);
            customer.add(seat);
            busyf++;
            total++;
            first_customer++;
        } else {
            answer = "The seat isnot available ,The reservation isnot successful ";

        }
        return answer;

    }

    public String remove_seatF(String seat) {
        String ans2 = "";
        seat = seat.toUpperCase();
        if (first.contains(seat)) {
            ans2 = "It is already available";
        } else {
            if (seat.equals("F1") || seat.equals("F2") || seat.equals("F3")) {
                ans2 = "Remove reservation is  successful";
                first.add(seat);
                customer.remove(seat);
                total--;
                            busyf--;

                first_customer--;

            } else {
                ans2 = "There is somthing wrong , please try again";

            }
        }

        return ans2;
    }

}
