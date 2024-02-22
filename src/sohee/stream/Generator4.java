package sohee.stream;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Generator4 {
    public static void main(String[] args) throws IOException {
        Stream<Path> files = Files.list(Paths.get("./resources"));
        files.map(Path::getFileName).forEach(System.out::println);

        System.out.println("------");

        Stream<String> fileStream;
        fileStream = Files.lines(Paths.get("./resources/1.txt"), Charset.forName("UTF-8"));
        fileStream.forEach(System.out::println);
    }
}
