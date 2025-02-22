package Game;

class Soldier {
    private String name;
    private int health;
    private int attackPower;
    private int defensePower;

    public Soldier(String name, int health, int attackPower, int defensePower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    // Method to attack an enemy soldier
    public void attack(Soldier enemy) {
        int damage = Math.max(0, this.attackPower - enemy.defensePower);
        enemy.takeDamage(damage);
        System.out.println(this.name + " attacks " + enemy.name + " for " + damage + " damage!");
    }

    // Method to take damage
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            System.out.println(this.name + " has been defeated!");
        }
    }

    // Getter for health
    public int getHealth() {
        return this.health;
    }
}
