
/**
 * This DogWalkCompany class represents . . .
 *
 * @author  Raphael Abano
 * @version May 9, 2025
 */
public class DogWalkCompany
{
    /* implementation not shown */
    /* all code in this class is 
       provided to not show errors
       inside of BlueJ          */
    public static int[] availableDogs = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
    
    /**
     * Returns the number of dogs, always greater than 0, that are available
     * for a walk during the time specified by hour
     * Precondition: 0 <= hour <= 23
     */
    public static int numAvailableDogs(int hour)
    {
        /* implementation not shown */
        if (hour < 0 || hour > 23)
        {
            return -1;
        }
        return availableDogs[hour];
    }

    /**
     * Decreases, by numberDogsWalked, the number of dogs available for a walk
     * during the time specified by hour
     * Preconditions: 0 <= hour <= 23
     * numberDogsWalked > 0
     */
    public static void updateDogs(int hour, int numberDogsWalked)
    { 
        /* implementation not shown */
        availableDogs[hour] = availableDogs[hour] - numberDogsWalked;
    }
}
