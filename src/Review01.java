
public class Review01 {

    public static void main(String[] args) {
        int price = 1500; // 商品価格
        int tax = tax(price); // 消費税価格
        int taxIncludedPrice = price + tax; // 税込価格

    System.out.println(price + "円の商品の税込価格は" + taxIncludedPrice + "円(消費税は" + tax + "円)です");
    }

    static int tax(int price) {
        return price * 10 / 100;
    }

    }

