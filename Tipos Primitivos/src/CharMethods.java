public class CharMethods {
        public char caracter;

        public char getCaracter() {
            return caracter;
        }

        public void setCaracter(char caracter) {
            this.caracter = caracter;
        }

        CharMethods(char caracter) {
            this.caracter = caracter;
        }

        public boolean ehVogal() {
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                return true;
            } else {
                return false;
            }
        }

        public boolean ehConsoante() {
            if(ehLetra() && !ehVogal())
                return true;
            else
                return false;
        }

        public boolean ehDigito() {
            if(caracter >= 48 && caracter <= 57)
                return true;
            else
                return false;
        }

        // nesse método utilizei o valor int do char e a tabela ascii
        public boolean ehLetra() {
            if (caracter >= 97 && caracter <= 122) { // a-z
                return true;
            } else if (caracter >= 65 && caracter <= 90) { // A-Z
                return true;
            } else {
                return false;
            }
        }

        public String upperCase() {
            if(ehLetra()) {
                return String.valueOf(caracter).toUpperCase();
            } else {
                return "Método só pode ser utilizado para letras";
            }
        }

    public String lowerCase() {
        if(ehLetra()) {
            return String.valueOf(caracter).toLowerCase();
        } else {
            return "Método só pode ser utilizado para letras";
        }
    }

}



