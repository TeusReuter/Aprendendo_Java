public class Fan {

    public double radius;
    public String color;
    public boolean isOn;
    public int speed;

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Fan(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void switchOn() {
        if(this.isOn == false) {
            this.isOn = true;
        } else {
            System.out.println("The fan is already on!");
        }
    }

    public void switchOff() {
        if(this.isOn == true) {
            this.isOn = false;
        } else {
            System.out.println("The fan is already off!");
        }
    }

    public void changeSpeed(int speed) {
        if(speed >= 0 && isOn == true) {
            this.speed += speed;
        } else {
            System.out.println("Não foi possível aumentar a velocidade!");
        }
    }

    public String print() {
        return String.format("radius - %f , color - %s , isOn - %b speed - %d", radius, color, isOn, speed);
    }
}
