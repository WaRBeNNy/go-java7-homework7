package behavioral.iterator;

public class Garage {
    private String name;
    private String[] cars;

    public Garage(String name, String[] cars) {
        this.name = name;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCars() {
        return cars;
    }

    public void setCars(String[] cars) {
        this.cars = cars;
    }

    public Iterator getIteratir() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < cars.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return cars[index++];
        }
    }
}

