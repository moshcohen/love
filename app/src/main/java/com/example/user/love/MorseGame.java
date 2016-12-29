package com.example.user.love;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by USER on 29/12/2016.
 */
public class MorseGame implements Game {

    static Scanner in =new Scanner(System.in);
    static Random rnd=new Random();
    @Override
    public String StartGame() {
        String CodeMorse="";
        System.out.println("בחר בבקשה את השפה ממנה אתה רוצה לתרגם");
        System.out.println("לעברית הקש 1");
        System.out.println("For English Press 2");
        while(!in.hasNextInt())
        {
            if(!in.hasNextInt())
            {
                System.out.println("הכנסת תו שגוי אנא נסה שנית");
                System.out.println("The note you wrote is wrong try again");
            }
            in.next();
        }
        int leng=in.nextInt();
        if(leng==1)
        {
            CodeMorse=HebrowMorse();
        }
        if(leng==2)
        {
            CodeMorse=MorseEnglish();
        }
        CodeMorse=CodeMorse+"|";

        return CodeMorse;
    }

    public static String EM(int i)
    {
        String[]eMorse=new String[27];

        eMorse[0]=".-";                eMorse[11]=".-..";
        eMorse[1]="-...";              eMorse[12]="--";
        eMorse[2]="-.-.";              eMorse[13]="-.";
        eMorse[3]="-..";               eMorse[14]="---";
        eMorse[4]=".";                 eMorse[15]=".--.";
        eMorse[5]="..-.";              eMorse[16]="--.-";
        eMorse[6]="--.";               eMorse[17]=".-.";
        eMorse[7]="....";              eMorse[18]="...";
        eMorse[8]="..";                eMorse[19]="-";
        eMorse[9]=".---";              eMorse[20]="..-";
        eMorse[10]="-.-";              eMorse[21]="...-";
        eMorse[22]=".--";              eMorse[26]="&&";
        eMorse[23]="-..-";
        eMorse[24]="-.--";
        eMorse[25]="--..";

        return eMorse[i];
    }
    public static String NumMorse(int i)
    {
        String[] num=new String[10];
        num[0]="-----";        num[5]=".....";
        num[1]=".----";        num[6]="-....";
        num[2]="..---";	        num[7]="--...";
        num[3]="...--";        num[8]="---..";
        num[4]="....-";        num[9]="----.";
        return num[i];
    }

    public static String HM(int i)
    {
        String[] hMorse=new String[28];
        hMorse[0]="-.";                 hMorse[13]="--";
        hMorse[1]="...-";               hMorse[16]=".-";
        hMorse[2]="--.";                hMorse[17]=".-.-";
        hMorse[3]="..-";                hMorse[18] ="---.";
        hMorse[4]="---";                hMorse[19]=".--.";
        hMorse[5]=".";                  hMorse[21]="--.";
        hMorse[6]="..--";               hMorse[23]="-.--";
        hMorse[7]="....";               hMorse[24]=".-.";
        hMorse[8]="-..";                hMorse[25] ="...";
        hMorse[9]="..";                 hMorse[26]="-";
        hMorse[10]="-.-";               hMorse[14]="--";
        hMorse[11]="-.-";               hMorse[15]=".-";
        hMorse[12]="..-.";              hMorse[20]=".--.";
        hMorse[22]="--.";               hMorse[27]="&&";

        return hMorse[i];
    }

    public static String MorseEnglish()
    {
        String CodeMorse="";
        System.out.println("english morse");
        String bi=in.nextLine();
        System.out.println("put the word");
        String word=in.nextLine();
        char []code;
        code=Peaolot.MilaToAot(word);
        code=Peaolot.HordetSopiot(code);
        for(int i=0;i<code.length;i++)
        {
            for(int j=0;j<26;j++)
            {
                if(code[i]==Peaolot.ABCD(j))
                {
                    CodeMorse+="|"+EM(j);
                }
            }
            for(int j=0;j<10;j++)
            {
                if(code[i]==Peaolot.Numbers(j))
                {
                    CodeMorse+="|"+NumMorse(j);
                }
            }
        }
        return CodeMorse;
    }
    public static String HebrowMorse()
    {
        String CodeMorse="";
        System.out.println("מורס עברית");
        String ni=in.nextLine();
        System.out.println("הכנס את המילה");
        String word=in.nextLine();

        int y1=word.length();
        char[]code =new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
            code[i]=word.charAt(y1-i-1);
        }
        for(int i=0;i<code.length;i++)
        {
            for(int j=0;j<27;j++)
            {
                if(code[i]==Peaolot.AlfBit(j))
                {
                    CodeMorse+="|"+HM(j);
                }
            }
            for(int j=0;j<10;j++)
            {
                if(code[i]==Peaolot.Numbers(j))
                {
                    CodeMorse+="|"+NumMorse(j);
                }
            }
        }
        return CodeMorse;
    }
}
