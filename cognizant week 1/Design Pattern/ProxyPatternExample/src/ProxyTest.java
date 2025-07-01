public class ProxyTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("cat.png");
        Image image2 = new ProxyImage("dog.png");

        System.out.println("First time loading cat.png:");
        image1.display(); // loads from server

        System.out.println("\nSecond time displaying cat.png:");
        image1.display(); // uses cached RealImage

        System.out.println("\nNow loading dog.png:");
        image2.display(); // loads from server
    }
}
