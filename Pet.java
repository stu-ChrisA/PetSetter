public class Pet
{
    private String name;
    private String age;
    private double weight;
    private String type;
    private String breed;

    public Pet()
    {
        name = "jimmy";
        age = "5";
        weight = 50.4;
        type = "dog";
        breed = "golden retriever";
    }
    public Pet(String initName, String initAge, double initWeight, String initType, String initBreed)
    {
        name = initName;
        age = initAge;
        weight = initWeight;
        type = initType;
        breed = initBreed;
    }
    public String getName()
    {
        return name;
    }
    public String getAge()
    {
        return age;
    }
    public double getWeight()
    {
        return weight;
    }
    public String getType()
    {
        return type;
    }
    public String getBreed()
    {
        return breed;
    }

    public String toString()
    {
        return "name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nType: " + type + "\nBreed: " + breed;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setAge(String a)
    {
        age = a;
    }
    public void setWeight(double w)
    {
        weight = w;
    }
    public void setType(String t)
    {
        type = t;
    }
    public void setBreed(String b)
    {
        breed = b;
    }
    
}
