import java.util.*;
public class cipher
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you want a random key? Y or N");
        String choice=input.nextLine();
        String key="";
        if(choice.equals("Y"))
        {
            System.out.println("This is the key");
            key=generateKey.createKey();
        }
        else
        {
            System.out.println("Enter a key by typing the 26 letters in caps and random order");
            key=input.nextLine();
        }
        System.out.println(key);
        System.out.println("What is the orginal message?");
        String message= input.nextLine();
        System.out.println(message);
        String cipherText= encrypt.encryption(message, key);
        System.out.println(cipherText);
        
        System.out.println("Would you like to decrypt this? Y or N");
        String choice2 =input.nextLine();
        if(choice2.equals("Y"))
        {
            System.out.println(encrypt.decryption(cipherText,key));
        }
        
    }
}
