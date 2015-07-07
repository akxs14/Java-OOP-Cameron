package template;

import java.util.StringTokenizer;

public class CSVFileProcessor extends FileProcessor {
	public CSVFileProcessor(String file) {
		super(file);
	}
	
	@Override
	protected ExchangeRate processLine(int lineNumber, String line) {
		StringTokenizer st = new StringTokenizer(line,",");
		int i = 0;
		
		String fromCurrency = null;
		String toCurrency = null;
		Double rate = null;
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			s = s.replaceAll("\"","");
			
			switch(i) {
			case 0:
				fromCurrency = s;
				break;
			case 1:
				toCurrency = s;
				break;
			case 2:
				rate = Double.valueOf(s);
				break;
			}
			i++;
		}
		return new ExchangeRate(fromCurrency, toCurrency, rate);
	}
}
