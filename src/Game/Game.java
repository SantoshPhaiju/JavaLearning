package Game;

import java.util.*;

class Game {
    private Army playerArmy;
    private Army enemyArmy;
    private ArrayList<Territory> map;
    private Scanner scanner;

    public Game() {
        playerArmy = new Army();
        enemyArmy = new Army();
        map = new ArrayList<>();
        scanner = new Scanner(System.in);

        // Initialize territories (countries or palaces)
        map.add(new Territory("Kingdom of Solan"));
        map.add(new Territory("Palace of Agra"));
        map.add(new Territory("Empire of Raj"));

        // Initialize Armies
        playerArmy.addSoldier(new Soldier("Rajput Warrior", 100, 25, 10));
        enemyArmy.addSoldier(new Soldier("Mughal Soldier", 80, 20, 15));
    }

    public void startBattle() {
        System.out.println("Battle Started!\n");

        // Turn-based battle between the player and enemy
        while (playerArmy.hasLivingSoldiers() && enemyArmy.hasLivingSoldiers()) {
            System.out.println("\nPlayer's Turn: Choose an action");
            System.out.println("1. Attack Enemy Army");
            System.out.println("2. View Map");
            System.out.println("3. Conquer Territory");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    playerArmy.attack(enemyArmy);
                    break;
                case 2:
                    displayMap();
                    break;
                case 3:
                    conquerTerritory();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            if (enemyArmy.hasLivingSoldiers()) {
                System.out.println("\nEnemy's Turn: Enemy is attacking!");
                enemyArmy.attack(playerArmy);
            }

            System.out.println("----- End of Round -----");
        }

        // Declare Winner
        if (playerArmy.hasLivingSoldiers()) {
            System.out.println("\nCongratulations! Player's army won the battle!");
        } else {
            System.out.println("\nGame Over! Enemy's army won the battle.");
        }
    }

    // Method to conquer a territory
    public void conquerTerritory() {
        // Simple mechanism to conquer territory
        for (Territory t : map) {
            if (!t.isCaptured()) {
                t.conquer();
                break;  // Only conquer one at a time
            }
        }
    }

    // Method to display current map status
    public void displayMap() {
        System.out.println("\n--- Map of Territories ---");
        for (Territory t : map) {
            System.out.println(t.getName() + " - " + (t.isCaptured() ? "Captured" : "Not Captured"));
        }
    }

    // Main method to start the game
    public static void main(String[] args) {
        Game game = new Game();
        game.startBattle();
    }
}
