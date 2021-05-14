package geometrie;

public class Punkt
{
    private int xKoordinate, yKoordinate;

    public Punkt(int x, int y)
    {
        xKoordinate = x;
        yKoordinate = y;
    }

    public Punkt(Punkt p2)
    {

    }

    public int getXKoordinate()
    {
        return xKoordinate;
    }

    public int getYKoordinate()
    {
        return yKoordinate;
    }

    public void setXKoordinate(int x)
    {
        this.xKoordinate = x;
    }

    public void setYKoordinate(int y)
    {
        this.yKoordinate = y;
    }

    public double abstand(Punkt p)
    {
        return Math.sqrt((Math.pow(p.getXKoordinate() - xKoordinate, 2) + Math.pow(p.getYKoordinate() - yKoordinate, 2)));
    }

    public void verschieben(int deltaX, int deltaY)
    {
        xKoordinate += deltaX;
        yKoordinate += deltaY;
    }

    public boolean equals(Punkt p)
    {
        if (xKoordinate == p.getXKoordinate() && yKoordinate == p.getYKoordinate())
        {
            return true;
        }

        return false;
    }

}
