package labfive.experiment;

import labfive.data.ResultsTable;
import labfive.sort.BubbleSort;
import labfive.sort.InsertionSort;
import labfive.sort.Sorter;

// TODO: Add all of the needed comments to this file

public class Experiment {

  public static void main(String[] args) {
    // TODO: Please note that this program may run infinitely before you add required code
    RunCampaign runSorterCampaign = new RunCampaign();
    // Create a BubbleSort and run it in a campaign
    BubbleSort bubbleSort = new BubbleSort();
    ResultsTable bubbleSortResultsTable = runSorterCampaign.run(bubbleSort);
    System.out.println();
    System.out.println("Results of an experiment campaign with " + bubbleSort.getName() + ":\n");
    System.out.println(bubbleSortResultsTable.toString());
    System.out.println();
    // TODO: Create an InsertionSort object and run it in a campaign
    // TODO: Follow the strategy in the above exaple to evaluate InsertionSort
    // TODO: Make sure that you understand how runSorterCampaign.run() works
    // TODO: Mke sure that your program prints the results of running the second campaign
  }

}
