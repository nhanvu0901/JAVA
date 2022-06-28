public class Paintings extends ArtWork {
    private double width;
    private double height;
    private String style;



    public Paintings(int catalougeNumber, String name, String artist, int value, int valuationYear, double width, double height, String style) {
        super(catalougeNumber, name, artist, value, valuationYear);
        this.width = width;
        this.height = height;
        this.style = style;
    }

    @Override
    public double getInsurancePremium() {
        double insurancePremium = super.getInsurancePremium();
        if (width > 1 || height > 1){
           insurancePremium *= 0.8;
        }
        return insurancePremium;
    }
    @Override
    public void show(){
        System.out.println("A painting in the "+style+" style");
        System.out.println("     Size is " + height + "m x " + width + " m");
    }
}
