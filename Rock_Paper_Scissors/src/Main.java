import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO:
        // Separate the program in functions
        // Maybe make player choose language: spanish or english

        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean input = false;

        System.out.println("Please choose your language / Por favor elija el idioma: " +
                "\n1) English \n2) Español");

        while (!input){
            input = true;

            try {
                option = sc.nextInt();
                while (option != 1 && option!=2){
                    System.out.println("The input is invalid, please choose again / " +
                            "Lo que ha ingresado es incorrecto, por favor ingrese entre: " +
                            "\n1) English \n2) Español");
                    option = sc.nextInt();
                }

            } catch (Exception e){
                System.out.println("The input is invalid, please choose again / " +
                        "Lo que ha ingresado es incorrecto, por favor ingrese entre: " +
                        "\n1) English \n2) Español");
                sc.next();
                input = false;
            }
        }
        if (option == 1)
            gameEnglish();
        else
            juegoEspañol();









    }

    public static void gameEnglish(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean continue_playing =false;
        boolean input = false;

        // Asking player if he wants to start the game or exit.

        System.out.println("Select 1 or 2: " + "\n1) Start Game" + "\n2) Exit Game");

        while (!input) {

            try {
                option = sc.nextInt();
                input = true;

                while (option != 1 && option != 2) {
                    System.out.println("You selected a number that isn't on the menu, please choose between:" +
                            " \n1) Start Game  \n2) Exit Game");
                    option = sc.nextInt();
                }
            } catch (Exception e) {
                input = false;
                System.out.println("Your input was invalid, please choose between: \n1) Start Game  \n2) Exit Game");
                sc.next();
            }
        }

        // If player wants to play, now he must choose between Rock Paper Scissors

        if (option == 1){
            continue_playing = true;
        }

        while (continue_playing) {
            input = false;

            System.out.println("Choose: " + "\n1) Rock" + "\n2) Paper" + "\n3) Scissors");
            while (!input){

                try {
                    option = sc.nextInt();
                    input = true;

                    while (option != 1 && option != 2 && option !=3) {
                        System.out.println("You selected a number that isn't on the menu, please choose" +
                                " between: \n1) Rock" + "\n2) Paper" + "\n3) Scissors");
                        option = sc.nextInt();

                    }
                } catch (Exception e){
                    input = false;
                    System.out.println("Your input was invalid, please choose between: " +
                            "\n1) Rock" + "\n2) Paper" + "\n3) Scissors");
                    sc.next();
                }

            }

            // Generating what the computer is going to choose

            double randomNumber = Math.random() / Math.nextDown(1.0);
            int computer = (int) (1 * (1.0 - randomNumber) + 4 * randomNumber);

            // Results of the game:

            switch (option) {
                case 1 -> {
                    if (computer == 1)
                        System.out.println("Its a DRAW!");
                    if (computer == 2)
                        System.out.println("The computer picked Paper, you LOSE!");
                    if (computer == 3)
                        System.out.println("The computer picked Scissors, you WON!");
                }
                case 2 -> {
                    if (computer == 1)
                        System.out.println("The computer picked Rock, you WON!");
                    if (computer == 2)
                        System.out.println("Its a DRAW!");
                    if (computer == 3)
                        System.out.println("The computer picked Scissors, you LOSE!");
                }
                case 3 -> {
                    if (computer == 1)
                        System.out.println("The computer picked Rock, you LOSE!");
                    if (computer == 2)
                        System.out.println("The computer picked Paper, you WON!");
                    if (computer == 3)
                        System.out.println("Its a DRAW!");
                }
            }

            // Asking if the player wants to continue playing

            System.out.println("\nWould you like to continue playing?" + "\n1) Yes \n2) No");

            input = false;
            while (!input) {
                input = true;

                try {
                    option = sc.nextInt();

                    while (option != 1 && option != 2){
                        System.out.println("You selected a number that isn't on the menu, please choose between:" +
                                "\n1) Continue playing" + "\n2) Exit game");
                        option = sc.nextInt();
                    }
                } catch (Exception e) {
                    input = false;
                    System.out.println("Your input was invalid, please choose between: " +
                            "\n1) Continue playing" + "\n2) Exit game");
                    sc.next();
                }

                if (option == 1)
                    continue_playing = true;
                else
                    continue_playing = false;
            }
        }

        System.out.println("You exited the game");

    }

    public static void juegoEspañol(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean continue_playing =false;
        boolean input = false;

        // Asking player if he wants to start the game or exit.

        System.out.println("Seleccione 1 o 2: " + "\n1) Jugar" + "\n2) Salir del Juego");

        while (!input) {

            try {
                option = sc.nextInt();
                input = true;

                while (option != 1 && option != 2) {
                    System.out.println("Ha seleccionado un numero invalido, por favor elija entre: " +
                            " \n1) Jugar  \n2) Salir del juego");
                    option = sc.nextInt();
                }
            } catch (Exception e) {
                input = false;
                System.out.println("La entrada es invalida, por favor elija entre: \n1) Jugar  \n2) Salir del juego");
                sc.next();
            }
        }

        // If player wants to play, now he must choose between Rock Paper Scissors

        if (option == 1){
            continue_playing = true;
        }

        while (continue_playing) {
            input = false;

            System.out.println("Elija: " + "\n1) Roca" + "\n2) Papel" + "\n3) Tijera");
            while (!input){

                try {
                    option = sc.nextInt();
                    input = true;

                    while (option != 1 && option != 2 && option !=3) {
                        System.out.println("Ha seleccionado un numero invalido, por favor elija entre:" +
                                "\n1) Roca" + "\n2) Papel" + "\n3) Tijera");
                        option = sc.nextInt();

                    }
                } catch (Exception e){
                    input = false;
                    System.out.println("La entrada es invalida, por favor elija entre: " +
                            "\n1) Roca" + "\n2) Papel" + "\n3) Tijera");
                    sc.next();
                }

            }

            // Generating what the computer is going to choose

            double randomNumber = Math.random() / Math.nextDown(1.0);
            int computer = (int) (1 * (1.0 - randomNumber) + 4 * randomNumber);

            // Results of the game:

            switch (option) {
                case 1 -> {
                    if (computer == 1)
                        System.out.println("Es un EMPATE!");
                    if (computer == 2)
                        System.out.println("La PC a elejido Papel, has PERDIDO!");
                    if (computer == 3)
                        System.out.println("La PC a elejido tijera, has GANADO!");
                }
                case 2 -> {
                    if (computer == 1)
                        System.out.println("La PC a elejido Roca, has GANADO!");
                    if (computer == 2)
                        System.out.println("Es un EMPATE!");
                    if (computer == 3)
                        System.out.println("La PC a elejido Tijera, has PERDIDO!");
                }
                case 3 -> {
                    if (computer == 1)
                        System.out.println("La PC a elejido Roca, has PERDIDO!");
                    if (computer == 2)
                        System.out.println("La PC a elejido Papel, has GANADO!");
                    if (computer == 3)
                        System.out.println("Es un EMPATE!");
                }
            }

            // Asking if the player wants to continue playing



            System.out.println("\n¿Quieres seguir jugando?" + "\n1) Si \n2) No");

            input = false;
            while (!input) {
                input = true;

                try {
                    option = sc.nextInt();

                    while (option != 1 && option != 2){
                        System.out.println("Ha seleccionado un numero invalido, por favor elija entre: " +
                                "\n1) Continuar jugando" + "\n2) Salir del Juego");
                        option = sc.nextInt();
                    }
                } catch (Exception e) {
                    input = false;
                    System.out.println("La entrada es invalida, por favor elija entre: " +
                            "\n1) Continuar jugando" + "\n2) Salir del Juego");
                    sc.next();
                }

                if (option == 1)
                    continue_playing = true;
                else
                    continue_playing = false;
            }
        }

        System.out.println("Has salido del juego");
    }
}