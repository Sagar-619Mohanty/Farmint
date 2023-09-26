public class Riders {
    public int Rider_id;
    public String Rider_name;
    public String Rider_vehicle;
    public int Rider_vehicle_no;

    public int getRider_id() {
        return Rider_id;
    }

    public void setRider_id(int rider_id) {
        Rider_id = rider_id;
    }

    public String getRider_name() {
        return Rider_name;
    }

    public void setRider_name(String rider_name) {
        Rider_name = rider_name;
    }

    public String getRider_vehicle() {
        return Rider_vehicle;
    }

    public void setRider_vehicle(String rider_vehicle) {
        Rider_vehicle = rider_vehicle;
    }

    public int getRider_vehicle_no() {
        return Rider_vehicle_no;
    }

    public void setRider_vehicle_no(int rider_vehicle_no) {
        Rider_vehicle_no = rider_vehicle_no;
    }

    public enum Gender{
      male,
      female,
      other
  }


}
