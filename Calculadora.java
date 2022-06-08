
public class Calculadora<T extends Number> {
    // atributes
    private T numberA;
    private T numberB;

    // constructors
    public Calculadora(T numberA, T numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public Calculadora() {
        this.numberA = null;
        this.numberB = null;
    }

    // setters and getters
    public T getNumberA() {
        return numberA;
    }

    public void setNumberA(T numberA) {
        this.numberA = numberA;
    }

    public T getNumberB() {
        return numberB;
    }

    public void setNumberB(T numberB) {
        this.numberB = numberB;
    }

    // methods
    public double getSuma(T valueA, T valueB) {
        double result = valueA.doubleValue() + valueB.doubleValue();

        return result;
    }

    public double getSuma() {
        if (numberA == null && numberB == null) {
            return 0;
        } else {
            return numberA.doubleValue() + numberB.doubleValue();
        }

    }

    public double getResta(int valueA, int valueB) {
        return valueA - valueB;
    }

    public double getResta() {
        if (numberA == null && numberB == null) {
            return 0;
        } else {
            return numberA.doubleValue() - numberB.doubleValue();
        }
    }

    public double getMultiplicacion(int valueA, int valueB) {
        return valueA * valueB;
    }

    public double getMultiplicacion() {
        if (numberA == null && numberB == null) {
            return 0;
        } else {
            return numberA.doubleValue() * numberB.doubleValue();
        }
    }

    public double getDivision(int valueA, int valueB) {
        if (valueB == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            return valueA / valueB;
        }
    }

    public double getDivision() {

        if (numberA == null && numberB == null) {
            return 0;
        } else {
            if (numberB.doubleValue() == 0) {
                System.out.println("No se puede dividir por 0");
                return 0;
            } else {
                return numberA.doubleValue() / numberB.doubleValue();
            }
        }
    }
}
