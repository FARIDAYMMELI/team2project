package orangehrm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import team2.utility.Utility;

import java.util.Properties;

public class RecruitmentTest {
    Logger log = LogManager.getLogger(RecruitmentTest.class.getName());
    Properties properties = Utility.loadProperties();
    String validUsername = properties.getProperty("orangehrm.username");
    String validPassword = properties.getProperty("orangehrm.password");






}
