import java.util.*;
public class encryption {
    private static String encrypted="";
    private static ArrayList<String> newList=new ArrayList<String>();
    public static String encrypt(ArrayList<String> list)
    {
        for(int i=0;i<list.size();i++)
        {
            String temp="";
            for(int e=list.get(i).length()-1;e>=0;e--)
            {
                temp+=(list.get(i)).charAt(e);
            }
            newList.add(temp);
        }
        for(int e=0;e<newList.size();e++)
        {
            encrypted+= newList.get(e);
        }
        // for(int r=newList.size();r>0;r--)
        // {
        //     encrypted+=newList.get(r-1);
        // }
        return encrypted;
    }
    public static String decrypt(String cipherText, int key)
    {
        ArrayList<String> decipher=new ArrayList<String>();
        ArrayList<String>decipher2=new ArrayList<String>();
        int num= cipherText.length()/key;
        for(int i=0;i<key;i++)
        {
            decipher.add(cipherText.substring(i*num,(i+1)*num));
        }
        if((cipherText.length() % key)!=0)
        {
            decipher.add(cipherText.substring((cipherText.length()-(cipherText.length()%key)),cipherText.length()));
        }
        for(int i=0;i<decipher.size();i++)
        {
            String temp="";
            for(int e=decipher.get(i).length()-1;e>=0;e--)
            {
                temp+=(decipher.get(i)).charAt(e);
            }
            decipher2.add(temp);
        }
        String message="";
        for(String parts: decipher2)
        {
            message+=parts;
        }
        return message;
    }
}
