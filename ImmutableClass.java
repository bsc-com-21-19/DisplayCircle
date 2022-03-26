final class Immutable{
    private String name;
    private int age;
    Immutable(String name ,int age){
        this.name=name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
public class ImmutableClass{
    public static void main(String[] args){
        Immutable immut = new Immutable( "madalitso" , 12);
        System.out.println(" My name is " + immut.getName());
        System.out.println(" and my age is  " + immut.getAge());
    }
}