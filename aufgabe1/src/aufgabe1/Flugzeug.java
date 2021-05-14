package aufgabe1;

public class Flugzeug
{

    // maximales Startgewicht des Flugzeugs (kg)
    private double maxGewicht;

    // Leergewicht des Flugzeugs (kg)
    private double leerGewicht;

    // Gewicht der Ladung (kg)
    private double ladungGewicht;

    // Reisegeschwindigkeit des Flugzeugs (km/h)
    private double reiseGeschw;

    // Flugstunden laut Flugstundenzähler (h)
    private double flugStunden;

    // Kerosinverbrauch pro Flugstunde (l/h)
    private double verbrauch;

    // Gesamtkapazität der Tanks (l)
    private double tankKapazitaet;

    // in den Tanks vorhandenes Kerosin (l)
    private double kerosinVorrat;

    public Flugzeug(double maxGewicht, double leerGewicht, double ladungGewicht, double reiseGeschw, double flugStunden, double verbrauch, double tankKapazitaet, double kerosinVorrat)
    {
        this.maxGewicht = maxGewicht;
        this.leerGewicht = leerGewicht;
        this.ladungGewicht = ladungGewicht;
        this.reiseGeschw = reiseGeschw;
        this.flugStunden = flugStunden;
        this.verbrauch = verbrauch;
        this.tankKapazitaet = tankKapazitaet;
        this.kerosinVorrat = kerosinVorrat;
        System.out.println(tankKapazitaet);
        if (kerosinVorrat > this.tankKapazitaet)
        {
            System.out.println("if");
            this.kerosinVorrat = tankKapazitaet;
        }
        else
        {
            System.out.println("else");
            this.kerosinVorrat = kerosinVorrat;
        }
    }

    public double getMaxGewicht()
    {
        return maxGewicht;
    };

    public double getLeerGewicht()
    {
        return leerGewicht;
    };

    public double getLadungGewicht()
    {
        return ladungGewicht;
    };

    public double getReiseGeschw()
    {
        return reiseGeschw;
    };

    public double getFlugStunden()
    {
        return flugStunden;
    };

    public double getVerbrauch()
    {
        return verbrauch;
    };

    public double getTankKapazitaet()
    {
        return tankKapazitaet;
    };

    public double getKerosinVorrat()
    {
        return kerosinVorrat;
    };

    public double getGesamtGewicht()
    {
        return (leerGewicht + ladungGewicht + (kerosinVorrat * 0.8));
    }

    public double getReichweite()
    {
        return ((kerosinVorrat / verbrauch) * reiseGeschw);
    }

    public boolean fliegen(double km)
    {
        if (km > 0 && km <= this.getReichweite() && this.getGesamtGewicht() <= maxGewicht)
        {

            flugStunden += km / reiseGeschw;
            kerosinVorrat -= (km / reiseGeschw) * verbrauch;
            return true;
        }
        else
        {

            return false;
        }

    }

    public void tanken(double liter)
    {
        if (kerosinVorrat + liter <= tankKapazitaet && kerosinVorrat + liter >= 0)
        {
            kerosinVorrat += liter;
        }
        else if (kerosinVorrat + liter < 0)
        {
            kerosinVorrat = 0;
        }
        else
        {
            kerosinVorrat = tankKapazitaet;
        }
    }

    public boolean laden(double kg)
    {
        if (kg + this.getGesamtGewicht() <= maxGewicht && kg + ladungGewicht >= 0)
        {
            ladungGewicht += kg;
            return true;
        }
        else if (kg + ladungGewicht < 0)
        {
            ladungGewicht = 0;
            return true;
        }
        else
        {
            return false;
        }
    }

    public void info()
    {
        System.out.println("Flugstunden: " + getFlugStunden() + "\n" + "Tankinhalt: " + getKerosinVorrat() + "\n" + "Gesamtgewicht: " + getGesamtGewicht());
    }

    public static void main(String[] args)
    {

        Flugzeug albatros = new Flugzeug(70000, 35000, 10000, 800, 500, 2500, 25000, 30000);

        System.out.println(albatros.getKerosinVorrat());
        albatros.laden(1500);
        albatros.fliegen(3000);
        albatros.tanken(10000);
        albatros.fliegen(3000);

    }
}
