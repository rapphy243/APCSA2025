
/**
 * This Round class represents . . .
 *
 * @author  Raphael Abano
 * @version May 9, 2025
 */
/** A single competitor in the tournament */
public class Competitor
{
/** The competitor’s name and rank */
private String name;
private int rank;
/**
* Assigns n to name and initialRank to rank
* Precondition: initialRank >= 1
*/
public Competitor(String n, int initialRank)
{ /* implementation not shown */ }
/* There may be instance variables, constructors,
and methods that are not shown. */
}
/** A match between two competitors */
public class Match
{
    public Match(Competitor one, Competitor two)
    { /* implementation not shown */ 
    }
    /* There may be instance variables, constructors,
    and methods that are not shown. */
}
/** A single round of the tournament */
public class Round
{
    /** The list of competitors participating in this round */
    private ArrayList<Competitor> competitorList;
    /** Initializes competitorList, as described in part (a) */
    public Round(String[] names)
    { /* to be implemented in part (a) */ }

    /**
     * Creates an ArrayList of Match objects for the next round
     * of the tournament, as described in part (b)
     * Preconditions: competitorList contains at least one element.
     * competitorList is ordered from best to worst rank.
     * Postcondition: competitorList is unchanged.
     */
    public ArrayList<Match> buildMatches()
    { /* to be implemented in part (b) */ }
    /* There may be instance variables, constructors,
    and methods that are not shown. */
}
