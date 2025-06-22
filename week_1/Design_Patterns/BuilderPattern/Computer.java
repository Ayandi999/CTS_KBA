package Design_Patterns.BuilderPattern;

/*I have made all the attributes as private to promote Encapsulation */

public class Computer{
     private String cpu;
     private String ram;
     private String storage;
     private String gpu;
     //private constructor to take a builder class object
     private Computer(Builder builder){
          this.cpu=builder.cpu;
          this.ram=builder.ram;
          this.storage=builder.storage;
          this.gpu=builder.gpu;
     }
     //Nested builder class
     public static class Builder{
          private String cpu;
          private String ram;
          private String storage;
          private String gpu;

          public Builder setCpu(String cpu){
               this.cpu=cpu;
               return this;
          }
          public Builder setRam(String ram){
               this.ram=ram;
               return this;
          }
          public Builder setStorage(String storage){
               this.storage=storage;
               return this;
          }
          public Builder setGpu(String gpu){
               this.gpu=gpu;
               return this;
          }

          public Computer build(){
               return new Computer(this);
          }
     }
}

class Customer{
     public static void main(String[] args){
          Computer computer= new Computer.Builder()
               .setCpu("Intel i7")
               .setRam("64GB")
               .setStorage("2TB SSD")
               .setGpu("NVIDIA RTX 4090")
               .build();
          /*Can not access the private attributes directly soi am showing if the computer was successfully created. */
          if(computer != null){
               System.out.println("Computer built successfully!");
          } else {
               System.out.println("Failed to build computer.");
          }
     }
}