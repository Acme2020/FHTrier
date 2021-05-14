package geometrie;

public class Zylinder extends Figur3D
{
    private int hoehe;

    public Zylinder(Kreis k, int hoehe)
    {
        super(k);
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
    public Kreis getBoden()
    {
        Figur2D myBoden = super.getBoden();
        return (Kreis) myBoden;
    }

    public void setBoden(Kreis k)
    {
        super.setBoden(k);
    }

    @Override
    public double volumen()
    {
        return getBoden().flaeche() * hoehe;
    }

    @Override
    public double oberflaeche()
    {
        return (getBoden().umfang() * hoehe) + (2 * getBoden().flaeche());
    }

}
