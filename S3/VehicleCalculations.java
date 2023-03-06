public class VehicleCalculations {

    public  double calculateVehicle(Vehicle v){
        if ( v instanceof Car)
        {
            return v.getValue()*0.8;
        }
        if( v instanceof  Truck)
            return  v.getValue()*0.9;
        return  v.getValue();
    }
}
