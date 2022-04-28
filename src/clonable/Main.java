package clonable;

public class Main {
    public static void main(String[] args) {

        ComputerB com = new ComputerB();

        // set attributes
        com.setId(1);
        com.setName("myComputer");
        com.getNic().setMacAddress("00-00-00-00-00-00-00-E0");
        com.getNic().setIpAddress("192.168.1.1");

        // try cloning
        ComputerB com2 = com.clone();
        // com2の名前を書き換える
        com2.setName("yourComputer");
        // com2のmacAddressを書き換える
        com2.getNic().setMacAddress("11-11-11-11-11-11-11-E1");

        // com, com2のName,macAddressを出力
        System.out.println("comのNameは(" + com.getName() + ")");
        System.out.println("com2のNameは(" + com2.getName() + ")");
        System.out.println("comのmacAddressは(" + com.getNic().getMacAddress() + ")");
        System.out.println("com2のmacAddressは(" + com2.getNic().getMacAddress() + ")");
    }
}
