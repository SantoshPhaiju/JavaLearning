package Game;

class Territory {
    private String name;
    private boolean isCaptured;

    public Territory(String name) {
        this.name = name;
        this.isCaptured = false;
    }

    // Method to conquer the territory
    public void conquer() {
        this.isCaptured = true;
        System.out.println(this.name + " has been conquered!");
    }

    // Getter for the name
    public String getName() {
        return this.name;
    }

    public boolean isCaptured() {
        return this.isCaptured;
    }
}

