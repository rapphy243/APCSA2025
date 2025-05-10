
/**
 * Write a description of class SumOrSameGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOrSameGame
{
    private int[][] puzzle;
    /**
     * Creates a two-dimensional array and fills it with random integers,
     * as described in part (a)
     * Precondition: numRows > 0; numCols > 0
     */
    public SumOrSameGame(int numRows, int numCols)
    {   /* to be implemented in part (a) */ 
        this.puzzle = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++)
        {
            for (int x = 0; x < numCols; x++)
            {
                int randomNumber = (int) ((Math.random() * 9) + 1);
                this.puzzle[i][x] = randomNumber;
            }
        }
    }

    /**
     * Identifies and clears an element of puzzle that can be paired with
     * the element at the given row and column, as described in part (b)
     * Preconditions: row and col are valid row and column indices in puzzle.
     * The element at the given row and column is between 1 and 9, inclusive.
     */
    public boolean clearPair(int row, int col)
    {   /* to be implemented in part (b) */ 
        int num = puzzle[row][col];
        for (int i = row; i < puzzle.length; i++)
        {
            for (int x = 0; x < puzzle[0].length; x++)
            {
                if (!(i == row && x == col))
                {
                    int temp = puzzle[i][x];
                    if (temp + num == 10 || temp == num)
                    {
                        puzzle[i][x] = 0;
                        puzzle[row][col] = 0;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    /* There may be instance variables, constructors,
    and methods that are not shown. */
}
