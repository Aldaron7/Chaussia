package chaussia.shared.test;

public class ExternalizeStrings
{
    private String hallo = Messages.getString("hallo"); //$NON-NLS-1$

    public String getHallo()
    {
        return this.hallo;
    }

    public void setHallo(String hallo)
    {
        this.hallo = hallo;
    }

}
