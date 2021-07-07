package Case_study.libs;

import Case_study.models.Booking;

import java.io.Serializable;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking>, Serializable {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getIdBooking().compareTo(o2.getIdBooking()) != 0) {
            if (o1.getStartDate().compareTo(o2.getStartDate()) > 0) {
                return 1;
            } else if (o1.getStartDate().compareTo(o2.getStartDate()) < 0) {
                return -1;
            } else if (o1.getStartDate().compareTo(o2.getStartDate()) == 0) {
                if (o1.getEndDate().compareTo(o2.getEndDate()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        return 0;
    }
}




