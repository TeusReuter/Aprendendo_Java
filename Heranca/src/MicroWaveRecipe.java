public class MicroWaveRecipe extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get the materials");
        System.out.println("Switch that shit on");
    }

    @Override
    void doTheDish() {
        System.out.println("Get it done");
    }

    @Override
    void cleanup() {
        System.out.println("Switch off");
        System.out.println("Cleanup the mess");
    }
}
