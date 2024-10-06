public class encrypt {
    public static String alphabet="abcdefghijklmnopqrstuvwxyz";
        public static String encryption(String message, String key)
        {
            String cipherText="";
            for(int i=0;i<message.length();i++)
            {
                for(int e=0;e<alphabet.length();e++)
                {
                    if(message.substring(i,i+1).equals(" "))
                    {
                        cipherText+=" ";
                        break;
                    }
                    else if((message.substring(i,i+1)).toLowerCase().equals(alphabet.substring(e,e+1)))
                    {
                        cipherText+=key.substring(e,e+1);
                        break;
                    }
                }
            }
        return cipherText;
        }
        public static String decryption(String cipherText, String key)
        {
            String decrypted="";
            for(int i=0;i<cipherText.length();i++)
            {
                for(int e=0;e<key.length();e++)
                {
                    if(cipherText.substring(i,i+1).equals(" "))
                    {
                        decrypted+=" ";
                        break;
                    }
                    else if((cipherText.substring(i,i+1)).equals(key.substring(e,e+1)))
                    {
                        decrypted+=alphabet.substring(e,e+1);
                        break;
                    }
                }
            }
            return decrypted;
        }
}
