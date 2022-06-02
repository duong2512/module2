import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlTinTuc {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner =new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
          //  System.out.println(content);
            scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("<h3 class=\"article-title\"> <a (.*?)>(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(2));
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
