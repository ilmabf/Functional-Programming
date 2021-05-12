object Wholesale extends App{

  def discount(x:Int):Double = x*(24.95*0.6);

  def cost(NumberofBooks:Int){
    var shippingCost : Double = 0;
    if(NumberofBooks<=50){
      shippingCost = 3*NumberofBooks;
    }
    else{
      shippingCost = 0.75*(NumberofBooks-50)+150;
    }
    val totalCost = shippingCost + discount(NumberofBooks) ;
    printf("Total Wholesale Cost = %.2f", totalCost);
  }

  cost(60);
}
