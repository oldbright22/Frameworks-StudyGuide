package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pages.LetcodeForm;
import pages.SeleniumForm;

@RunWith(Suite.class)
@Suite.SuiteClasses({LetcodeForm.class, SeleniumForm.class})

public class runnerJunit {
}
