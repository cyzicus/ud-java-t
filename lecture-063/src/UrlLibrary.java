import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UrlLibrary implements Iterable<String> {

	private List<String> urls = new LinkedList<String>();
	
	private class UrlIterator implements Iterator<String> {

		private int index = 0;
		
		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			
			StringBuilder sb = new StringBuilder();
			
			try {
				URL url = new URL(urls.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				String line = null;
				
				while((line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
				}
				
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			index++;
			return sb.toString();
		}
		
		@Override
		public void remove() {
			urls.remove(index);
		}
	}
	
	public UrlLibrary() {
		urls.add("http://www.caveofprogramming.com");
		urls.add("http://www.yahoo.com");
		urls.add("http://www.google.com");
	}

	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}

	
}
