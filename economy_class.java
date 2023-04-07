
import java.util.ArrayList;

public class economy_class extends customer {

    static ArrayList eco = new ArrayList();
static int busye;
    public economy_class() {
        eco.add("E1");
        eco.add("E2");
        eco.add("E3");
        eco.add("E4");
        eco.add("E5");
        eco.add("E6");
        eco.add("E7");
        eco.add("E8");
        eco.add("E9");
        eco.add("E10");
        eco.add("E11");
        eco.add("E12");
        eco.add("E13");
        eco.add("E14");
        eco.add("E15");
        eco.add("E16");
        eco.add("E17");
        eco.add("E18");
        eco.add("E19");
        eco.add("E20");
        eco.add("E21");
        eco.add("E22");
        eco.add("E23");
        eco.add("E24");
    }

    public String reservation_economy(String seat) {
        String answer = "";
        seat = seat.toUpperCase();

        if (eco.contains(seat)) {
            answer = "The seat is available ,The reservation is successful ";
            eco.remove(seat);
            customer.add(seat);
total++;
busye++;
economy_customer++;
        } else {
            answer = "The seat isnot available ,The reservation isnot successful ";

        }
        return answer;

    }

    public String remove_seatE(String seat) {
        String ans2 = "";
        seat = seat.toUpperCase();
        if (eco.contains(seat)) {
            ans2 = "It is already available";
        } else {
            if (seat.equals("E1") || seat.equals("E2") || seat.equals("E3") || seat.equals("E4") || seat.equals("E5") || seat.equals("E6")
                    || seat.equals("E7") || seat.equals("E8") || seat.equals("E9") || seat.equals("E10") || seat.equals("E11") || seat.equals("E12") || seat.equals("E13") || seat.equals("E14")
                    || seat.equals("E15") || seat.equals("E16") || seat.equals("E16") || seat.equals("E17") || seat.equals("E18") || seat.equals("E19") || seat.equals("E20") || seat.equals("E21") || seat.equals("E22") || seat.equals("E23")
                    || seat.equals("E24")) {
                ans2 = "Remove reservation is  successful";
                eco.add(seat);
                customer.remove(seat);
                busye--;
total--;
economy_customer--;
            } else {
                ans2 = "There is somthing wrong , please try again";

            }
        }

        return ans2;
    }

}
