package com.example.instagramclone;

import android.app.Application;

public class GlobalApplication extends Application {
    private static int vpCurrentPosition;

    public static int getVpCurrentPosition() {
        return vpCurrentPosition;
    }

    public static void setVpCurrentPosition(int vpCurrentPosition) {
        GlobalApplication.vpCurrentPosition = vpCurrentPosition;
    }
}
