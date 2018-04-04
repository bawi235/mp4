package jenkins.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import javax.annotation.Nonnull;

import org.junit.Test;

import hudson.model.FreeStyleProject;
import hudson.model.Hudson;
import jenkins.model.JenkinsTest;
import jenkins.model.IdStrategy;

public class IdFromFileNameTest{

	@Test
    public void testIsDisplayNameUniqueTrue() throws Exception {
        final String FileName = "test file";
        
        IdStrategy CS = new IdStrategy.CaseSensitive();
        String Return1 = CS.idFromFilename(FileName);
     
        assertEquals(Return1, FileName);
    }
	
	@Test
	public void testWithCapsExpectFailure() throws Exception{
        final String FileName2 = "TestFile2";

        IdStrategy CS = new IdStrategy.CaseSensitive();
        String Return2 = CS.idFromFilename(FileName2);
        
        assertFalse(Return2 == "TestFile2");
	}
	
	
}
