package geometrie;

public class Main
{

    public static void main(String[] args)
    {
        Punkt p1 = new Punkt(5, 10);
        Punkt p2 = new Punkt(10, 20);
        Gerade g1 = new Gerade(new Punkt(-5, 0), new Punkt(20, 20));
        Gerade g2 = new Gerade(new Punkt(5, 5), new Punkt(15, 15));
        Rechteck r1 = new Rechteck(new Punkt(10, 10), 10, 10);
        Rechteck r2 = new Rechteck(new Punkt(10, -10), 10, 5);
        Kreis k1 = new Kreis(new Punkt(1, -1), 12);
        Kreis k2 = new Kreis(new Punkt(-1, 1));
        Quader q1 = new Quader(r1, 5);
        Quader q2 = new Quader(r2, 10);
        Zylinder z1 = new Zylinder(k1, 1);
        System.out.println("Abstand p1 und p2: " + p1.abstand(p2));
        System.out.println("Start g1: (" + g1.getStartPos().getXKoordinate() + "," + g1.getStartPos().getYKoordinate() + ")" + " End g1: (" + g1.getEndPos().getXKoordinate() + "," + g1.getEndPos().getYKoordinate() + ")");
        System.out.println("Start g2: (" + g2.getStartPos().getYKoordinate() + "," + g2.getStartPos().getYKoordinate() + ")" + " End g2: (" + g2.getEndPos().getXKoordinate() + "," + g2.getEndPos().getYKoordinate() + ")");
        System.out.println("Gerade ist identisch: " + g1.equals(g2));
        System.out.println("Gerade 1 Länge: " + g1.laenge());
        System.out.println("Gerade 2 Länge: " + g2.laenge());
        System.out.println("Gerade 1 ist länger als Gerade 2: " + g1.istLaengerAls(g2));
        System.out.println("X-Koordinate p1: " + p1.getXKoordinate());
        System.out.println("Y-Koordinate p1: " + p1.getYKoordinate());
        System.out.println("p1 ist gleich p2: " + p1.equals(p2));
        System.out.println("Fläche r1: " + r1.flaeche());
        System.out.println("Fläche r2: " + r2.flaeche());
        System.out.println("Umfang r1: " + r1.umfang());
        System.out.println("Umfang r2: " + r2.umfang());
        System.out.println("Diagpnale r1: " + r1.diagonalenLaenge());
        System.out.println("Diagonale r2: " + r2.diagonalenLaenge());
        System.out.println("Fläche r1 ist kleiner als r2: " + r1.flaecheKleinerAls(r2));
        System.out.println("Umfang r1 ist kleiner als r2: " + r1.umfangKleinerAls(r2));
        System.out.println("Radius k1: " + k1.getRadius());
        System.out.println("Radius k2: " + k2.getRadius());
        System.out.println("Fläche k1: " + k1.flaeche());
        System.out.println("Fläche k2: " + k2.flaeche());
        System.out.println("Umfang k1: " + k1.umfang());
        System.out.println("Umfang k2: " + k2.umfang());
        System.out.println("Fläche r1 ist kleiner als k1 " + r1.flaecheKleinerAls(k1));
        System.out.println("Umfang r1 ist kleiner als k1: " + r1.umfangKleinerAls(k1));
        System.out.println("Quaderhöhe: " + q1.getHoehe());
        System.out.println("Grundfläche Quader: " + q1.getBoden().flaeche());
        System.out.println("Quadervolumen: " + q1.volumen());
        System.out.println("Quaderoberfläche: " + q1.oberflaeche());
        System.out.println("Quaderraumdiagonale: " + q1.laengeRaumdiagonale());
        System.out.println("Ist das Objekt ein Würfel?: " + Quader.istWuerfel(q1));
        System.out.println("Sind die 3D Figuren gleich?: " + q1.equals(q2));
        System.out.println("Zylinderhöhe: " + z1.getHoehe());
        System.out.println("Zylinderoberfläche: " + z1.oberflaeche());
        System.out.println("Zylindervolumen: " + z1.volumen());
    }

}
