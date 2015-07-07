package template;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {
	private String file;
	private int lineNumber = 0;
	BufferedReader br = null;
	
	public FileProcessor(String file) {
		this.file = file;
	}
	
	public final void process() {
		try {
			openFile();
			processLines();
			closeFile();
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}
	
	protected void openFile() throws FileNotFoundException {
		br = new BufferedReader(new FileReader(file));
	}
	
	private void processLines() throws IOException {
		String line;
		while((line = br.readLine()) != null) {
			ExchangeRate result = processLine(lineNumber, line);

			if(result != null) {
				printLine(result);
			}
			lineNumber++;
		}
	}
	
	protected void closeFile() throws IOException {
		br.close();
	}
	
	protected abstract ExchangeRate processLine(int lineNumber, String line);
	
	protected void printLine(ExchangeRate rate) {
		System.out.printf("The exchange rate from %s to %s is %f, you will get $%f for each $100\n",
				rate.getFromCurrency(), rate.getToCurrency(),
				rate.getRate(), rate.getRate() * 100);
	}
}