 class Phone extends Product{
     String phoneNumber;

     public Phone() {
     }

     public Phone(int id, String name, double price, String phoneNumber) {
         this.id = id;
         this.name = name;
         this.price = price;
         this.phoneNumber = phoneNumber;
     }
}
