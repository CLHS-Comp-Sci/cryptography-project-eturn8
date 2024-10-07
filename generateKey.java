import java.util.*;
public class generateKey {
    public static String alpha="abcdefghijklmnopqrstuvwxyz";
    public static String keyMade="";
    public static String createKey()
    {
        
        while(alpha.length()>0)
        {
            int index= (int) (Math.random()*alpha.length());
            String letter= alpha.substring(index,index+1);
            alpha=alpha.substring(0,index)+alpha.substring(index+1,alpha.length());
            keyMade+=letter.toUpperCase();
        }
        return keyMade;
    }
}
