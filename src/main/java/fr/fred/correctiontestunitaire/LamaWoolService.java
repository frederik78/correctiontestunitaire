package fr.fred.correctiontestunitaire;

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;

/**
 * Created by Frederic on 14/06/14.
 */
public class LamaWoolService {

    private final MutableDateTime now;

    public LamaWoolService(MutableDateTime now) {
        this.now = now;
    }

    public boolean isWoolTooOldToSell(DateTime shearDate) {
        // Joda mutable DateTime instance initialized to the current system date/time
//        MutableDateTime now = new MutableDateTime();
        now.addDays(-10);
        return now.isBefore(shearDate);
    }
}
