package clonable;

public class NicB implements Cloneable{
    private String macAddress;
    private String ipAddress;

    @Override
    public NicB clone(){

        NicB comB = new NicB();
        try {
           comB = (NicB)super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return comB;
    }
    // getter,setter:

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
    
}
