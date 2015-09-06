package com.example.nauman.signuptest;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by Nauman on 9/5/2015.
 */
public class SignUpTest extends Application
{
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "RCn57k9sf8XsDb9lTEfRReAA5AdYGBcJSwi4u3kc", "blZQNzDShRTfNg0LEdyVY0QQeEIxWzpDsQWQle5v");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
