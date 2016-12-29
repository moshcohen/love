package com.example.user.love;
import java.util.*;

public class Peaolot
{
    public static char[] HordetSopiot (char[]code)
    {
        String word="";
        char[]bliSofiot=new char[code.length];
        for(int i=0;i<code.length;i++)
        {
            for(int j=0;j<28;j++)
            {
                if(code[i]==AlfBit(j))
                {
                    if(j==10||j==13||j==15||j==19||j==21)
                    {
                        word+=Sofiot(j);
                    }
                    else
                    {
                        word+=code[i];
                    }
                }


            }
            if(code[i]==' ')
            {
                word+=" ";
            }
        }
        bliSofiot=MilaToAot(word);
        return bliSofiot;
    }
    public static char Sofiot(int i)
    {
        Map<Integer, Character>sofiot=new HashMap<Integer, Character>();
        sofiot.put(19,'פ');
        sofiot.put(10,'כ');
        sofiot.put(13,'מ');
        sofiot.put(15,'נ');
        sofiot.put(21,'צ');

        char c=sofiot.get(i);
        return c;
    }

    public static char AlfBit(int i)
    {
        char[]alfBit= new char[28];
        for(int j=0;j<28;j++){
            alfBit[i]=((char)('א'+i));
        }
        return alfBit[i];

    }
    public static char Numbers(int i)
    {
        char[]num=new char[10];
        num[i]=(char)i;
        return num[i];
    }
    public static char ABCD(int i)
    {
        char[]abcd=new char[27];
        abcd[i]=(char)('a'+i);
        abcd[26]=' ';
        return abcd[i];
    }
    public static char[] MilaToAot(String word)
    {
        char[]code =new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
            code[i]=word.charAt(i);
            //System.out.println(word.charAt(3));
        }
        return code;

    }

}
