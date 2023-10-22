package lib;

import java.util.ArrayList;
import java.util.List;

public class SexOptions extends SexOption{
    private ArrayList<SexOption> options = new ArrayList<SexOption>();
    
    /**
     * @param name
     * @param id
     * @param options
     */
    public SexOptions(String name, int id) {
        super(name, id);
        System.out.println();
    }


    public void addOptions(List<String> args){
        for (String string : args) {
            System.out.println(string);
            options.add(new SexOption(string, options.size()+1));
        }
    }

    /**
     * @return the options
     */
    public ArrayList<SexOption> getOptions() {
        return options;
    }

    
}