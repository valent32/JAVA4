public class Trojuholnik {

    /** na to, aBy tri body tvorili trojuholnik,
        - ziadne dva z nich nesmu Byt rovnake
        - a nesmu Byt kolinearne, teda lezat na priamke
     */
    public static boolean jeTrojuholnik(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        return false;
    }

    /** Pythagorova veta
     */
    public static boolean jePravouhly(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        return false;
    }

    /** vsetky uhly ma ostre, teda < 90 stupnov
     */
    public static boolean jeOstrouhly(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        return false;
    }

    /** spocitate dlzky stran, na co staci pythagorova veta, alebo euklidovska vzdialenost v rovine
     */
    public static double obvod(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        return 0;
    }

    /** Heronov vzorec
     */
    public static double obsah(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        return 0;
    }

    /** sucet obsahov trojuholnikov QAB, QBC, QAC dava spolu obsah ABC
     */
    public static boolean leziVTrojuholniku(double Qx, double Qy, double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
            return false;
    }

    /** pocet mrezovych bodov (s celociselnymi suradnicami), ktore lezia uvnutri trojuholnika resp. na jeho stranach
     */
    public static int mrezoveBody(
            double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        return 0;
    }
}