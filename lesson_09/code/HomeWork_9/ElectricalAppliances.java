package HomeWork_9;

//Anna uses various electrical appliances in her home. She has a refrigerator that consumes 150 W, and an air conditioner that consumes 2000 W.
//Anna wants to know how much she spends on electricity per month if the cost of 1 kWh is 0.15 euros.
//  Questions: How much electricity do the refrigerator and air conditioner consume together per hour?
//  (calculateHourlyConsumption) How much does Anna spend on electricity per month? (calculateMonthlyCost)

//Анна использует различные электроприборы в своем доме. У неё есть холодильник, который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт.
//Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч составляет 0.15 евро.
// Вопросы: Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption)
//Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)

public class ElectricalAppliances {
    public static void main(String[] args) {
        int refrigerator = 150; //Watt
        int conditioner = 2000; //watt
        double basisPriceEnergie = 0.15; //1 kBt*Hour

        double refAndCond = calculateHourlyConsumption(refrigerator, conditioner);
        System.out.println("Consumption per hour:" + refAndCond + " kBt*h ");

        double monatPriceEnergie = monatPriceEnergie(refAndCond, basisPriceEnergie);
        System.out.println("Anna spends on electricity per month " + monatPriceEnergie);

    }//End of main


    private static double calculateHourlyConsumption(int refrigerator, int conditioner) {
        double hour = (refrigerator + conditioner) / 1000;//the refrigerator and air conditioner consume together per hour
        return hour;
    }

    private static double monatPriceEnergie(double refAndCond, double basisPriceEnergie) {
        int resMonat = 24 * 31;//24 hours a day * 31 days
        double consumeMonat = refAndCond * resMonat;
        return consumeMonat * basisPriceEnergie;
    }
}//end of class
