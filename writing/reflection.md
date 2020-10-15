# Reflection by Janyl Jumadinova

## Using a fenced code block, please display the output from running the experiment

```bash
Starting a Gradle Daemon (subsequent builds will be faster)

> Configure project :
Configured GatorGradle 0.4.4

> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :run
Starting a campaign of experiments with BubbleSort ...
  Running round 0 with input size 250
  Running round 1 with input size 500
  Running round 2 with input size 1000
  Running round 3 with input size 2000
  Running round 4 with input size 4000
  Running round 5 with input size 8000
  Running round 6 with input size 16000
  Running round 7 with input size 32000
  Running round 8 with input size 64000
  Running round 9 with input size 128000
... Finishing a campaign of experiments with BubbleSort

Results of an experiment campaign with BubbleSort:

Size (#)        Timing (ms)     Ratio (#)
250             7               0
500             3               0
1000            4               1
2000            19              5
4000            25              1
8000            108             4
16000           459             4
32000           1905            4
64000           8022            4
128000          32405           4

Starting a campaign of experiments with InsertionSort ...
  Running round 0 with input size 250
  Running round 1 with input size 500
  Running round 2 with input size 1000
  Running round 3 with input size 2000
  Running round 4 with input size 4000
  Running round 5 with input size 8000
  Running round 6 with input size 16000
  Running round 7 with input size 32000
  Running round 8 with input size 64000
  Running round 9 with input size 128000
... Finishing a campaign of experiments with InsertionSort

Results of an experiment campaign with InsertionSort:

Size (#)        Timing (ms)     Ratio (#)
250             2               0
500             5               3
1000            3               1
2000            6               2
4000            4               1
8000            11              3
16000           30              3
32000           119             4
64000           520             4
128000          2074            4

BUILD SUCCESSFUL in 56s
2 actionable tasks: 2 executed
```

## Using a fenced code block, please provide the output from running your test suite

```bash
> Configure project :
Configured GatorGradle 0.4.4

> Task :test

labfive.TestResultsTable > testResultsTableToStringDoesNotCrashWithTwoRows PASSED

labfive.TestResultsTable > testConstructResultsTableNotNull PASSED

labfive.TestResultsTable > testResultsTableContainsOneRow PASSED

labfive.TestResultsTable > testResultsTableContainsTwoRows PASSED

labfive.TestResultsTable > testResultsTableContainsRatio PASSED

labfive.TestResultsTable > testResultsTableContainsRatioWithZeroValues PASSED

labfive.TestRunCampaign > testCampaignDataGeneratorWorksMedium PASSED

labfive.TestRunCampaign > testCampaignDataGeneratorWorksSmall PASSED

labfive.TestRunCampaign > testCampaignDataGeneratorWorksLarge PASSED

labfive.TestInsertionSort > testisSortedCheckerWorksForSortedChar PASSED

labfive.TestInsertionSort > testisSortedCheckerWorksForUnSortedChar PASSED

labfive.TestInsertionSort > testisSortedCheckerWorksForSortedInt PASSED

labfive.TestInsertionSort > testisSortedCheckerWorksForUnSortedInt PASSED

labfive.TestInsertionSort > testInsertionSortCorrectName PASSED

labfive.TestInsertionSort > testInsertionSortWithChar PASSED

labfive.TestInsertionSort > testInsertionSortWithInt PASSED

labfive.TestInsertionSort > testInsertionSortWithManyOrderedInts PASSED

labfive.TestInsertionSort > testInsertionSortWithManyOrderedChar PASSED

labfive.TestInsertionSort > testInsertionSortWithManyReversedInts PASSED

labfive.TestInsertionSort > testInsertionSortWithManyReversedChars PASSED

labfive.TestInsertionSort > testInsertionSortWithManyRandomInts PASSED

labfive.TestInsertionSort > testInsertionSortWithManyRandomChars PASSED

labfive.TestBubbleSort > testBubbleSortCorrectName PASSED

labfive.TestBubbleSort > testBubbleSortWithChar PASSED

labfive.TestBubbleSort > testBubbleSortWithInt PASSED

labfive.TestBubbleSort > testBubbleSortWithManyOrderedInts PASSED

labfive.TestBubbleSort > testBubbleSortWithManyOrderedChar PASSED

labfive.TestBubbleSort > testBubbleSortWithManyRandomInts PASSED

labfive.TestBubbleSort > testisSortedCheckerWorksForSortedChar PASSED

labfive.TestBubbleSort > testisSortedCheckerWorksForUnSortedChar PASSED

labfive.TestBubbleSort > testisSortedCheckerWorksForSortedInt PASSED

labfive.TestBubbleSort > testisSortedCheckerWorksForUnSortedInt PASSED

labfive.TestBubbleSort > testBubbleSortWithManyReversedInts PASSED

labfive.TestBubbleSort > testBubbleSortWithManyReversedChars PASSED

labfive.TestBubbleSort > testBubbleSortWithManyRandomChars PASSED

BUILD SUCCESSFUL in 1s
4 actionable tasks: 4 executed
```

## Why is it important to conduct experiments to evaluate algorithm performance?

Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At
vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd
gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum
dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa
qui officia deserunt mollit anim id est laborum.

## For the chosen input sizes, which algorithm is faster? How can you tell?

Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At
vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd
gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum
dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa
qui officia deserunt mollit anim id est laborum.

## For large input sizes, which algorithm is likely to be faster? How can you tell?

Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At
vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd
gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum
dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa
qui officia deserunt mollit anim id est laborum.

## What is the meaning and purpose of the calculated order of growth ratio?

Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At
vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd
gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum
dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa
qui officia deserunt mollit anim id est laborum.

## Why does the source code set the value of the first order of growth ratio set to 0?

Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At
vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd
gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum
dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa
qui officia deserunt mollit anim id est laborum.

## Please explain the meaning of the following Java source code segments

- `String resultsTextual = Arrays.deepToString(results)`: performs a deep copy
- `results = new long[rowCount][COLUMN_NUMBER];`: declare two dimensional array
- `private static final int INPUT_SIZE_START = 250;`: size of initial array
- `public class InsertionSort extends Sorter`: create inheritance hierarchy
- `public ResultsTable run(Sorter sort)`: run a campaign of experiments

## After completing this assignment, what is a task that you want to practice more? Why?

Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At
vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd
gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum
dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa
qui officia deserunt mollit anim id est laborum.

## What challenges did you face during this assignment? How did you handle them?

Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At
vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd
gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum
dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor
invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero
eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no
sea takimata sanctus est Lorem ipsum dolor sit amet.

## After completing this assignment, what is one experience for which you are grateful?

Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod
tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At
vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd
gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum
dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat
nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa
qui officia deserunt mollit anim id est laborum.
