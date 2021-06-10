package animalsound;

/**
 *
 * @author SatriaYudha
 */
class animal{
    public void animalsound(){
        System.out.println("default sound");
    }
}

public class Animalsound extends animal{

    /**
     *
     */
    @Override
    public void animalsound(){
        System.out.println("woof");
    }

    public static void main(String[] args) {
        animal obj = new Animalsound();
        obj.animalsound();
     
        // TODO code application logic here
    }
}