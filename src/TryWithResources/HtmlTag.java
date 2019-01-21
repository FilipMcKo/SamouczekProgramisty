package TryWithResources;

public class HtmlTag implements AutoCloseable {
    private final String tag;

    HtmlTag(String tag) {
        this.tag = tag;
        System.out.println("<" + tag + ">");
    }


    public void close(){
        System.out.println("</"+tag+">");
    }

    public void body(String bodyText){
        System.out.println(bodyText);
    }
}
