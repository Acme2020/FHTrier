package geometrie;

public class Gerade
{
    private Punkt startPos, endPos;

    public Gerade(Punkt start, Punkt ende)
    {
        startPos = start;
        endPos = ende;
    }

    public Punkt getStartPos()
    {
        return startPos;
    }

    public void setStartPos(Punkt startPos)
    {
        this.startPos = startPos;
    }

    public Punkt getEndPos()
    {
        return endPos;
    }

    public void setEndPos(Punkt endPos)
    {
        this.endPos = endPos;
    }

    public double laenge()
    {
        return Math.abs(endPos.abstand(startPos));
    }

    public boolean istLaengerAls(Gerade g)
    {
        if (endPos.abstand(startPos) > g.endPos.abstand(g.startPos))
        {
            return true;
        }

        return false;
    }

    public boolean equals(Gerade g)
    {
        if (endPos.abstand(startPos) == g.endPos.abstand(g.startPos))
        {
            return true;
        }

        return false;

    }

}
