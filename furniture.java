import java.util.logging.FileHandler;

public class furniture {
    int width;
    int height;
    void dispaly(String item){
        System.out.println(item + "Width " + width+"Height" + height);
    }

    public static void main(String[] args) {
       Chair neelkamal=new Chair();
       neelkamal.foo();
    }
}
 class Chair extends furniture{
    void foo(){
        width=10;
        height=20;
        dispaly("Chair");
    }
}
class Table extends furniture{
    void foo(){
        width=30;
        height=50;
        dispaly("Table");
    }
}
class Almira extends furniture{
    void foo(){
        width=90;
        height=34;
        dispaly("Almira");
    }

}
