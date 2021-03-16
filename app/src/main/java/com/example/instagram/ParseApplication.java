package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Mz6iJDZkp5lHTLnMUbs2RYZm75gg4FVW6vJMsTvS")
                .clientKey("2XxqCHTmtUlqHk0XbpfNxVSEtZL3PmWBnCLNNNQ2")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
