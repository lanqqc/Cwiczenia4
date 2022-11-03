import java.util.Scanner;
class RectangleAreaNasennik {
    static float aPN;
    static float bPN;
    static void pobieranieDanychNasennik() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input height: ");
        aPN = in.nextFloat();
        System.out.print("Input width: ");
        bPN = in.nextFloat();
    }
    static float obliczaniePolaNasennik(float a, float b) {
        return a * b;
    }
    static void wyswietleniaPolaNasennik(float a, float b) {
        System.out.println(obliczaniePolaNasennik(a, b));
    }
}
public class RectangleArea {
    public static void main(String[] args) {
        RectangleAreaNasennik rectangle = new RectangleAreaNasennik();
        rectangle.pobieranieDanychNasennik();
        rectangle.obliczaniePolaNasennik(rectangle.aPN, rectangle.bPN);
        rectangle.wyswietleniaPolaNasennik(rectangle.aPN, rectangle.bPN);
    }
}
