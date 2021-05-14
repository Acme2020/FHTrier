package geometrie;

public class Quader extends Figur3D
{
    private int hoehe;

    public Quader(Rechteck r, int hoehe)
    {
        super(r);
        try
        {
            if (hoehe < 1)
            {
                this.hoehe = 1;
                throw new IllegalArgumentException();
            }
            else
            {
                this.hoehe = hoehe;
            }
        }
        catch (Exception IllegalArgumentException)
        {
            System.out.println("Höhe muss >= 1 sein");
        }

    }

    public int getHoehe()
    {
        return hoehe;
    }

    public void setHoehe(int hoehe)
    {
        try
        {
            if (hoehe < 1)
            {
                this.hoehe = 1;
                throw new IllegalArgumentException();
            }
            else
            {
                this.hoehe = hoehe;
            }
        }
        catch (Exception IllegalArgumentException)
        {
            System.out.println("Höhe muss >= 1 sein");
        }

    }

    @Override
    public Rechteck getBoden()
    {
        Figur2D myBoden = super.getBoden();
        return (Rechteck) myBoden;
    }

    public void setBoden(Rechteck f)
    {
        super.setBoden(f);
    }

    @Override
    public double volumen()
    {
        return getBoden().flaeche() * hoehe;
    }

    @Override
    public double oberflaeche()
    {

        return (2 * getBoden().getBreite() * getBoden().getLaenge()) + (2 * getBoden().getBreite() * hoehe) + (2 * getBoden().getLaenge() * hoehe);
    }

    public double laengeRaumdiagonale()
    {
        return Math.sqrt(Math.pow(getBoden().getBreite(), 2) + Math.pow(getBoden().getLaenge(), 2) + Math.pow(hoehe, 2));
    }

    public static boolean istWuerfel(Object o)
    {
        if (o instanceof Quader)
        {
            Quader q = (Quader) o;
            if (q.getBoden().getBreite() == q.getBoden().getLaenge() && q.getBoden().getBreite() == q.getHoehe())
            {
                return true;
            }
            return false;
        }

        return false;

    }

    public boolean equals(Figur3D f)
    {
        if (f instanceof Quader)
        {
            Quader q = (Quader) f;
            if (q.getBoden().flaeche() == getBoden().flaeche() && q.getHoehe() == getHoehe())
            {
                return true;
            }
            return false;
        }
        return false;

    }
}
