package service;

import io.qameta.allure.Step;
import model.GuestModel;

public class GuestCreator {
    @Step
    public static GuestModel standart(){
        return new GuestModel(2, 0, 1);
    }
}
