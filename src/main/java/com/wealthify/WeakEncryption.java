import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class WeakEncryption {
    public static void main(String[] args) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("DES"); // DES is outdated
        SecretKey key = keyGen.generateKey();
        Cipher cipher = Cipher.getInstance("DES"); 
        cipher.init(Cipher.ENCRYPT_MODE, key);
        System.out.println("Encryption ready with DES (insecure)");
    }
}
