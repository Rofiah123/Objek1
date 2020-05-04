public class Main {
    public static void main(String[] args) {
        //instance
        Worm player1 = new Worm();
        Worm player2 = new Worm();

        player1.userName = "Fiah";
        player1.score = 700;
        player1.lenght = 3.5;

        player2.userName = "Fia";
        player2.score = 300;
        player2.lenght = 3.5;

        player1.eatSnack();

        System.out.println(player1.score);
        player1.eatOthers(player2);
        System.out.println(player1.score);

    }
}
