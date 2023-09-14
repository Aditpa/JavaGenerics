public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple("Green",false);
        Apple apple1 = new Apple("Red",true);
        Pear pear=new Pear("Slitly slim");

        Generic<Apple> appleGeneric=new Generic<>();
        appleGeneric.add(apple);
        appleGeneric.add(apple1);
        appleGeneric.print();
        System.out.println(appleGeneric.getWithIndex(1));

        Generic<Pear>pearGeneric=new Generic<>();

        pearGeneric.add(pear);
        pearGeneric.print();
        Generic<Object> objectGeneric=new Generic<>();
        objectGeneric.add(apple);
        Object myObj=objectGeneric.getWithIndex(0);
        System.out.println("myObj = " + myObj);
        if(myObj instanceof Apple){
            ((Apple)myObj).getAppleColor();
        }
        
    }
}
