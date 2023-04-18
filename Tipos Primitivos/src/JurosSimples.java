import java.math.BigDecimal;

public class JurosSimples {
    public BigDecimal capital;
    public BigDecimal taxa;
    JurosSimples(String capital, String taxa) {
        this.capital = new BigDecimal(capital);
        this.taxa = new BigDecimal(taxa).divide(new BigDecimal(100));
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public void setTaxa(BigDecimal taxa) {
        this.taxa = taxa;
    }

    public BigDecimal calculaJuroSimples(int anos) {
        BigDecimal anosEmBigDecimal = new BigDecimal(anos);
        BigDecimal valorTotal =
                capital.add(
                capital.multiply(taxa)
                .multiply(anosEmBigDecimal));
         return valorTotal;
    }
}
