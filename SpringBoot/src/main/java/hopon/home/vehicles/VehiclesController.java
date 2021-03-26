package hopon.home.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Function;


@RestController
@RequestMapping(value = "api/v1/vehicles")
public class VehiclesController {
    @Autowired
    private VehiclesService vehiclesService;
    @GetMapping(value = {"","/"})
    public List<Vehicles> listvehicles(){
        return vehiclesService.FindAll();}

@GetMapping("/{id}")
public Vehicles getid(@PathVariable int id){
    return vehiclesService.FindByID(id);
}
}
