package HomeWork_23.primerNumber;

import java.util.Objects;

public class PrimerNumber {


    int primer;


    public PrimerNumber(int primer) {
        this.primer = primer;
    }

    public boolean  isPrimerValid (int primer){
       if(primer<=1 ){
        return false;}
      if (primer == 2) {
            return true;
        }
        if (primer % 2==0){ return false;}
        return true;
    }
        //getter and Setter
    public int getPrimer() {
        return primer;
    }

    public void setPrimer(int primer) {
       if(isPrimerValid(primer)){
           this.primer=primer;
       }else{
           System.out.println(" number " + primer+ " is not prime ");
       }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrimerNumber that)) return false;
        return primer == that.primer;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(primer);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PrimerNamber{");
        sb.append("primer=").append(primer);
        sb.append('}');
        return sb.toString();
    }
}//end of class
