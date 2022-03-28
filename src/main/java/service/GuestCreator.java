package service;

import model.GuestModel;

public class GuestCreator {

    public static GuestModel standart(){
        return new GuestModel(2, 0, 1);
    }
}
