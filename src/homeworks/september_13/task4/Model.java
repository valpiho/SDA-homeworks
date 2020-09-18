package homeworks.september_13.task4;

public enum Model {
    M3(Brand.BMW, "M3"),
    M4(Brand.BMW, "M4"),
    M5(Brand.BMW, "M5"),
    E300(Brand.MB, "E300"),
    AMG(Brand.MB, "AMG"),
    CLS(Brand.MB, "CLS"),
    A5(Brand.AUDI, "A5"),
    A7(Brand.AUDI, "A57"),
    DIAVEL(Brand.DUCATI, "Diavel"),
    MONSTER(Brand.DUCATI, "Monster");

    Brand brand;
    String model;


    Model(Brand brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model : " + model;
    }
}
