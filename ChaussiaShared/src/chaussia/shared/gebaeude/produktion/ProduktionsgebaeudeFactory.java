package chaussia.shared.gebaeude.produktion;

import chaussia.shared.Konstanten;
import chaussia.shared.gebaeude.Gebaeudetyp;

public class ProduktionsgebaeudeFactory
{

    public ProduktionsgebaeudeFactory()
    {
    }

    public AbstractProduktionsgebaeude create(Gebaeudetyp typ)
    {
        AbstractProduktionsgebaeude produktionsgebaeude = null;
        switch (typ)
        {
            case HOLZFAELLER:
                produktionsgebaeude = new Holzfaeller();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_HOLZ);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION1);
                break;
            case MINE:
                produktionsgebaeude = new Mine();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_ERZ);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION1);
                break;
            case BAUERNHOF:
                produktionsgebaeude = new Bauernhof();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_KORN);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION1);
                break;
            case LEHMGRUBE:
                produktionsgebaeude = new Lehmgrube();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_LEHM);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION1);
                break;
            case SCHAEFER:
                produktionsgebaeude = new Schaefer();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_WOLLE);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION1);
                break;
            case WEBSTUBE:
                produktionsgebaeude = new Webstube();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_STOFF);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION2);
                break;
            case SAEGEWERK:
                produktionsgebaeude = new Saegewerk();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_BRETT);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION2);
                break;
            case BAECKEREI:
                produktionsgebaeude = new Baeckerei();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_BROT);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION2);
                break;
            case SCHMIEDE:
                produktionsgebaeude = new Schmiede();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_EISEN);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION2);
                break;
            case ZIEGELEI:
                produktionsgebaeude = new Ziegelei();
                produktionsgebaeude.setErtrag(Konstanten.ERTRAG_ZIEGEL);
                produktionsgebaeude.setUnterhaltskosten(Konstanten.UNTERHALT_PRODUKTION2);
                break;
            default:
                break;
        }
        if (produktionsgebaeude != null)
        {
            produktionsgebaeude.resetBauzeit();
        }
        return produktionsgebaeude;
    }
}