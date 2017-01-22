package chaussia.shared.gebaeude.ortschaft;

import java.util.List;

import chaussia.shared.Konstanten;
import chaussia.shared.gebaeude.Gebaeude;
import chaussia.shared.gebaeude.Gebaeudetyp;
import chaussia.shared.rohstoffe.RohstoffVorrat;

public class Stadt extends AbstractOrtschaft
{
    private static final long serialVersionUID = 1L;

    public Stadt()
    {
    }

    @Override
    public Gebaeude upgrade()
    {

        Ortschaft grossstadt = new OrtschaftFactory().create(Gebaeudetyp.GROSSSTADT);
        grossstadt.resetUpgradedauer();
        return grossstadt;
    }

    @Override
    public void resetUpgradedauer()
    {
        this.setUpgradedauer(Konstanten.UPGRADEDAUER_STADT);
    }

    @Override
    public void resetBauzeit()
    {
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
        return Gebaeudetyp.STADT;
    }

}