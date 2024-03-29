package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThreaad {

    public static void main(String[] args) {

        List<String> test = new ArrayList<>();

        test.add("CS02063865_동네변호사-조들호-16-03-28-월---KBS-월화드라마_1_[S181218-177]");
        test.add("CS02063865_동네변호사-조들호-16-03-29-화---KBS-월화드라마_2_[S181218-179]");
        test.add("CS02063865_동네변호사-조들호-16-04-04-월---KBS-월화드라마_3_[S181218-180]");
        test.add("CS02063865_동네변호사-조들호-16-04-05-화---KBS-월화드라마_4_[S181218-182]");
        test.add("CS02063865_동네변호사-조들호-16-04-11-월---KBS-월화드라마_5_[S181218-183]");
        test.add("CS02063865_동네변호사-조들호-16-04-12-화---KBS-월화드라마_6_[S181218-186]");
        test.add("CS02063865_동네변호사-조들호-16-04-18-월---KBS-월화드라마_7_[S181218-188]");
        test.add("CS02063865_동네변호사-조들호-16-04-19-화---KBS-월화드라마_8_[S181218-189]");
        test.add("CS02063865_동네변호사-조들호-16-04-25-월---KBS-월화드라마_9_[S181218-190]");
        test.add("CS02063865_동네변호사-조들호-16-04-26-화---KBS-월화드라마_10_[S181218-191]");
        test.add("CS02063865_동네변호사-조들호-16-05-02-월---KBS-월화드라마_11_[S181218-192]");
        test.add("CS02063865_동네변호사-조들호-16-05-03-화---KBS-월화드라마_12_[S181218-193]");
        test.add("CS02063865_동네변호사-조들호-16-05-09-월---KBS-월화드라마_13_[S181218-194]");
        test.add("CS02063865_동네변호사-조들호-16-05-10-화---KBS-월화드라마_14_[S181218-195]");
        test.add("CS02063865_동네변호사-조들호-16-05-23-월---KBS-월화드라마_17_[S181218-199]");
        test.add("CS02063865_동네변호사-조들호-16-05-24-화---KBS-월화드라마_18_[S181218-200]");
        test.add("CS02063865_동네변호사-조들호-16-05-30-월---KBS-월화드라마_19_[S181218-201]");
        test.add("CS02063865_동네변호사-조들호-16-05-31-화---KBS-월화드라마_20_[S181218-202]");



        test.add("CS02063865_동네변호사-조들호-16-03-28-월---KBS-월화드라마_1_[S181218-177]");
        test.add("CS02063865_동네변호사-조들호-16-03-29-화---KBS-월화드라마_2_[S181218-179]");
        test.add("CS02063865_동네변호사-조들호-16-04-04-월---KBS-월화드라마_3_[S181218-180]");
        test.add("CS02063865_동네변호사-조들호-16-04-05-화---KBS-월화드라마_4_[S181218-182]");
        test.add("CS02063865_동네변호사-조들호-16-04-11-월---KBS-월화드라마_5_[S181218-183]");
        test.add("CS02063865_동네변호사-조들호-16-04-12-화---KBS-월화드라마_6_[S181218-186]");
        test.add("CS02063865_동네변호사-조들호-16-04-18-월---KBS-월화드라마_7_[S181218-188]");
        test.add("CS02063865_동네변호사-조들호-16-04-19-화---KBS-월화드라마_8_[S181218-189]");
        test.add("CS02063865_동네변호사-조들호-16-04-25-월---KBS-월화드라마_9_[S181218-190]");
        test.add("CS02063865_동네변호사-조들호-16-04-26-화---KBS-월화드라마_10_[S181218-191]");
        test.add("CS02063865_동네변호사-조들호-16-05-02-월---KBS-월화드라마_11_[S181218-192]");
        test.add("CS02063865_동네변호사-조들호-16-05-03-화---KBS-월화드라마_12_[S181218-193]");
        test.add("CS02063865_동네변호사-조들호-16-05-09-월---KBS-월화드라마_13_[S181218-194]");
        test.add("CS02063865_동네변호사-조들호-16-05-10-화---KBS-월화드라마_14_[S181218-195]");
        test.add("CS02063865_동네변호사-조들호-16-05-23-월---KBS-월화드라마_17_[S181218-199]");
        test.add("CS02063865_동네변호사-조들호-16-05-24-화---KBS-월화드라마_18_[S181218-200]");
        test.add("CS02063865_동네변호사-조들호-16-05-30-월---KBS-월화드라마_19_[S181218-201]");
        test.add("CS02063865_동네변호사-조들호-16-05-31-화---KBS-월화드라마_20_[S181218-202]");

        String yyyyMMdd = new SimpleDateFormat("yyyyMMdd").format(new Date());
        System.out.println("test = " + test);
        System.out.println("yyyyMMdd = " + yyyyMMdd);




    }


}
