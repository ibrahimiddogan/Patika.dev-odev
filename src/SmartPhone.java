 class SmartPhone extends Phone { int storage;
     int ram;
     int camera;

     public SmartPhone() {
     }

     public SmartPhone(int id, String name, double price, String phoneNumber, int storage, int ram, int camera) {
         super(id, name, price, phoneNumber);
         this.storage = storage;
         this.ram = ram;
         this.camera = camera;
     }
}
