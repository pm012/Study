package com.javarush.task16.task1630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1. Sort it out what the program is doing
 * 2. In static block read 2 files firstFileName and secondFileName.
 * 3. Inside the Solution class create thread public static ReadFileThread, that implements interface ReadFileInterface ( Think what fits best: Thread or Runnable)
 * 3.1 Method setFileName should define the name of the file and  read its content
 * 3.2 Method getFileContent should return file content
 * 3.3 Read all contents of the file and close thread. Split with whitespace the rows of the file.
 * 4. Think, in what place the end of thread work should be waited to provide sequential output of files. 
 * 4.1 To do this add call for appropriate method
 */

public class InputOutputFilesInThreads {
	public static String firstFileName;
	public static String secondFileName;

	// add your code here - добавьте код тут

	static {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			firstFileName = br.readLine();
			secondFileName = br.readLine();
			br.close();
		} catch (IOException e) {
			try {
				br.close();
			} catch (IOException ex) {

			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		systemOutPrintln(firstFileName);
		systemOutPrintln(secondFileName);
	}

	public static void systemOutPrintln(String fileName) throws InterruptedException {
		ReadFileInterface f = new ReadFileThread();
		f.setFileName(fileName);
		f.start();
		// add your code here - добавьте код тут
		System.out.println(f.getFileContent());
	}

	public interface ReadFileInterface {

		public void setFileName(String fullFileName);

		public String getFileContent();

		public void join() throws InterruptedException;

		public void start();
	}

	// add your code here - добавьте код тут

	public static class ReadFileThread implements ReadFileInterface, Runnable {

		@Override
		public void setFileName(String fullFileName) {
			// TODO Auto-generated method stub

		}

		@Override
		public String getFileContent() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void join() throws InterruptedException {
			// TODO Auto-generated method stub

		}

		@Override
		public void start() {
			// TODO Auto-generated method stub

		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}

}
