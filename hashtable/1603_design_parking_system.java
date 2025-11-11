class ParkingSystem {
    public HashMap<Integer, Integer> spaces = new HashMap<>();

    public ParkingSystem(int big, int medium, int small) {
        spaces.put(1, big);
        spaces.put(2, medium);
        spaces.put(3, small);
    }
    
    public boolean addCar(int carType) {
        int availableSpaces = spaces.get(carType);

        if (availableSpaces > 0) {
            spaces.put(carType, availableSpaces - 1);
            return true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
