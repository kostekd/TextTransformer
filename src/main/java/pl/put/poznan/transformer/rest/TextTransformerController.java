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
@RequestMapping("/test")
public class TextTransformerController{


        @RequestMapping("/home")
        public ModelAndView welcome() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("page.html");
            return modelAndView;
        }

        @RequestMapping("/zadania")
        public ModelAndView showFunctions() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("login.html");
            return modelAndView;
        }



    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="upper,escape") String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // perform the transformation, you should run your logic here, below is just a silly example
        TextTransformer transformer = new TextTransformer(transforms);
        return transformer.transformUpper(text);
    }

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

}


