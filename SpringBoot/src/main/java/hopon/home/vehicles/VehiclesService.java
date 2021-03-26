package hopon.home.vehicles;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VehiclesService {
    private List<Vehicles> data= Arrays.asList(
            new Vehicles(1,"scooter","QR_0001","available","51.516432","-0.0985","0.15"),
            new Vehicles(2,"scooter","QR_0002","running","45.87867","-0.0673","0.95"),
            new Vehicles(3,"scooter","QR_0003","repairing","49.989898","-0.0985","0.65"),
            new Vehicles(4,"bike","QR_0004","available","52.516432","-0.078903","0.45"),
            new Vehicles(5,"bike","QR_0005","available","39.516432","-0.157323","0.15"),
            new Vehicles(6,"scooter","QR_0006","available","39.87867","-0.0985","0.05")
    );
    public List<Vehicles> FindAll() {
        return data;
    }

    public Vehicles FindByID(int id) {
        for (Vehicles vehicles: data){
            if (vehicles.getId()==id) return vehicles;
        }
        return null;
    }
}
