class Computer{
    private String brandName;
    private int price;
    public Computer(String brandName, int price){
        this.brandName = brandName;
        this.price = price;
    } 
    class Memory{
        private boolean hdd;
        private int space;
        public Memory(boolean hdd, int space){
            this.hdd = hdd;
            this.space = space;

        }
        public String toString(){
            String memoryDetails = "Is the memory hdd:"+this.hdd+"Total space:"+this.space;
            return memoryDetails;
        }
    }
    public String toString(){
        String computerDetails = "Brand Name:"+this.brandName+"Price:"+this.price;
        return computerDetails;
    }
}
public class InnerDemo{
    public static void main(String[] args){
        Computer computer = new Computer("Apple",120000);
        Computer.Memory mem = computer.new Memory(false,20);
        System.out.println(computer);
        System.out.println(mem);
    }
}