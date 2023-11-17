package experimentos;

import java.util.Base64;

public class ProbarBase64 {
    
    /*
     * I. Codifica (en  base  64) una  cadena y luego la
     * descodifica para mostrar la cadena original. 
     * 
     * II. El resultado de la codificación garantiza que
     * nunca  tendrá  caracteres adicionales a estos 64:
     * 
     * abcdefghijklmnopqustuvwxyzABCEDFGHIJKLMNOPQRSTUVWXYZ01234567890=
     * 
     * III. Sabemos  que  sólo requerimos de 6 bits para
     * representar  a  cualquiera  de los 64  caracteres
     * anteriores, ya que 2^6 = 64
     * 
     * IV. Por  otro lado  sabemos que hay 256 caracteres 
     * en total que pueden aparecer en cualquier archivo
     * ya sea binario o de texto y que requerimos 8 bits
     * para representar a cada uno de ellos.
     * 
     * V. 4 "caracteres" de 6 bits (como los de II) caben 
     * en 3 caracteres de 8 bits porque 6x4 = 8x3 = 24. 
     * 
     * De lo anterior, obviamente, un archivo binario que 
     * usa 24000 bits (igual a 3000 bytes) va a ser codi-
     * ficado  en 4000 bloques de 6 bits (o dicho de otra 
     * manera, en 4000 "letras" del  conjunto que se des-
     * cribió en II.
     * 
     * 3000 originales en 4000 de base 64 (crecen un poco)
     */
    public static void main(String...argv) {
        String original = "MarinaInesGilPeña...éÜñgüi";
        String encoded = encode(original);
        System.out.println(encoded); // TWFyaW5hSW5lc0dpbFBlw7FhLi4uw6nDnMOxZ8O8aQ==
        String decoded = decode(encoded);
        System.out.println(decoded); // MarinaInesGilPeña...éÜñgüi
    }
    
    
    private static String encode(String s) {
        return new String(Base64.getEncoder().encode(s.getBytes()));
    }
    private static String decode(String s) {
        return new String(Base64.getDecoder().decode(s));
    }
}
