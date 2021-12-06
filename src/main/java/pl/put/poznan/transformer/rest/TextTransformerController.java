package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.put.poznan.transformer.logic.TextTransformer;

import java.util.Arrays;


@RestController
@RequestMapping("/transform")
public class TextTransformerController{

    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

    @RequestMapping(value ="/upper/{text}",method = RequestMethod.GET, produces = "application/json")
    public String getUpper(@PathVariable String text) {

        // log the parameters
        logger.debug(text);

        // perform the transformation, you should run your logic here, below is just a silly example
        TextTransformer transformer = new TextTransformer(text);
        return transformer.transformUpper(text);
    }

    @RequestMapping(value ="/lower/{text}",method = RequestMethod.GET, produces = "application/json")
    public String getLower(@PathVariable String text) {

        // log the parameters
        logger.debug(text);

        // perform the transformation, you should run your logic here, below is just a silly example
        TextTransformer transformer = new TextTransformer(text);
        return transformer.transformLower(text);
    }

    @RequestMapping(value ="/capital/{text}",method = RequestMethod.GET, produces = "application/json")
    public String getCapital(@PathVariable String text) {

        // log the parameters
        logger.debug(text);

        // perform the transformation, you should run your logic here, below is just a silly example
        TextTransformer transformer = new TextTransformer(text);
        return transformer.transformCapital(text);
    }

    @RequestMapping(value ="/short/{text}",method = RequestMethod.GET, produces = "application/json")
    public String getShort(@PathVariable String text) {

        // log the parameters
        logger.debug(text);

        // perform the transformation, you should run your logic here, below is just a silly example
        TextTransformer transformer = new TextTransformer(text);
        return transformer.transformShort(text);
    }

    @RequestMapping(value ="/extend/{text}",method = RequestMethod.GET, produces = "application/json")
    public String getExtend(@PathVariable String text) {

        // log the parameters
        logger.debug(text);

        // perform the transformation, you should run your logic here, below is just a silly example
        TextTransformer transformer = new TextTransformer(text);
        return transformer.transformExtend(text);
    }

    @RequestMapping(value ="/duplicate/{text}",method = RequestMethod.GET, produces = "application/json")
    public String getDuplicates(@PathVariable String text) {

        // log the parameters
        logger.debug(text);

        // perform the transformation, you should run your logic here, below is just a silly example
        TextTransformer transformer = new TextTransformer(text);
        return transformer.eliminateDuplicates(text);
    }

/*
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@PathVariable String text,
                      @RequestBody String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // perform the transformation, you should run your logic here, below is just a silly example
        TextTransformer transformer = new TextTransformer(transforms);
        return transformer.transformUpper(text);
    }
*/
}


