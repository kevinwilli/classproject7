package edu.guilford;

import java.util.Random;

public class Animal implements Comparable<Animal> {

    // attributes
    private String name;
    private String species;
    private int age;
    Random rand = new Random();

    //constructor with all the animal attributes
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }


    // constructor
    public Animal() {
        // create an array of strings with names
        String[] names = { "Fido", "Rover", "Spot", "Rex", "Buddy", "Duke", "Max", "Jack", "Cooper", "Rocky", "Bear",
                "Tucker", "Oliver", "Bentley", "Teddy", "Milo", "Buster", "Leo", "Winston", "Murphy", "Lucky", "Oscar",
                "Louie", "Zeus", "Henry", "Sam", "Harley", "Baxter", "Gus", "Sammy", "Jackson", "Bruno",
                "Diesel", "Jax", "Gizmo", "Bandit", "Rusty", "Marley", "Jasper", "Brody", "Roscoe", "Hank", "Otis",
                "Bo", "Joey", "Beau", "Ollie", "Tank", "Shadow", "Peanut", "Hunter", "Scout", "Blue", "Rocco", "Simba",
                "Tyson", "Ziggy", "Boomer", "Riley", "Chico", "Thor", "Romeo", "Luke", "George", "Loki", "Moose",
                "Benny", "Samson", "Cody", "Chester", "Prince", "Chance", "Kobe", "Chase", "Oreo", "Frankie", "Mac",
                "Benji", "Bubba", "Brutus", "Copper", "Cash", "Archie", "Walter", "Dexter", "Red", "King", "Jojo",
                "Bruce", "Rudy", "Koda", "Bruno", "Scooter", "Bailey", "Hudson", "Champ", "Boone", "Bruno", "Oakley",
                "Coco", "Otto", "Lou", "Zuko", "Lenny", "Coco", "Apollo", "Ace", "Lucky", "Benny", "Thor", "Rufus",
                "Carter", "Remy", "Roscoe", "Rocco", "Beau", "Thor", "Zeus", "Benji", "Chance", "Ranger", "Moose",
                "Maverick", "Sammy", "Samson", "Brody", "Romeo", "Leo", "Hank" };
        // create an array of strings with species
        String[] species = { "Dog", "Cat", "Bird", "Fish", "Snake", "Lizard", "Turtle", "Hamster", "Guinea Pig",
                "Rabbit", "Ferret", "Mouse", "Rat", "Hedgehog", "Chinchilla", "Sugar Glider", "Hermit Crab", "Gerbil",
                "Pot Bellied Pig", "Chicken", "Goat", "Horse", "Donkey",
                "Cow", "Sheep", "Duck", "Goose", "Pigeon", "Parrot", "Parakeet", "Cockatiel", "Frog", "Toad",
                "Salamander", "Newt", "Axolotl", "Tarantula", "Scorpion", "Millipede", "Centipede", "Crab", "Lobster",
                "Shrimp", "Crayfish", "Octopus", "Squid", "Snail", "Slug", "Bee",
                "Wasp", "Ant", "Butterfly", "Moth", "Ladybug", "Beetle", "Caterpillar", "Praying Mantis",
                "Walking Stick", "Dragonfly", "Grasshopper", "Cricket", "Fly", "Mosquito", "Flea", "Tick", "Spider",
                "Firefly", "Cicada", "Roach", "Termite", "Silverfish", "Earwig", "Worm",
                "Leech", "Slug", "Snake", "Lizard", "Turtle", "Frog", "Toad", "Salamander", "Newt", "Axolotl",
                "Tarantula", "Scorpion", "Millipede", "Centipede", "Crab", "Lobster", "Shrimp", "Crayfish", "Octopus",
                "Squid", "Snail", "Slug", "Bee", "Wasp", "Ant", "Butterfly", "Moth",
                "Ladybug", "Beetle", "Caterpillar", "Praying Mantis", "Walking Stick", "Dragonfly", "Grasshopper",
                "Cricket", "Fly", "Mosquito", "Flea", "Tick", "Spider", "Firefly", "Cicada", "Roach", "Termite",
                "Human" };
        // set the name to a random name from the names array
        this.name = names[rand.nextInt(names.length)];
        // this.name = "unknown";
        // set species to the user's choice

        // this.species = "unknown";
        // generate a random number between 0 and 99
        int randomNum = rand.nextInt(100);
        // set this.age to the random number
        this.age = randomNum;
        // set the species to a random species from the species array
        this.species = species[rand.nextInt(species.length)];
    }

    // //constructor
    // public Animal(String name, String species, int age) {
    // this.name = name;
    // this.species = species;
    // this.age = age;
    // }

    // getters and setters
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
    // methods

    // create LifeStatus method that generate randomly the animal is alive or dead
    public String LifeStatus() {
        String[] lifeStatus = { "Alive", "Dead" };
        return lifeStatus[rand.nextInt(lifeStatus.length)];
    }

    // toString

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age + "\'" + "LifeStatus=" + LifeStatus() + '\'' +
                '}';
    }
    //add a compare to method to compare first the name, then the species, then the age
    @Override
    public int compareTo(Animal animal) {
        int compareName = this.name.compareTo(animal.name);
        if (compareName == 0) {
            int compareSpecies = this.species.compareTo(animal.species);
            if (compareSpecies == 0) {
                return this.age - animal.age;
            }
            return compareSpecies;
        }
        return compareName;

       

    }
    

}
