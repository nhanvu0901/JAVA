import java.text.DecimalFormat;

public class Galllery {
    public static void main(String[] args) {
       ArtWork[] works = new ArtWork[5];
       works[0] = new ArtWork(500, "Magnolias and Irises",
               "Louis Comfort Tiffany", 500000, 2001);
       works[1] = new Paintings(650, "The Scream", "Edvard Munch",
               104000000, 2004, 91, 73.5,
               "German Expressionism");
        works[2] = new Paintings(680, "Blue Poles: Number 11",
                "Jackson Pollock", 1300000, 1973,
                212.9, 488.9, "Abstract Expressionism" );
        works[3] = new Sculpture(700, "The David", "Michelangelo",
                1000000000, 2006, 6000, "Marble");
        works[4] = new Sculpture(720, "Bust of Victor Hugo",
                "Auguste Rodin", 500000, 2000, 2,
                "Bronze");


        double totalInsuranceValue = 0;
        double totalInsurancePremium = 0;
        for (int i = 0; i < works.length; i++) {
            works[i].show();
          totalInsuranceValue += works[i].getInsuranceValue();
          totalInsurancePremium += works[i].getInsurancePremium();
        }
        DecimalFormat moneyFormat = new DecimalFormat("0.##");
        System.out.println("---------------------------------");
        System.out.println("Collection Value: $" +
                moneyFormat.format(totalInsuranceValue));
        System.out.println("Total Premium:    $" +
                moneyFormat.format(totalInsurancePremium));
    }
}
