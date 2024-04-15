import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Source file (in the project's data/ folder)
        File inputTextFile = new File("Hamlet.txt");

        // Build object graph
        WebSearchModel model = new WebSearchModel(inputTextFile);
        Snooper snoop = new Snooper(model);

        // Execute
        model.pretendToSearch();
    }
}
