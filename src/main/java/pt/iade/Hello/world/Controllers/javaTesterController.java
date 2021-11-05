package pt.iade.Hello.world.Controllers;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.Hello.world.Modules.CurricularUnits;


@RestController
    @RequestMapping(path= "/api/java/tester/")
public class javaTesterController {
    private Logger logger = LoggerFactory.getLogger(GreeterController.class);

    @GetMapping(path = "/author", produces= MediaType.APPLICATION_JSON_VALUE)
    public String getAuthor(){
        logger.info("Get Author");
        String name = "Rafael Oliveira";
        int number = 20200732;

        return "nome: "+ name + "numero " + number;
    }
    @GetMapping(path = "/access/(student)/(covid)", produces= MediaType.APPLICATION_JSON_VALUE)
    public boolean getGreeting(@PathVariable("student") boolean isstudent,@PathVariable("covid") boolean hasCovid){
        return isstudent && hasCovid;
        
    }
    //curricular units
    private ArrayList<CurricularUnits> units = new ArrayList<>();

    @PostMapping(path = "/units", produces= MediaType.APPLICATION_JSON_VALUE)
    public CurricularUnits saveUnit(@RequestBody CurricularUnits unit) {
        logger.info("Added unit "+unit.getName());
        units.add(unit);
        return unit;
 }

 @GetMapping(path = "/units",
 produces= MediaType.APPLICATION_JSON_VALUE)
 public ArrayList<CurricularUnits> getUnits() {
    logger.info("Get "+units.size()+" Units");
    return units;
 } 
 
}
