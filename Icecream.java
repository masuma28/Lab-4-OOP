public class Icecream {
    String icecreamType;
    String icecreamCompany;
    double icecreamPrice;

    public Icecream() {}

    public Icecream(String type, String company, double price) {
        icecreamType = type;
        icecreamCompany = company;
        icecreamPrice = price;
    }

    public void setIcecreamType(String type) {
        icecreamType = type;
    }

    public void setIcecreamCompany(String company) {
        icecreamCompany = company;
    }

    public void setIcecreamPrice(double price) {
        icecreamPrice = price;
    }

    public String getIcecreamType() {
        return icecreamType;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    public double getIcecreamPrice() {
        return icecreamPrice;
    }

    public String toString() {
        return "Type: " + icecreamType + ", Company: " + icecreamCompany + ", Price: " + icecreamPrice;
    }

    public boolean equals(Icecream i) {
        return this.icecreamType.equals(i.icecreamType) &&
                this.icecreamCompany.equals(i.icecreamCompany) &&
                this.icecreamPrice == i.icecreamPrice;
    }

    public int compareTo(Icecream i) {
        if (this.icecreamPrice > i.icecreamPrice)
            return 1;
        else if (this.icecreamPrice < i.icecreamPrice)
            return -1;
        else
            return 0;
    }
}

