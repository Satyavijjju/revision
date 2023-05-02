package array;

public class ArraySample {
    public static void main(String args[]) {

        int[] num = {1,2,3,4,5};
        System.out.println(num[1]);
        String[] car = {"accura","audi","benz","tesla"};
        car[0] = "bmw";
        System.out.println(car[0]);
        //int i;

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
       }
       /* for (type variable : arrayname) {
  ...
        }*/
        String[] name = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String b : name) {
            System.out.println(b);
        }
        String[] str = {"satya","srihaas","Reyansh","Vijay"};
        str[0]="Satya";
        System.out.println(str[0]);
       
    }
}
