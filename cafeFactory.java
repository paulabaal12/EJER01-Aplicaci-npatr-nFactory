public class cafeFactory {
    public class CoffeeFactory {
        public cafes createCoffee(int type) {
            cafes coffee = null;
    
            switch (type) {
                case 1:
                    coffee = new americano();
                    break;
                case 2:
                    coffee = new Capuccino();
                    break;
                case 3:
                    coffee = new caramel_mocchiato();
                    break;
                case 4:
                    coffee = new expreso();
                    break;
                case 5:
                    coffee = new frappe();
                    break;
                case 6:
                    coffee = new helado();
                    break;
                case 7:
                    coffee = new latte();
                    break;
                case 8:
                    coffee = new mocca();
                    break;
            }
    
            return coffee;
        }
    }
    
}
