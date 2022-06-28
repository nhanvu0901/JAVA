public class ArtWork {
      private int catalougeNumber;
      private String nameOfWork;
      private String artist;
      private int value;
      private int valuationYear;


      public ArtWork(){}



    public ArtWork(int catalougeNumber, String name, String artist, int value, int valuationYear) {
        this.catalougeNumber = catalougeNumber;
        this.nameOfWork = name;
        this.artist = artist;
        this.value = value;
        this.valuationYear = valuationYear;
    }

    public int getCatalougeNumber() {
        return catalougeNumber;
    }

    public void setCatalougeNumber(int catalougeNumber) {
        this.catalougeNumber = catalougeNumber;
    }

    public String getName() {
        return nameOfWork;
    }

    public void setName(String name) {
        this.nameOfWork = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValuationYear() {
        return valuationYear;
    }

    public void setValuationYear(int valuationYear) {
        this.valuationYear = valuationYear;
    }

    public double getInsuranceValue(){
          int yearSinceValuation = 2021 - valuationYear;
          double inSuranceValue = value;
          for (int i = 0; i < yearSinceValuation; i++) {
              inSuranceValue *= 1.05;
        }
          return inSuranceValue;
    }
    public double getInsurancePremium(){
          double insurancePremium = getInsuranceValue() * 0.1;
          return insurancePremium;
    }
    public void show(){

    }

}
