package br.com.mbroject.vivafitsortphrase.controller;

import br.com.mbroject.vivafitsortphrase.util.PhrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {

    private static final String REST_DIRECTORY = "/phrases";

    @Autowired
    PhrasesService phrasesService;

    @RequestMapping(value = REST_DIRECTORY + "/all", method = RequestMethod.GET)
    public ResponseEntity getAllPhrases() {
        try {
            return new ResponseEntity<String[]>(phrasesService.getAllPhrases(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = REST_DIRECTORY + "/random", method = RequestMethod.GET)
    public ResponseEntity getSomePhrase() {
        try {
            return new ResponseEntity<String>(phrasesService.getRandomPhrase(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
