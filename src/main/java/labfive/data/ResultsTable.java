package labfive.data;

import java.util.Arrays;

/**
 * A results table that stores data from running a timing experiment.
 *
 * @author Janyl Jumadinova
 * @author 
 */

public class ResultsTable {

  // TODO: Make sure that you understand the purpose of each of these variables

  /** The two-dimensional array (table) of the results. */
  private long[][] results;

  /** The current row in the table. */
  private int currentRow;

  /** The first row in the table. */
  private static final int FIRST_ROW = 0;

  /** The number of columns in the table. */
  private static final int COLUMN_NUMBER = 3;

  /** The size index into the table. */
  private static final int SIZE = 0;

  /** The timing index into the table. */
  private static final int TIMING = 1;

  /** The ratio index into the table. */
  private static final int RATIO = 2;

  /** Create a new instance of the ResultsTable. */
  public ResultsTable(int rowCount) {
    // TODO: Construct the results for rowCount and COLUMN_NUMBER
    // TODO: Indicate that the currentRow should start at zero
  }

  /** Return the entire two-dimensional array of the results. */
  public long[][] getResultsTable() {
    return results;
  }

  /** Store another row of results in the table. */
  public void addResult(long size, long timing) {
    // TODO: Add in the provide values for the size and the timing
    // TODO: Compute the ratio and add it to the data table
    // NOTE 1: The first row will not have ratio
    // NOTE 2: No row has a ratio if the previous row has a timing of zero
    // NOTE 3: Otherwise, the ratio is the current timing divided by the previous
    // TODO: Indicate that the data table has moved to the next row
    currentRow++;
  }

  /** Return the number of rows current in the table. */
  public int getRowCount() {
    return currentRow;
  }

  /** Return a string of the array-based table. */
  public String toString() {
    // TODO: Make sure that you understand how the deepToString works
    String resultsTextual = Arrays.deepToString(results)
        .replace("], ", "\n")
        .replace(", ", "\t\t")
        .replace("[", "")
        .replace("[[", "")
        .replace("]]", "");
    // TODO: Make sure that you understand how these replace calls
    // lead to the construction of the correct data table in the output
    return "Size (#)\tTiming (ms)\tRatio (#)\n" + resultsTextual;
  }

}
