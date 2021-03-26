package hopon.home.vehicles;

public class Vehicles {

    private int id;
    private String type;
    private String qr_code;
    private String status;
    private String lat;
    private String lng;
    private String battery;


    public Vehicles(int id,String type,String qr_code,String status,String lat,String lng,String battery){
         this.id=id;
         this.type=type;
         this.qr_code=qr_code;
         this.status=status;
         this.lat=lat;
         this.lng=lng;
         this.battery=battery;
    }
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
