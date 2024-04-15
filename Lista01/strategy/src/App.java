import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import Context.WebSearchModel;

public class App {
    public static void main(String[] args) throws Exception {
        // Obter o diretório atual do usuário
        String currentDir = System.getProperty("user.dir");

        // Caminho completo do arquivo
        Path filePath = Paths.get(currentDir, "List01", "strategy", "src", "data", "Hamlet.txt");
        System.out.println("File path: " + filePath.toString());

        // Source file (in the project's data/ folder)
        File inputTextFile = new File("data/Hamlet.txt");

        // Build object graph
        WebSearchModel model = new WebSearchModel(inputTextFile);
        Snooper snoop = new Snooper(model);

        // Execute
        model.pretendToSearch();
    }
}
