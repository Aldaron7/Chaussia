package chaussia.shared.gebaeude.ausbildung;

import java.util.List;

import chaussia.shared.Konstanten;
import chaussia.shared.einheiten.Einheitentyp;
import chaussia.shared.gebaeude.AbstractGebaeude;
import chaussia.shared.gebaeude.Gebaeude;
import chaussia.shared.gebaeude.Gebaeudetyp;
import chaussia.shared.rohstoffe.RohstoffVorrat;

public class Universitaet extends AbstractGebaeude implements Ausbildungsgebaeude
{

    private static final long serialVersionUID = 1L;

    @Override
    public void resetUpgradedauer()
    {
        this.setUpgradedauer(Konstanten.UPGRADEDAUER_UNI);
    }

    @Override
    public void resetBauzeit()
    {
        this.setBauzeit(Konstanten.BAUZEIT_UNI);
    }

    @Override
    public Gebaeude upgrade()
    {
        if (this.getStufe() < 1)
        {
            this.resetUpgradedauer();
        }
        return this;
    }

    @Override
    public List<Gebaeudetyp> getBenoetigteGebaeude()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RohstoffVorrat getBaukosten()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Gebaeudetyp getTyp()
    {
        return Gebaeudetyp.UNIVERSITAET;
    }

    @Override
    public List<Einheitentyp> getAuszubildende()
    {
        // TODO Auto-generated method stub
        return null;
    }

}