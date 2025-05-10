import java.util.ArrayList;

/**
 * Write a description of class Round here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/** A single round of the tournament */
public class Round
{
    /** The list of competitors participating in this round */
    private ArrayList<Competitor> competitorList;
    /** Initializes competitorList, as described in part (a) */
    public Round(String[] names)
    { /* to be implemented in part (a) */ 
      competitorList = new ArrayList<Competitor>();
      
      for (int i = 0; i < names.length; i++)
      {
          competitorList.add(new Competitor(names[i], i + 1));
      }
    }

    /**
     * Creates an ArrayList of Match objects for the next round
     * of the tournament, as described in part (b)
     * Preconditions: competitorList contains at least one element.
     * competitorList is ordered from best to worst rank.
     * Postcondition: competitorList is unchanged.
     */
    public ArrayList<Match> buildMatches()
    {
        ArrayList<Match> matches = new ArrayList<Match>();
        if (competitorList.size() % 2 == 0)
        {
            for (int i = 0; i < competitorList.size() / 2; i++)
            {
                matches.add(new Match(competitorList.get(i), competitorList.get(competitorList.size() - (i + 1))));
            }
        }
        else
        {
            for (int i = 1; i < (competitorList.size() + 1) / 2; i++)
            {
                matches.add(new Match(competitorList.get(i), competitorList.get(competitorList.size() - (i + 1))));
            }
        }
        return matches;
    }
    /* There may be instance variables, constructors,
    and methods that are not shown. */
}
