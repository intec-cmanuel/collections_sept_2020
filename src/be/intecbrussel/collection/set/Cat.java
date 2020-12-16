package be.intecbrussel.collection.set;

import java.util.Objects;

public class Cat {
    private String name;
    private int lives = 9;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void die() {
        lives--;
    }

    @Override
    public String toString() {
        return String.format("Victim of Class %s is named %s and has %d lives.", this.getClass().getSimpleName(), name, lives);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lives);
    }
}
