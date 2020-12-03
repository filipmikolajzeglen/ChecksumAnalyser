import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        final File folder = new File("C:\\SOMEPATH");

        List<String> result = new ArrayList<>();

        DirectoryChecker.search(".*\\.jar", folder, result);

        for (String s : result) {
            System.out.println(ControlSum.checksum(s) + "\t" + s);
        }
    }
}
