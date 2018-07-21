package br.com.mbroject.vivafitsortphrase.util;

import br.com.mbroject.vivafitsortphrase.dao.PhrasesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.annotation.PostConstruct;
import java.util.Random;

@Service
@ApplicationScope
public class PhrasesService {

    @Autowired
    private PhrasesDAO phrasesDAO;

    private String[] phrases;

    @PostConstruct
    public void init() {
        this.phrases = phrasesDAO.getPhrases();
    }

    public String[] getAllPhrases(){
        return this.phrases;
    }

    public String getRandomPhrase() {
        return this.phrases[new Random().nextInt(this.phrases.length)];
    }

}
