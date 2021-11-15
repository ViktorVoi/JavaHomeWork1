package com.pb.voitovych.hw7;

public enum Size {
    XXS("Дитячий розмір", 32),
    XS("Підлітковий розмір", 34),
    S("Старший підлітковий розмір", 36),
    M("Дорослий розмір", 38),
    L("Дорослий розмір", 40);

    private String description ;
    private int euroSize ;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }


    public String getDescription() {
        return this.description ;
    }

    public int getEuroSize() {
        return this.euroSize ;
    }

}
