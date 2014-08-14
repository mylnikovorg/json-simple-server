package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mylnikov")
public class HelloController {
    @RequestMapping( method=RequestMethod.POST, value="/compile")
     @ResponseBody public RequestIn ResponseOut(@RequestBody final  RequestIn in) {
       /* ObjectMapper mapper = new ObjectMapper();
        RequestIn obj = null;
        System.out.println(in);
       /* try {
            obj = mapper.readValue(in, RequestIn.class);
        }
        catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        System.out.println(in.getConsoleArgs());
//        ArrayNode jsonArray = new ArrayNode(JsonNodeFactory.instance);
//        org.codehaus.jackson.node.ObjectNode jsonObject = jsonArray.addObject();
//
//        jsonObject.put("text", in.getText());
//        jsonObject.put("consoleArgs", in.getConsoleArgs());

        return in;
    }


}