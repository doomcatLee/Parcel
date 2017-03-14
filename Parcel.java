class Parcel{
  public double length;
  public double height;
  public double width;
  public double weight;
  public int price;

  public Parcel(double lt, double ht, double wd, double wt){
    length = lt;
    height = ht;
    width = wd;
    weight = wt;
  }


  public double surfaceArea(){
    return height * length;
  }

  public double volume(){
    return length * height * width;
  }


  public double deliverySpeed(int opt){
    //One-day delivery
    if (opt == 1){
      return 20;
    //One-hour delivery
    }else if (opt == 2){
      return 40;
    }
    return 0;
  }

  public double addWrapper(){
    if (surfaceArea() < 500 ){
      return 20;
    }else if (surfaceArea() > 500){
      return 40;
    }
    return 0;
  }

  public void applyDiscount(){
    price -= 20;
  }

  public double costToShip(){
    //if volume is over 500
    if (volume() > 500){
      price += 20;
    }
    //if weight is over 40 pounds
    if (weight > 40){
      price += 20;
    }
    return price;
  }

  public String toString(){
    return "Package price: $" + price;
  }
}
