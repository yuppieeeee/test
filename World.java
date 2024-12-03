public class World{

public static void main (String[] args){

System.out.println("Hello World");
System.out.println("Das Ergebnis lautet: " + addition(1,2));

//call multiplikation function
System.out.println("Die multilikation lautet: " + multilikation(3,10));
// Testkommentar
}

public static int addition(int x, int y){
    return x+y;
}

public static int multiplikation(int x, int y) {
    //multiply two numbers
    return x * y;
}

}
