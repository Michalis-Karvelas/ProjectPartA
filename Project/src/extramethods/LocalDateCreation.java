package extramethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateCreation {

    public static LocalDate stringToDate(String str){
        return LocalDate.parse(str, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
