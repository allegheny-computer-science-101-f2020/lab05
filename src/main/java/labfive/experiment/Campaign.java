package labfive.experiment;

import labfive.data.ResultsTable;
import labfive.sort.Sorter;

// TODO: Make sure that you understand the purpose of this interface

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Janyl Jumadinova
 */

public interface Campaign {

  /** Require that any Campaign implementer can run a Sorter in an experiment. */
  public ResultsTable run(Sorter sort);

}
