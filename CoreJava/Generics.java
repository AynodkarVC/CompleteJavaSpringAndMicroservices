package clases.CoreJava;

// use to increase code reuseibity, maintain type checking


public class Generics {
    public static void main(String[] args) {
    Myclass<Integer> obj = new Myclass<>(10);
    Myclass<Double> obj2 = new Myclass<>(10.0);
    obj.showType();
    obj2.showType();

    System.out.println(" ");

    Myclass2<Integer , Double> obj3 = new Myclass2<>(10,10.0);
    obj3.showType();

        System.out.println("  ");

    NumFunc<Integer> num = new NumFunc<>(4);
        System.out.println("Bounded Parameter  (can only use number class child) : " + num.getSquare());

    }
}
// class to intitate generics
class Myclass<T>{
    T ob;

    Myclass(T ob){
        this.ob = ob;
    }

    void showType(){
        System.out.println("single Paramter generics: " + ob.getClass().getName());
    }

}
// class with two parameter generics
class Myclass2<T, V>{
    T ob1;
    V ob2;

    Myclass2(T ob1, V ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showType(){
        System.out.println("Multi parameter Generics : "+ob1.getClass().getName());
        System.out.println("Multi parameter Generics  : " + ob2.getClass().getName());
    }
}

// generics with bounded types ie Wildcards
// use to pass
class NumFunc<T extends Number>{
    T num1;

    NumFunc(T num1){
        this.num1 = num1;
    }

    int getSquare() {
        return num1.intValue() * num1.intValue();
    }

    // Wildcards
    int getDouble(int n) {
        return 0;
    }
}
