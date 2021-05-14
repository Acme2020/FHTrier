package aufgabe;

import geometrie.Kreis;
import geometrie.Punkt;
import geometrie.Quader;
import geometrie.Rechteck;
import geometrie.Zylinder;

public class AufgabePool
{
    private Quader q; // r

    private Zylinder z1; // k1

    private Zylinder z2; // k2

    private Zylinder z3; // k3

    public AufgabePool()
    {
        Punkt bezug = new Punkt(0, 390);
        Punkt bezug1 = new Punkt(74, 390);
        Punkt bezug2 = new Punkt(74, 390);
        Rechteck r = new Rechteck(bezug1, 316, 875);
        bezug2.verschieben(r.getLaenge() - (r.getBreite() / 2), 0);
        Kreis k1 = new Kreis(bezug2, (r.getBreite() / 2));
        Kreis k2 = new Kreis(bezug, ((r.getBreite() - 20) / 2) / 2);
        Punkt bezug3 = new Punkt(0, 390);
        bezug3.verschieben(0, -(r.getBreite() - 2 * k2.getRadius()));
        Kreis k3 = new Kreis(bezug3, ((r.getBreite() - 20) / 2) / 2);
        q = new Quader(r, 2);
        z1 = new Zylinder(k1, 2);
        z2 = new Zylinder(k2, 2);
        z3 = new Zylinder(k3, 2);
    }

    public double poolVolumen()
    {
        return (z2.volumen() / 2) + (z3.volumen() / 2) + (z1.volumen() / 2) + q.volumen();
    }

    public double poolUmfang()
    {
        return ((z2.getBoden().umfang() / 2) + (z3.getBoden().umfang() / 2) + (z1.getBoden().umfang() / 2) + q.getBoden().umfang()) - (2 * z2.getBoden().getRadius() + 2 * z3.getBoden().getRadius() + 2 * z1.getBoden().getRadius());
    }

    public double poolInnererMantel()
    {
        return poolWasserOberflaeche() + poolUmfang() * q.getHoehe();
    }

    public double poolWasserOberflaeche()
    {
        return z1.getBoden().flaeche() / 2 + z2.getBoden().flaeche() / 2 + z3.getBoden().flaeche() / 2 + q.getBoden().flaeche();
    }

    public double kostenZaun(double preisProStueck)
    {
        return Math.ceil(poolUmfang() / 5) * preisProStueck;
    }

    public Quader getQ()
    {
        return q;
    }

    public Zylinder getZ1()
    {
        return z1;
    }

    public Zylinder getZ2()
    {
        return z2;
    }

    public Zylinder getZ3()
    {
        return z3;
    }

    public static void main(String[] args)
    {
        AufgabePool aufgabe = new AufgabePool();
        System.out.println("Quardervolumen q: " + aufgabe.q.volumen());
        System.out.println("Zylindervolumen z1: " + aufgabe.z1.volumen());
        System.out.println("Zylindervolumen z2: " + aufgabe.z2.volumen());
        System.out.println("Zylindervolumen z3: " + aufgabe.z3.volumen());
        System.out.println("Pool Volumen:: " + aufgabe.poolVolumen());
        System.out.println("Pool Umfang:: " + aufgabe.poolUmfang());
        System.out.println("Pool Mantel:: " + aufgabe.poolInnererMantel());
        System.out.println("Pool Wasseroberfläche:: " + aufgabe.poolWasserOberflaeche());
        System.out.println("Kosten Zaun: " + aufgabe.kostenZaun(1.75));

    }

}