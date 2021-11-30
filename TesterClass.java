public class TesterClass
{
    public static void main(String [] args)
    {
        Pet one = new Pet();
        System.out.println(one.getName());
        System.out.println();
        System.out.print(one.toString());
        Pet two = new Pet("bunny","2",9.5,"dog","chihuahua");
        System.out.println();
        System.out.println(two.getWeight());
        System.out.println();
        System.out.print(two.toString());
        two.setName("Snow");
        two.setAge("7");
        two.setWeight(12.3);
        two.setType("cat");
        two.setBreed("black cat");
        System.out.println("\n");
        System.out.print(two.toString());

        
    }
}