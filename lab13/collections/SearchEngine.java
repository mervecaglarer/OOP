package collections;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SearchEngine {

	public void index(String url) throws Exception {

		Map<String, Set<String>> index = new HashMap<>();
		// URL oracle = new URL("http://www.oracle.com/");
		//
		// BufferedReader in = new BufferedReader(new
		// InputStreamReader(oracle.openStream()));
		//
		// String inputLine;
		// while ((inputLine = in.readLine()) != null)
		// System.out.println(inputLine);
		// in.close();

		Document doc = Jsoup.connect(url).get();

		String text = doc.text();
		System.out.println(text);

		Pattern pattern = Pattern.compile("\\b\\w+\\b"); // backslash has
															// meaning so we
															// cannot use double
															// it
		Matcher m = pattern.matcher(text);

		while (m.find()) {
			String word = m.group();
			Set<String> links = index.get(word);
			if (links == null) {
				links = new HashSet<>();
				links.add(url);
				index.put(word, links);

			} else {
				links.add(url);

			}

			System.out.println(word);
		}

		System.out.println(index);
	}

	// public Set<String> search(String input) {
	// return index.get(input);
	// }
}

