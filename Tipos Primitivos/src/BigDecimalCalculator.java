import java.math.BigDecimal;
public class BigDecimalCalculator {
    BigDecimal firstValue;
    BigDecimal secondValue;

    BigDecimalCalculator(String firstValue, String secondValue) {
        this.firstValue = new BigDecimal(firstValue);
        this.secondValue = new BigDecimal(secondValue);
    }

    public BigDecimal getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(BigDecimal firstValue) {
        this.firstValue = firstValue;
    }

    public BigDecimal getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(BigDecimal secondValue) {
        this.secondValue = secondValue;
    }

    public BigDecimal sumOperation() {
        return this.firstValue.add(this.secondValue);
    }

    public BigDecimal multiplication() {
        return this.firstValue.multiply(this.secondValue);
    }

    public BigDecimal division() {
        return this.firstValue.divide(this.secondValue);
    }

    public BigDecimal subtraction() {
        return this.firstValue.subtract(this.secondValue);
    }

    public void tabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + firstValue + " = " + firstValue.multiply(BigDecimal.valueOf(i)));
        }
    }
}
