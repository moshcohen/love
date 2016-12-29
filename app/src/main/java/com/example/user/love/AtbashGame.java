package com.example.user.love;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by USER on 29/12/2016.
 */
public class AtbashGame implements Game {
    @Override
    public String StartGame() {
       return null;
    }

    public String StartGame(String word) {

        char[]code;
        code=Peaolot.MilaToAot(word);
        code=Peaolot.HordetSopiot(code);
        String AtBa="";
        for(int i=0;i<code.length;i++)
        {
            for(int j=0;j<27;j++)
            {

                if(code[i]==Peaolot.AlfBit(j))
                {
                    AtBa+=atbsh(j);
                }
            }
        }
        return AtBa;
    }

    public static char atbsh(int j){
        Map<Integer,Character> Atbash=new HashMap<Integer,Character>();
        Atbash.put(0,'ת');
        Atbash.put(1,'ש');
        Atbash.put(2,'ר');
        Atbash.put(3,'ק');
        Atbash.put(4,'צ');
        Atbash.put(5,'פ');
        Atbash.put(6,'ע');
        Atbash.put(7,'ס');
        Atbash.put(8,'נ');
        Atbash.put(9,'מ');
        Atbash.put(11,'ל');
        Atbash.put(12,'כ');
        Atbash.put(14,'י');
        Atbash.put(16,'ט');
        Atbash.put(17,'ח');
        Atbash.put(18,'ז');
        Atbash.put(20,'ו');
        Atbash.put(22,'ה');
        Atbash.put(23,'ד');
        Atbash.put(24,'ג');
        Atbash.put(25,'ב');
        Atbash.put(26,'א');
        Atbash.put(27,' ');


        char c=Atbash.get(j);
        return c;
    }


}
