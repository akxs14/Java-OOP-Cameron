package template;

public class PipeFileProcessor extends FileProcessor {
	public PipeFileProcessor(String file) {
		super(file);
	}
	
	@Override
	protected ExchangeRate processLine(int lineNumber, String line) {
		if(lineNumber == 0) {
			return null;
		}
		
		String fromCurrency = null;
		String toCurrency = null;
		Double rate = null;
		String[] tokens = line.split("\\|");
		
		for(int i = 0; i < tokens.length; i++) {
			String s = tokens[i];
			s = s.replaceAll("\"", "");
			
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
