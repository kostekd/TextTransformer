package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.put.poznan.transformer.logic.*;

import java.util.Arrays;


@RestController
@RequestMapping("/transform")
public class TextTransformerController{

    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

    @RequestMapping(value ="/upper/{text}",method = RequestMethod.POST, produces = "application/json")
    public String getUpper(@PathVariable String text, @RequestBody TextTransform transform) {

        // log the parameters
        logger.debug(text);

        // logic
        String result = transform.transform();
        return result;
    }

    @RequestMapping(value ="/lower/{text}",method = RequestMethod.POST, produces = "application/json")
    public String getLower(@PathVariable String text, @RequestBody TextTransform transform) {

        // log the parameters
        logger.debug(text);

        // logic
        String result = transform.transform();
        return result;
    }

    @RequestMapping(value ="/capital/{text}",method = RequestMethod.POST, produces = "application/json")
    public String getCapital(@PathVariable String text, @RequestBody TextTransform transform) {
        // log the parameters
        logger.debug(text);

        // logic
        String result = transform.transform();

        return result;
    }

    @RequestMapping(value ="/short/{text}",method = RequestMethod.POST, produces = "application/json")
    public String getShort(@PathVariable String text, @RequestBody TextTransform transform) {
        // log the parameters
        logger.debug(text);

        // logic
        String result = transform.transform();

        return result;
    }

    @RequestMapping(value ="/extend/{text}",method = RequestMethod.POST, produces = "application/json")
    public String getExtend(@PathVariable String text, @RequestBody TextTransform transform) {

        // log the parameters
        logger.debug(text);

        // logic
        String result = transform.transform();

        return result;
    }

    @RequestMapping(value ="/duplicate/{text}",method = RequestMethod.POST, produces = "application/json")
    public String getDuplicates(@PathVariable String text, @RequestBody TextTransform transform) {

        // log the parameters
        logger.debug(text);

        // logic
        String result = transform.transform();

        return result;
    }


    @RequestMapping(value ="/specialSigns/{text}",method = RequestMethod.POST, produces = "application/json")
    public String getSpecialSigns(@PathVariable String text, @RequestBody TextTransform transform) {

        // log the parameters
        logger.debug(text);

        // logic
        String result = transform.transform();

        return result;
    }
}


