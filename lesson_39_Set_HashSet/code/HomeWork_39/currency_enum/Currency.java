package HomeWork_39.currency_enum;
/*. Create an enum with currency codes and their current exchange rates to the euro. Make sure that there are no duplicate currency codes in the list. Output the list of currencies and their rates to the screen. Implement the ability for the user to select the desired currency, enter its quantity, and find out how much he will receive when exchanging it for euros.*/
public enum Currency {

    RUB("Russian Ruble",106.2,1),USD("US Dollar",1.0929,2),GBP("British Pound",0.8387,3),	INR("Indian Rupee",91.9359,4),AUD("Australian Dollar",1.6470,5),JPY("Japanese Yen",165.74,6),CNY("Chinese Yuan",7.7645,7),	BRL("Brazilian Real",	6.2848,8), TRY("LiraTurkish",		37.5163,9),SEK("Swedish Krona",		11.7012,10);

    ;

    //fields
   private  String nameCurrency;
   private double rate;  //to Euro
   private int choice;

    Currency(String nameCurrency, double rate, int choice) {
        this.nameCurrency = nameCurrency;
        this.rate = rate;
        this.choice = choice;
    }

    public String getNameCurrency() {
        return nameCurrency;
    }

    public double getRate() {
        return rate;
    }

    public int getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("").append(nameCurrency).append('\'');
        sb.append(", rate=").append(rate);
        sb.append(", choice=").append(choice);
        sb.append('}');
        return sb.toString();
    }


}
