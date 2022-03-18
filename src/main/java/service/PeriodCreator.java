package service;

import model.PeriodModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PeriodCreator {
    public static PeriodModel withTwoNextDays(){
        return new PeriodModel(
                LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        );
    }
}
