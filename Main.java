class Main
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal();
        Animal.Fish myFish = new Animal.Fish();
        Animal.Zebra myZebra = new Animal.Zebra();

        myAnimal.isMammal();
        myAnimal.mate();

        myFish.canEat();

        myZebra.canRun();

    }
}




class Animal 
{
    public int age;
    public String gender;

    public void isMammal()
    {
        System.out.println("This animal is a mammal");
    }
    public void mate()
    {
        System.out.println("This animal can mate");
    }

    public static class Fish
    {
        private float sizeInFeet;

        public void canEat()
        {
            System.out.println("This fish can eat");
        }
    }

    public static class Zebra
    {
        public boolean is_wild;

        public void canRun()
        {
            System.out.println("This zebra can run");
        }
    }
}