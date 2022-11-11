package day01variablepractice;

public class Practice01 {

    public static void main(String[] args) {
//Data type Variable name = value ;
        int age = 27;

        //Example: create a variable whose value is 1.99
        double priceOfShirt = 1.99;

        //Data types
        //1. integer:It is for whole numbers
// notes: When you select any data type the value must be in the range of the data type
        int populationOfGermany = 80000000;
        System.out.println(populationOfGermany);
        //NOtes:Java accepts long values a integer as a default.But if your value is a greater than maximum value of integers
        // you will get error.To fix that error you have to put "L" or "l" to end of the number.
      long populationOfTheWorld= 7000000000L;
      long populationOfChina =1400000;

      byte ageOfStudent =23;
        System.out.println(ageOfStudent);

        short populationOfTheVillage = 23000;
        System.out.println(populationOfTheVillage);


        boolean isRetired =true;
        boolean isOld = false;

        char initialOfName ='A';

       float f1 =12.99f ,f2 =5.76f ;
       short s1=12 ,s2=13, s3= 24  ;
       double d1=13, d2=123.09;
        System.out.println(f1+f2+s1+s2+s3+d1+d2);//
      char digit= 'A';
      int lostNokia=123;
        System.out.println(3+123);

        String s =  "Tom ";
        int i=12, k= 23 ;
        System.out.println(s+i+k);

    }


}
