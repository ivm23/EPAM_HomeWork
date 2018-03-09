package main.model.OfficeSupplies.WritingOfficeSupplies;

import main.model.OfficeSupplies.OfficeSuppliesName;

public class Pencil extends WritingOfficeSupplies {
    private String rigidity;

    public Pencil(double price) {
        super(price, OfficeSuppliesName.PENCIL);
        rigidity = "H";
    }

    public Pencil(double price, String rigidity) {
        super(price, OfficeSuppliesName.PENCIL);
        this.rigidity = rigidity;
    }

    public Pencil(double price, String rigidity, Color color) {
        super(price, OfficeSuppliesName.PENCIL, color);
        this.rigidity = rigidity;
    }

    public String getRigidity() {
        return rigidity;
    }

    public void setRigidity(String rigidity) {
        this.rigidity = rigidity;
    }
}
