package br.com.mbroject.vivafitsortphrase;

import br.com.mbroject.vivafitsortphrase.dao.PhrasesDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VivafitsortphraseApplicationTests {

    @Autowired
    private PhrasesDAO phrasesDAO;

    @Test
    public void phrasesDAO_getPhrases() {
        Assert.assertNotEquals(0, phrasesDAO.getPhrases().length);
    }

}
