package Game;

import java.util.ArrayList;

class Army {
    private ArrayList<Soldier> soldiers;

    public Army() {
        this.soldiers = new ArrayList<>();
    }

    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);
    }

    public void attack(Army enemyArmy) {
        for (int i = 0; i < this.soldiers.size(); i++) {
            if (i < enemyArmy.soldiers.size()) {
                this.soldiers.get(i).attack(enemyArmy.soldiers.get(i));
            }
        }
    }

    public boolean hasLivingSoldiers() {
        for (Soldier soldier : soldiers) {
            if (soldier.getHealth() > 0) {
                return true;
            }
        }
        return false;
    }
}

