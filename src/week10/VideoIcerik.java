package week10;

public class VideoIcerik {
    String isim;
    int sureDk;

    public void izle() {
        System.out.println(isim + " adli icerik oynatiliyor... Lutfen bekleyiniz." );
    }
}
class Film extends VideoIcerik{
    String yonetmen;
}
class Main {
    static void main(String[] args) {
        Film film1 = new Film();

        film1.isim = "The Matrix";
        film1.yonetmen = "Wachowski Sisters";
        film1.sureDk = 136;
        film1.izle();

        System.out.println("Yonetmen: " + film1.yonetmen);
        System.out.println("Sure: " + film1.sureDk);
    }
}

