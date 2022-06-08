import java.util.Date;

public class MainGenerica {
    public static void main(String[] args) {
        double suma, resta, multip, div = 0;

        System.out.println("------------Operaciones con tipo Integer-------------");
        Calculadora<Integer> calc1 = new Calculadora<Integer>(10, 20);
        suma = calc1.getSuma();
        System.out.println("Suma: 10 + 20 = " + suma);
        resta = calc1.getResta();
        System.out.println("Resta: 10 - 20 = " + resta);
        multip = calc1.getMultiplicacion();
        System.out.println("Multiplicacion: 10 * 20 = " + multip);
        div = calc1.getDivision();
        System.out.println("Division: 10 / 20 = " + div);

        System.out.println("\n------------Operaciones con tipo Double-------------");
        Calculadora<Double> calc2 = new Calculadora<Double>(5.0, 0.0);
        suma = calc2.getSuma();
        System.out.println("Suma: 5.0 + -1.5 = " + suma);
        resta = calc2.getResta();
        System.out.println("Resta: 5.0 - -1.5 = " + resta);
        multip = calc2.getMultiplicacion();
        System.out.println("Multiplicacion: 5.0 * -1.5 = " + multip);
        div = calc2.getDivision();
        System.out.println("Division: 5.0 / -1.5 = " + div);

        System.out
                .println("\n------------Operaciones con tipo String u Objetos de clases creadas u otros-------------");
        Calculadora<Double> calc3 = new Calculadora<Double>();
        div = calc3.getDivision();
        System.out.println("Division: null  / null = " + div);
        // calc3.setNumberA("1");
        // Calculadora<String> calc4 = new Calculadora<String>();
        // Calculadora<Dog> calc5 = new Calculadora<Dog>();
    }
}