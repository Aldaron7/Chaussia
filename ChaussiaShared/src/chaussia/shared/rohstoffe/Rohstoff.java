package chaussia.shared.rohstoffe;

public class Rohstoff
{
    private Rohstofftyp typ;
    private int         menge;

    public Rohstoff(Rohstofftyp typ, int menge)
    {
        this.typ = typ;
        this.menge = menge;
        this.floor();
    }

    public Rohstofftyp getTyp()
    {
        return this.typ;
    }

    public void setTyp(Rohstofftyp typ)
    {
        this.typ = typ;
    }

    public int getMenge()
    {
        return this.menge;
    }

    public void setMenge(int menge)
    {
        this.menge = menge;
        this.floor();
    }

    private void floor()
    {
        if (this.menge < 0)
        {
            this.menge = 0;
        }
    }

}
