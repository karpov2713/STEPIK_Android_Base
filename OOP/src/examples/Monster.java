package examples;

public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster() {
        this(2);
    }

    Monster(int amount) {
        this(amount, amount, amount);
    }

    Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    void voice() {
        voice(1);
    }

    void voice(int count) {
        voice(count, "Grrrrrrrrrrrrrr.....");
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
