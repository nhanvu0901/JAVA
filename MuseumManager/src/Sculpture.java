public class Sculpture extends ArtWork {
    private double weight;
    private String material;

    public Sculpture(int catalougeNumber, String name, String artist, int value, int valuationYear, double weight, String material) {
        super(catalougeNumber, name, artist, value, valuationYear);
        this.weight = weight;
        this.material = material;
    }

    @Override
    public double getInsurancePremium() {
        double value = super.getInsurancePremium();
        if (weight > 1000){
            value *= 0.8;
        }
        return value;
    }

    @Override
    public void show() {
        System.out.println("The sculpture "+getName()+" weight: "+weight+" kg");
        System.out.println("The sculpture "+getName()+" made  of " + material);
    }


}

