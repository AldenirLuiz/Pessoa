package lib;

public class Pessoa {
    private String name;
    private SexOption sex;
    private String birth;
    
    /**
     * @param name
     * @param sex
     * @param birth
     */

    public Pessoa(String name, SexOption sex, String birth) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public SexOption getSex() {
        return this.sex;
    }
    
    public void setSex(SexOption option) {
        this.sex = option;
    }
    
    public String getBirth() {
        return birth;
    }
    
    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.name, this.sex, this.birth);
    }

    
}
