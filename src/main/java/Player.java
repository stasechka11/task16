public class Player {
    int id;
    String name;
    int Strength;

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        Strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return Strength;
    }
}
