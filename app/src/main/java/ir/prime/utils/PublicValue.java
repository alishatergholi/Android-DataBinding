package ir.prime.utils;


import android.content.Context;

import ir.prime.BuildConfig;


/**
 * Created by alishatergholi on 10/16/17.
 */
public class PublicValue {

    public static String Url_server_debug = "https://primevideo.ir/api/";

    public static String Url_server_release = "https://primevideo.ir/api/";

    public static final String DIRECTORY_NAME = "/Prime";

    public static final String EXTENSION_JPG = ".jpg";

    public static final String EXTENSION_JPEG = ".jpeg";

    public static final String EXTENSION_PNG = ".png";

    public static final String DIRECTORY_NAME_IMAGE = DIRECTORY_NAME + "/Image";

    public static String Url_terms = "http://navaz.ir/auth/terms";

    public static String Url_privacy = "http://navaz.ir/auth/privacy";

    public final static int STATUS_SUCCESS      = 1;
    public final static int STATUS_FAILED       = 0;
    public final static int UPDATE_AVATAR       = 10;
    public final static int RESAULT_FULL_PLAYER = 212;
    public final static int RESAULT_COMMENT     = 213;
    public final static String EXTRA_DETAILS    = "details";

    private static String IMEI = "";

    public static String getIMEI(Context context) {
        if (PublicFunction.StringIsEmptyOrNull(IMEI)) {
            IMEI = PublicFunction.getIMEI(context);
        }
        return IMEI;
    }

    public static String getBaseUrl() {
        if (BuildConfig.DEBUG) {
            return Url_server_debug;
        } else {
            return Url_server_release;
        }
    }
}
