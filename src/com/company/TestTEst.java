package com.company;

import java.util.ArrayList;

public class TestTEst {
    public static void main(String[] args) {



        ArrayList<String> listMdaIdLocal = new ArrayList<>();
        ArrayList<String> listMdaIdLocal2 = new ArrayList<>();

        listMdaIdLocal2.add("1");
        listMdaIdLocal2.add("2");
        listMdaIdLocal2.add("3");
        listMdaIdLocal2.add("4");
        listMdaIdLocal2.add("5");
        listMdaIdLocal2.add("1");
        listMdaIdLocal2.add("2");
        listMdaIdLocal2.add("3");

        System.out.println("listMdaIdLocal2 = " + listMdaIdLocal2);
        for (String s : listMdaIdLocal2) {
            if (!listMdaIdLocal.contains(s)) {
                listMdaIdLocal.add(s);
            }

        }


        System.out.println("listMdaIdLocal1 = " + listMdaIdLocal);

    }
}
