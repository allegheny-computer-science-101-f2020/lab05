package labfive;

import static org.junit.Assert.assertEquals;

import labfive.experiment.RunCampaign;
import org.junit.Test;

/**
 * A JUnit test suite for the RunCampaign class.
 *
 * @author Janyl Jumadinova
 */

public class TestRunCampaign {

  @Test
  public void testCampaignDataGeneratorWorksSmall() {
    RunCampaign campaign = new RunCampaign();
    int[] generatedData = campaign.generateRandomData(250);
    assertEquals(generatedData.length, 250);
  }

  @Test
  public void testCampaignDataGeneratorWorksMedium() {
    RunCampaign campaign = new RunCampaign();
    int[] generatedData = campaign.generateRandomData(500);
    assertEquals(generatedData.length, 500);
  }

  @Test
  public void testCampaignDataGeneratorWorksLarge() {
    RunCampaign campaign = new RunCampaign();
    int[] generatedData = campaign.generateRandomData(1000);
    assertEquals(generatedData.length, 1000);
  }

}
