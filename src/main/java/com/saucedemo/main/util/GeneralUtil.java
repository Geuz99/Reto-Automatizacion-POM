package com.saucedemo.main.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralUtil {
    private GeneralUtil(){

    }
    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralUtil.class);
    private static final String MESSAGE_WAITING = "PROGRAMA PAUSADO %s";
    private static final String MESSAGE_INFORMATION = "\n%s\n----------------------------------------------------";

    public  static void explicitWait(long duration){
        try {
            String s = formatMessageWaiting("El robot se pauso por " + (duration/1000L) + "s");
            LOGGER.info(s);
            Thread.sleep(duration);
        } catch (InterruptedException e){
            LOGGER.info(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    public static String formatMessageWaiting(String message) {
        return String.format(MESSAGE_WAITING, message);
    }

    public static String formatMessageInformation(String message){
        return String.format(MESSAGE_INFORMATION, message);
    }
}
