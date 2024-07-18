package structural.proxy.myproxy;

public class Client {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Изображение загружается только при первом вызове display
        System.out.println("First call to display image1:");
        image1.display();

        System.out.println("\nSecond call to display image1:");
        image1.display();

        System.out.println("\nFirst call to display image2:");
        image2.display();
    }
}
