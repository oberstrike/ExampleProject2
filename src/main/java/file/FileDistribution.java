package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileDistribution implements Distribution {

    final String dir = "G:\\ExampleProject\\distribution\\";

    public static void main(String[] args) {
        FileDistribution fileDistribution = new FileDistribution();
        fileDistribution.distribute("C:\\Users\\oberstrike\\Desktop\\MeineDatei.txt");

    }

    @Override
    public void distribute(String name) {
        try {
            byte[] content = read(name);
            String[] path = name.split("\\\\");
            String filename = path[path.length - 1];
            write(content, filename);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    private void write(byte[] content, String name) throws IOException {
        Path path = Paths.get(name);
        byte[] strToBytes = "Hallo".getBytes();

        Files.write(path, strToBytes);
    }


    private byte[] read(String filename) throws DistributionException {
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            return fileInputStream.readAllBytes();
        }catch (Exception exception){
            throw new DistributionException(filename);
        } }


}
