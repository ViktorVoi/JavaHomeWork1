package com.pb.voitovych.hw7;

public class Atelier {

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt("футболка", Size.S, 22.5,"червоний") ;
        Pants pants = new Pants("штани", Size.L, 62.8,"чорний") ;
        Skirt skirt = new Skirt("спідниця", Size.XS, 38.0,"ряба") ;
        Tie tie = new Tie("краватка", Size.XXS, 10.2,"перлиновий") ;


        Clothes[] listClothes = new Clothes[] {tshirt, pants, skirt, tie} ;

        dressMan(listClothes);
        dressWomen(listClothes) ;
    }

    public static void dressMan(Clothes...clothes) {
        for (Clothes oneClothes: clothes) {
            if (oneClothes instanceof ManClothes) {
                ((ManClothes) oneClothes).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes...clothes) {
        for (Clothes oneClothes: clothes) {
            if (oneClothes instanceof WomenClothes) {
               ((WomenClothes) oneClothes).dressWomen();
            }
        }
    }

}
