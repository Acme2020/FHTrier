package geometrie;

public class Kreis extends Figur2D
{

    private static final int DEFAULT_RADIUS = 5;

    private int radius;

    public Kreis(Punkt bezug)
    {
        super(bezug);
        this.radius = Kreis.DEFAULT_RADIUS;
    }

    public Kreis(Punkt bezug, int radius)
    {
        super(bezug);
        if (radius < 1)
        {
            this.radius = Kreis.DEFAULT_RADIUS;
        }
        else
        {
            this.radius = radius;
        }
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        if (radius < 1)
        {
            this.radius = Kreis.DEFAULT_RADIUS;
        }
        else
        {
            this.radius = radius;
        }
    }

    @Override
    public double umfang()
    {
        return Math.PI * (radius * 2);
    }

    @Override
    public double flaeche()
    {
        return Math.PI * (Math.pow(radius, 2));
    }
}
