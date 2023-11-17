package experimentos;

public class ProbarHexadecimal {
    
    public static void main(String[] args) {
        new ProbarHexadecimal();
    }
    
    public ProbarHexadecimal() {
        System.out.println(convierteDecimalToHexadecimal(1000));
        System.out.println(convierteDecimalToBinario(1000));
        System.out.println(convierteDecimalToOctal(1000));
    }
    
    // OJO: Aqui NO estoy usando funciones especiales de ninguna biblioteca de java
    private String convierteDecimalToZcimal(int n, String alphabet) {
        return (n<1)?"":convierteDecimalToZcimal(n/alphabet.length(), alphabet) + alphabet.charAt(n%alphabet.length());
    }
    
    public String convierteDecimalToHexadecimal(int n) {
        return convierteDecimalToZcimal(n, "0123456789ABCDEF");
    }
    
    public String convierteDecimalToBinario(int n) {
        return convierteDecimalToZcimal(n, "01");
    }
    
    public String convierteDecimalToOctal(int n) {
        return convierteDecimalToZcimal(n, "012345678");
    }
}
