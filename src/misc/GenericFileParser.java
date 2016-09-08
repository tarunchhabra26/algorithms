package misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * This is a generic file parser that takes a file path as input and splits out all the lines and word with line and word number in the following format:
 * <word>:<line_number>:<word_count>
 * counts start at 0
 */

public class GenericFileParser {
	public static void main(String args[]) {
		File inputFile = null;
		FileInputStream oFileInputStream = null;
		BufferedReader oBufferedReader = null;
		if (args.length < 1) {
			System.out.println("Please provide a file name as input");
			return;
		}
		try {
			inputFile = new File(args[0]);
			oFileInputStream = new FileInputStream(inputFile);
			oBufferedReader = new BufferedReader(new InputStreamReader(oFileInputStream));
			String line = null;
			int lineCount = 0;
			while ((line = oBufferedReader.readLine()) != null) {
				//System.out.println(line + ": " + lineCount);
				String[] words = line.split("\\W+");
				int wordCount = 0;
				for (String word : words){
					System.out.println(word + ":" + lineCount + ":" + wordCount);
					wordCount++;
				}
				lineCount++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occurred :");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException occurred :");
			e.printStackTrace();
		} finally {
			try {
				if (null != oBufferedReader)
					oBufferedReader.close();
				if (null != oFileInputStream)
					oFileInputStream.close();
			} catch (IOException e) {
				System.out.println("IOException occurred :");
				e.printStackTrace();
			}
		}
	}
}
