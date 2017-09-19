import java.io.IOException;
import java.net.URL;
import java.util.Scanner;



public class LabThree {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }


    public static void main(String[]args) {

        String Content1 = urlToString ("http://erdani.com/tdpl/hamlet.txt");
        String Content2 = urlToString ("https://www.bls.gov/tus/charts/chart9.txt");
        String Content3 = urlToString ("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");
        //System.out.println(wordCount);
        //System.out.println("type your word here: ");
        //Scanner yourWord = new Scanner(System.in);
        int wordCount = 0;//
        int index = 0;
        for (int n = 0; n<Content1.length(); n++) {
            if(Content1.charAt(n) == ' ') {
            wordCount ++;
            }
            if ( n< Content1.length()-6) {
                 if(Content1.substring(n, n + 6) == "prince") {
                index++;
            }

            }

        }
        System.out.println(index + " prince(s) in the text");
        System.out.println(wordCount + " words in the text");


        }
    }

