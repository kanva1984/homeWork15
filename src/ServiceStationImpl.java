public class ServiceStationImpl implements ServiceStation {
    @Override
    public void check(Bicycle bicycle) {
        bicycle.checkWheels();
        System.out.println();
    }

    @Override
    public void check(Car car) {
        car.checkWheels();
        car.checkEngine();
        System.out.println();
    }

    @Override
    public void check(Truck truck) {
        truck.checkWheels();
        truck.checkEngine();
        truck.checkTrailer();
        System.out.println();
    }
}

