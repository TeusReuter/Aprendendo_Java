import java.math.BigDecimal;

// polimorfismo é quando podemos usar o mesmo código em implementações diferentes.

//        INTERFACE
// inferface serve para quando há a necessidade de ter 2 sistemas conversando entre si,
// ou duas classes conversando entre si,
// ou 2 componentes
// e desejamos estabelecer um padrão de comunicação entre eles.

//      CLASSE ABSTRATA
// serve para fornecer uma estrutura de alto nível, deixando os detalhes da implementação
// para as subclasses (quando quero que todas as subclasses atendam a estrutura padrão da classe abstrata)

public class Main {


    abstract  class Animal{
        abstract void bark();
    }

    class Cat extends Animal{
        void bark() {
            System.out.println("cat");
        }
    }

    class Dog extends Animal{
        void bark() {
            System.out.println("dog");
        };
    }

    public static void main(String[] args) {


        GamingConsole[] games = {new MarioGame(), new ChessGame()};

        for (GamingConsole game: games) {
            game.up();
            game.down();
            game.left();
            game.right();
        }
//
//        Animal[] animal = {new Dog(), new Cat()};



        GamingConsole game = new MarioGame();
        game.down();
        game.left();
        game.right();


        //MarioGame game = new MarioGame();
        //ChessGame game = new ChessGame();

        //GamingConsole game = new ChessGame();


    }

}


//    Band[] b = {new Guitar(), new Bass()};
//        for(Band band: b)
//                band.play();
//
////        Animal animal = new Dog();
//                Animal animal = new Cat();
//                animal.bark();



//        // já fiz o exercício
//        Student s = new Student("Matheus", "College");
//        s.setEmail("me@m.m");
//
//        Employee e = new Employee("Matheus", "Developer");
//        e.setEmail("m@m.com");
////        e.setSalary(new BigDecimal(3000));
//        e.setPhoneNumber("123");
//        e.setEmployeeGrade("B");
//        e.setTitle("Developer");
//
////        System.out.println(e);
//        Recipe1 recipe = new Recipe1();
//        recipe.execute();
//
//        MicroWaveRecipe m = new MicroWaveRecipe();
//        m.execute();