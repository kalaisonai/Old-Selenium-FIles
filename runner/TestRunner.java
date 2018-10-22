package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Login.feature", 
		glue = {"pages","hooks"},
		tags = {"@Smoke or @Sanity"},
		name = {"signIN"},
		monochrome = true,
		dryRun=false,
		snippets=SnippetType.CAMELCASE,
		strict=true,
		plugin= {"pretty","html:reports"}
		)
public class TestRunner {
}
