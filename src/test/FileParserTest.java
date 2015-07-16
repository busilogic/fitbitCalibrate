package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.kiranbusi.fitibit.simulator.FileParser;

public class FileParserTest {

	@Test
	public void testFileExists() {
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

	@Test
	public void testInvalidUpperCooridnatesOfPitch() throws IOException {

		String fname = "/Users/kbusi/Devel/eclipse_workspace/medibankFitBitTest/src/test/badPitchCoordinatesInputData.txt";

		Throwable e = null;
		try {
			FileParser fp = new FileParser(fname);
			List<String> commandsList = fp.processLineByLine();
			fp.parseUpperCoordinatesOfPitch(commandsList.get(0));
		} catch (Throwable ex) {
			e = ex;
		}
		assertTrue(e instanceof IOException);
	}

	@Test
	public void testInvalidMemberCooridnatesOnPitch() throws IOException {

		String fname = "/Users/kbusi/Devel/eclipse_workspace/medibankFitBitTest/src/test/badMemberCoordinatesInputData.txt";

		Throwable e = null;
		try {
			FileParser fp = new FileParser(fname);
			List<String> commandsList = fp.processLineByLine();
			fp.parseMemberCoordinatesOnPitch(commandsList.get(1));
		} catch (Throwable ex) {
			e = ex;
		}
		assertTrue(e instanceof IOException);
	}

	@Test
	public void testValidMemberDirections() throws IOException {

		String fname = "/Users/kbusi/Devel/eclipse_workspace/medibankFitBitTest/src/test/inputData.txt";

		FileParser fp = new FileParser(fname);
		List<String> commandsList = fp.processLineByLine();
		boolean valid = fp.isValidMemberCommands(commandsList.get(2)
				.toCharArray());
		assertTrue(valid);
	}
	
	@Test
	public void testInvalidMemberDirections() throws IOException {

		String fname = "/Users/kbusi/Devel/eclipse_workspace/medibankFitBitTest/src/test/badMemberDirectionsInputData.txt";

		FileParser fp = new FileParser(fname);
		List<String> commandsList = fp.processLineByLine();
		boolean valid = fp.isValidMemberCommands(commandsList.get(2)
				.toCharArray());
		assertFalse(valid);
	}
}
