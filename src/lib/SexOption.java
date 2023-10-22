package lib;



public class SexOption {
    private String name;
    private int id;

    /**
     * @param name
     * @param id
     */
    public SexOption(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
   
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return String.format("%s \t\t->ID:%s", this.name, this.id);
    }
}