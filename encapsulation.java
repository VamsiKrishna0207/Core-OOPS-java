public class encapsulation {
    public static void main(String[] args) {
        Amazon customer =new Amazon();//1
        float payableAmount=customer.Transcation(1000);//2
        System.out.println("Total Payable " + payableAmount);
    }
}
class Amazon{
    float Transcation(float amt){//3
        Gpay gpayobj=new Gpay();//4
        gpayobj.setTaxcharge(0.07f);//5
        float totalAmount=amt+(amt*gpayobj.getTaxcharge());
        return totalAmount;
    }
}
class Gpay {
    private float taxcharge = 0.05f;

    public void setTaxcharge(float newCharge) {//6

        if (newCharge <= 0.05f) {
            System.out.println("Invalid TaxCharge");
            return;
        }
        taxcharge = newCharge;
    }


    public float getTaxcharge(){
        return taxcharge;
    }
}