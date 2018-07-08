public class Device {
    String code;
    String producer;
    String type;
    double price;

    Device (String code, String producer, String type){
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    Device (String code, String producer, String type, double price){
        this (code, producer, type);
        //        this.code = code;
//        this.producer = producer;
//        this.type = type;
        this.price = price;

    }



    String getInfo (){
        String gI = code +", "+ producer+", " + type +", " + price;
        return gI;
    }
}
