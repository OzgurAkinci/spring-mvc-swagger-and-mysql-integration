package com.app.util;


import java.util.Arrays;

public final class AppUtils {
    public static StringBuilder getExceptionTraceLog(Exception exception, String uniqueMessage) {
        StringBuilder msg = new StringBuilder();
        msg.append(uniqueMessage);
        msg.append("Type : ");
        msg.append(exception.getClass().getName());
        msg.append(", Message : " );
        msg.append(exception.getMessage());
        msg.append("\n");
        msg.append(Arrays.toString(exception.getStackTrace())).append("\n");

        Throwable cause = exception.getCause();
        while (cause != null) {
            msg.append(" , Cause Message: ").append(cause).append("\n");
            msg.append(" , Cause Stack Trace: ").append(Arrays.toString(cause.getStackTrace())).append("\n");
            cause = cause.getCause();
        }
        return msg;
    }
}
