package com.example.eduardocucharro.reediteye.util;

/**
 * Created by eduardocucharro on 26/04/17.
 */

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class DateUtils {
//    public static String formatToISO8601Date(Date date) {
//
//        SimpleDateFormat iso8601Formatter = getISO8601SimpleDateFormat();
//
//        return iso8601Formatter.format(date);
//    }
//
//    public static String formatToCommunityDate(Date date) {
//        TimeZone tz = TimeZone.getTimeZone("UTC");
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()); // Quoted "Z" to indicate UTC, no timezone offset
//        df.setTimeZone(tz);
//
//        String s = null;
//
//        try {
//            s = df.format(date);
//
//        } catch (Exception e) {
//            Logger.logException(e);
//        }
//
//        return s;
//    }
//
//    @NonNull
//    private static SimpleDateFormat getISO8601SimpleDateFormat() {
//        return new SimpleDateFormat(
//                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
//    }
//
//    public static Date parseToCommunityDate(String date) {
//
//        TimeZone tz = TimeZone.getTimeZone("UTC");
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()); // Quoted "Z" to indicate UTC, no timezone offset
//        df.setTimeZone(tz);
//
//        try {
//            Date parse = df.parse(date);
//
//            return parse;
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public static Date parseISO8601ToDate(String date) {
//        SimpleDateFormat iso8601Formatter = getISO8601SimpleDateFormat();
//
//        try {
//            Date newDate = iso8601Formatter.parse(date);
//            return newDate;
//        } catch (ParseException e) {
//            Logger.logException(e);
//        }
//
//        return null;
//    }

    public static Date parseUtc(String date) {
        return new Date(Double.valueOf(date).longValue() * 1000);
    }

    public static long calculateDaysPassed(Date recentDate, Date oldDate) {
        long difference = recentDate.getTime() - oldDate.getTime();
        long differenceDays = difference / (1000 * 60 * 60 * 24);

        return differenceDays;
    }

    public static long calculateHoursPassed(Date recentDate, Date oldDate) {
        long difference = recentDate.getTime() - oldDate.getTime();
        long differenceHours = difference / (1000 * 60 * 60);

        return differenceHours;
    }

    public static long calculateMinutesPassed(Date recentDate, Date oldDate) {
        long difference = recentDate.getTime() - oldDate.getTime();
        long differenceM = difference / (1000 * 60);

        return differenceM;
    }

    public static Calendar parseTimeToCalendar(String timeString) {
        int hour = Integer.valueOf(timeString.split(":")[0]);
        int minute = Integer.valueOf(timeString.split(":")[1]);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        return calendar;
    }
}
