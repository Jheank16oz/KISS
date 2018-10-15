package fr.neamar.kiss.pojo;

public class SearchPojo extends Pojo {
    public static int SEARCH_QUERY = 0;
    public static int URL_QUERY = 1;
    public static int CALCULATOR_QUERY = 2;

    public String query = "";
    public String url = "";
    public int type = SEARCH_QUERY;

    public SearchPojo(String query, String url, int type) {
        if(type != SEARCH_QUERY && type != URL_QUERY && type != CALCULATOR_QUERY) {
            throw new IllegalArgumentException("Wrong type!");
        }

        this.query = query;
        this.url = url;
        this.type = type;
    }
}
