package com.example.demo_Emp_task_cal;

import java.text.Format;
import java.text.ParseException;
import java.time.DayOfWeek;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskDaysCalculation {


    public static void getDate() throws ParseException {
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date =  sdf.parse("2022/08/19");

        int day = cal.get(GregorianCalendar.DAY_OF_WEEK);
        Format f = new SimpleDateFormat("EEEE");

        int count = 0;
        cal.set(2022, 8, 19);
        String Dt_Holiday = "2022/08/23";
        String EndDate = "";
        for (int i = day; i <= (day + 5); i++) {

            //cal.set(GregorianCalendar.DAY_OF_MONTH, i);
            date = cal.getTime();
            if (i == day) {
                System.out.println("start date " + date);
            }
            String str = f.format(date);

            if (!str.equals("SATURDAY") && !str.equals("SUNDAY") && !str.equals("Sunday") && !str.equals("Saturday")) {
                if (Dt_Holiday.equals(sdf.format(date))) {
                    System.out.println("-Special Holiday " + sdf.format(date));
                }
//                System.out.println(str + "  " + sdf.format(date));
                count++;

                EndDate = sdf.format(date) + " " + str;
            } else {
                System.out.println(str + "---" + sdf.format(date));
            }

        }
        System.out.println("Task End Date will be on " + EndDate);
    }


}
