import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("How many divisions would you like?");
        int divisions=input.nextInt();
        input.nextLine();
        System.out.println("What is the original message?");
        String originalMessage=input.nextLine();
        ArrayList<String> list=new ArrayList<String>();
        int num= originalMessage.length()/divisions;
        
        for(int i=0;i<divisions;i++)
        {
            list.add(originalMessage.substring(i*num,(i+1)*num));
        }
        if((originalMessage.length() % divisions)!=0)
        {
            list.add(originalMessage.substring((originalMessage.length()-(originalMessage.length()%divisions)),originalMessage.length()));
        }
        // for(String section: list)
        // {
        //     System.out.println(section);
        // }
        String cipherText=encryption.encrypt(list);
        System.out.println(cipherText);
        System.out.println("Do you want to decrypt? Y or N");
        String choice= input.nextLine();
        System.out.println("Enter the number of divisions:");
        int userKey=input.nextInt();
        if(choice.equals("Y"))
        {
            System.out.println(encryption.decrypt(cipherText,userKey));
        }
        
        
    }
}
