package chaussia.shared.test;

import java.io.IOException;

import chaussia.shared.gebaeude.Gebaeude;
import chaussia.shared.gebaeude.Gebaeudetyp;
import chaussia.shared.gebaeude.produktion.Holzfaeller;
import chaussia.shared.gebaeude.produktion.Produktionsgebaeude;
import chaussia.shared.gebaeude.produktion.ProduktionsgebaeudeFactory;

public class Test
{

    public static void main(String[] args) throws IOException
    {
        // Test.testGebaude();
        Messages.put("holzfaeller", new Holzfaeller());
        System.out.println(Messages.getString("holzfaeller"));
    }

    public static void testGebaude()
    {
        Gebaeude gebaeude = new ProduktionsgebaeudeFactory().create(Gebaeudetyp.HOLZFAELLER);
        System.out.println(gebaeude.getClass().getSimpleName());
        ((Produktionsgebaeude) gebaeude).setArbeitet(true);
        ((Produktionsgebaeude) gebaeude).addArbeiter();

        for (int i = 0; i < 5; i++)
        {
            System.out.println("bauzeit:" + gebaeude.getBauzeit());
            System.out.println(((Produktionsgebaeude) gebaeude).getErtrag());
            gebaeude.reduziereBauzeit();
        }
        gebaeude.upgrade();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("upgradedauer:" + gebaeude.getUpgradedauer());
            System.out.println(((Produktionsgebaeude) gebaeude).getErtrag());
            gebaeude.reduziereUpgradeDauer();
        }
    }

}
