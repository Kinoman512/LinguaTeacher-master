package org.ling.videolib;

import android.app.Application;

/**
 * Created by User on 02.02.2017.
 */

public class VideoLib {

    static Application app;

    public static  Application getApp(){
        return app;
    }

    public static void initLib(Application ap){
        app = ap;
    }

}
