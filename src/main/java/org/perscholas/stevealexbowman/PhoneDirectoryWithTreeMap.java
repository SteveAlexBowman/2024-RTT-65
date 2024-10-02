package org.perscholas.stevealexbowman;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryWithTreeMap {
    /*
        The TreeMap that will store the data.  Both key and value are
        of type String.  The key represents a name and the value
        represents the associated phone number.
    */

    private TreeMap<String, String> data = new TreeMap<>(); // had to add = new TreeMap<>(); to resolve compilation errors


    /*
        Constructor creates an initially empty directory
    */

    public String getNumber( String name ) {
        return this.data.get(name);
    }

    /*
        Associates a given name with a given phone number.  If the name
        already exists in the phone directory, then the nuew number replaces
        the old one.  Otherwise, a new name/number pair is added.  The
        name and number should both be non-null.  an IllegalArgumentException
        is thrown if this is not the case.
     */

    public void putNumber(String name, String number) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        this.data.put(name,number);
    }

    /*
        Write the contents of the phone directory to System.out
     */

    public void print() {
        for ( Map.Entry<String,String> entry : this.data.entrySet() )
            System.out.println( entry.getKey() + ": " + entry.getValue() );
    }
}  // End class PhoneDirectoryWithTreeMap
