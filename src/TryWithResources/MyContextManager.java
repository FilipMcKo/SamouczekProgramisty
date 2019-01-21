package TryWithResources;

public class MyContextManager {

    public static void main(String[] args)  {
        try (
                HtmlTag h1 = new HtmlTag("h1");
                HtmlTag em = new HtmlTag("em")
        ) {
            em.body("my text");
        }
    }
}
