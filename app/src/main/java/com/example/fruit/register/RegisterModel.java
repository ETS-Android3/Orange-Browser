package com.example.fruit.register;

import com.example.fruit.MyAppliaction;
import com.example.fruit.bean.User;
import com.example.fruit.dao.DBController;

public class RegisterModel {
    private DBController mDBController;
    private User mUser;

    public RegisterModel() {
        mUser = new User(null, "", "");
        mDBController = new DBController(MyAppliaction.getContext());
    }

    public boolean checkUserExist(String username) {
        return mDBController.checkUserExist(username);
    }

    public void insertUser(String username, String password) {
        mUser.setName(username);
        mUser.setPassword(password);
        mDBController.insertUser(mUser);
    }
}