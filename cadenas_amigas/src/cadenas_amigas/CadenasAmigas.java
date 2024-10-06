package cadenas_amigas;
import java.util.Scanner;

public class CadenasAmigas {
    public static boolean sonCadenasAmigas(String S, String T) {
       
        if (S.length() < 2 || T.length() < 2 || S.length() != T.length()) {
            return false;
        }
        int longitud = S.length();
        for (int i = 1; i < longitud; i++) {
            String u = S.substring(0, i); 
            String v = S.substring(i);
            String TGenerada = v + u;

            if (TGenerada.equals(T)) {
                return true; 
            }
        }
        return false; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera cadena S: ");
        String S = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena T: ");
        String T = scanner.nextLine();

        if (sonCadenasAmigas(S, T)) {
            System.out.println("Las cadenas son amigas.");
        } else {
            System.out.println("Las cadenas no son amigas.");
        }
        scanner.close(); 
    }
}
