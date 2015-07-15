package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.kiranbusi.fitibit.simulator.FileParser;

public class FileParserTest {

	@Test
	public void testFileExists(){
		String fname = "/Users/kbusi/Devel/eclipse_workspace/medibankFitBitTest/src/test/inputData.txt";
		
		Throwable e = null;
		try {
			FileParser fp = new FileParser(fname);
		} catch (Throwable ex) {
			e = ex;
		}
		assertFalse(e instanceof IOException);
	}

	@Test
	public void testFileNotFound() {
		String fname = "invalidFileNameOfFileThatDoesntExist.txt";
		
		Throwable e = null;
		try {
			FileParser fp = new FileParser(fname);
		} catch (Throwable ex) {
			e = ex;
		}
		assertTrue(e instanceof IOException);
	}
	
	
	@Test
	public void testValidUpperCooridnatesOfPitch() throws IOException {
		
		String fname = "/Users/kbusi/Devel/eclipse_workspace/medibankFitBitTest/src/test/inputData.txt";
		
		Throwable e = null;
		try {
			FileParser fp = new FileParser(fname);
			fp.processLineByLine();
			assertNotEquals(0, fp.getMaxX());
			assertNotEquals(0, fp.getMaxY());
			
		} catch (Throwable ex) {
			e = ex;
		}
		assertFalse(e instanceof IOException);	
	}

}
