public class pigdice {

    // Game loop
    int currentPlayerIndex = 0;
    int turnScore = 0;
    boolean gameOver = false;
        while (!gameOver) {
        // Roll the dice
        int roll = (int)(Math.random() * 6) + 1;
        // Update turn score
        if (roll == 1) {
            turnScore = 0;
            System.out.println(players[currentPlayerIndex] + " rolled a 1. Turn over.");
            currentPlayerIndex = (currentPlayerIndex + 1) % 2;
        } else {
            turnScore += roll;
            System.out.println(players[currentPlayerIndex] + " rolled a " + roll + ".");
            System.out.println("Turn score: " + turnScore);
            System.out.print("Roll again? (y/n) ");
            String rollAgain = input.nextLine();
            if (rollAgain.toLowerCase().equals("n")) {
                scores[currentPlayerIndex] += turnScore;
                turnScore = 0;
                System.out.println(players[currentPlayerIndex] + "'s turn over. Score: " + scores[currentPlayerIndex]);
                currentPlayerIndex = (currentPlayerIndex + 1) % 2;
            }
        }
    }
}
