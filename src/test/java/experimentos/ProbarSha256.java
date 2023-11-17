package experimentos;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ProbarSha256 {
    public static void main(String...argv) throws NoSuchAlgorithmException {
        String original = "Héctor Nuñez Ürzañegüi";
        String salt = "";
        String res = toHexString(getSHA256(original, salt));
        System.out.println(res);
    }
    
    // MAC:   echo -n "Héctor Nuñez Ürzañegüi" | shasum -a 256
    // LINUX: echo -n "Héctor Nuñez Ürzañegüi" | sha256sum
    
    private static byte[] getSHA256(String source, String salt) throws NoSuchAlgorithmException {
        String input = source + salt;
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    private static String toHexString(byte[] hash) {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);

        // get hexadecimal format
        String hexa = number.toString(16);

        // Prepare for padding
        StringBuilder hexString = new StringBuilder(hexa);

        // Pad with leading zeros
        while (hexString.length() < 32) {
            hexString.insert(0, '0');
        }

        // Show me the result, baby
        return hexString.toString();
    }

}
