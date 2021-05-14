package geometrie;

public class Rechteck extends Figur2D
{
    private int breite, laenge;

    public Rechteck(Punkt bezug, int b, int l)
    {
        super(bezug);
        try
        {

            if (b < 1 || l < 1)
            {
                breite = 1;
                laenge = 1;
                throw new IllegalArgumentException();
            }
            else
            {
                breite = b;
                laenge = l;
            }
        }
        catch (Exception IllegalArgumentException)
        {
            System.out.println("Länge bzw. Breite des Rechtecks müssen >= 1 sein");
        }

    }

    public int getBreite()
    {
        return breite;
    }

    public void setBreite(int breite)
    {
        try
        {

            if (breite < 1)
            {
                throw new IllegalArgumentException();
            }
            else
            {
                this.breite = breite;
            }
        }
        catch (Exception IllegalArgumentException)
        {
            System.out.println("Länge bzw. Breite des Rechtecks müssen >= 1 sein");
        }

    }

    public int getLaenge()
    {
        return laenge;
    }

    public void setLaenge(int laenge)
    {
        try
        {

            if (laenge < 1)
            {
                throw new IllegalArgumentException();
            }
            else
            {
                this.laenge = laenge;
            }
        }
        catch (Exception IllegalArgumentException)
        {
            System.out.println("Länge bzw. Breite des Rechtecks müssen >= 1 sein");
        }

    }

    @Override
    public double umfang()
    {
        return (2 * breite) + (2 * laenge);
    }

    @Override
    public double flaeche()
    {
        return breite * laenge;
    }

    public double diagonalenLaenge()
    {
        return Math.sqrt(Math.pow(breite, 2) + Math.pow(laenge, 2));
    }

    public boolean flaecheKleinerAls(Figur2D f)
    {
        if (flaeche() < f.flaeche())
        {
            return true;
        }
        return false;
    }

    public boolean umfangKleinerAls(Figur2D f)
    {
        if (umfang() < f.umfang())
        {
            return true;
        }

        return false;

    }

}
