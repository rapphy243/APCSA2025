
/**
 * This SignedText class represents . . .
 *
 * @author  Raphael Abano
 * @version May 9, 2025
 */
public class SignedText
{
    private String firstName;
    private String lastName;
    
    public SignedText(String first, String last)
    {
        this.firstName = first;
        this.lastName = last;
    }
    
    public String getSignature() 
    {
        if (firstName.equals(""))
        {
            return lastName;
        }
        return firstName.substring(0,1) + "-" + lastName;
    }
    
    public String addSignature(String phrase)
    {
        if (phrase.indexOf(getSignature()) == -1)
        {
            return phrase + getSignature();
        }
        else if (phrase.indexOf(getSignature()) == 0)
        {
            return phrase.substring(getSignature().length()) + getSignature();
        }
        return phrase;
    }
}
