package practice1.part4.task2;

public class TestClothes {
    public static void main(String[] args) {
        Clothes[] wardrobe = {
                new TShirt(Size.S, 19.99, "белый"),
                new Pants(Size.M, 39.99, "синий"),
                new Skirt(Size.XS, 29.99, "красный"),
                new Tie(Size.L, 14.99, "чёрный"),
                new TShirt(Size.XXS, 9.99, "розовый") // детский
        };

        Atelier.dressWomen(wardrobe);
        Atelier.dressMan(wardrobe);
    }
}