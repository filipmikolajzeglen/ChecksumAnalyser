import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ControlSum {

    public static String checksum(String actualsum) throws IOException, NoSuchAlgorithmException {
        byte[] actsum = Files.readAllBytes(Paths.get(actualsum));
        byte[] acthash = MessageDigest.getInstance("MD5").digest(actsum);

        String actual = DatatypeConverter.printHexBinary(acthash);
        return actual;
    }
}