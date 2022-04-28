package clonable;

/**
 * @author keiichikatsuno
 *
 */
public class ComputerB implements Cloneable {

    private int id;
    private String name;
    private NicB nic = new NicB();

    @Override
    public ComputerB clone(){

        ComputerB comB = new ComputerB();
        try {
           comB = (ComputerB)super.clone();
           comB.nic = this.nic.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return comB;
    }
    // getter,setter:

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NicB getNic() {
		return nic;
	}

	public void setNic(NicB nic) {
		this.nic = nic;
	}
    
}