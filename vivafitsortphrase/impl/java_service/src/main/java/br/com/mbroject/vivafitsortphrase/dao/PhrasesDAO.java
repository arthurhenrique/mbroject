package br.com.mbroject.vivafitsortphrase.dao;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.stream.Stream;

@Service
public class PhrasesDAO {

    public String[] getPhrases() {

        Properties propFile = new Properties();
        try {
            Stream<String> stream = Files.lines( Paths.get(new File(".").getCanonicalPath() +"/phrases.res"), Charset.forName("UTF-8"));
            return stream.toArray(String[]::new);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Couldn't load phrases file, please check if phrases.res file exists in the app folder");
        }
    }

}
