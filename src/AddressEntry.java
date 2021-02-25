/**
 * Contains the basic information for any individual
 */
public class AddressEntry implements Comparable<AddressEntry>
{
    /**
     * The individual's first name
     */
    private String firstName;
    /**
     * The individual's last name
     */
    private String lastName;
    /**
     * The individual's street
     */
    private String street;
    /**
     * The individual's city
     */
    private String city;
    /**
     * The individual's state
     */
    private String state;
    /**
     * The individual's zip
     */
    private int zip;
    /**
     * The individual's phone number
     */
    private String phone;
    /**
     * The individual's personal email
     */
    private String email;

    AddressEntry(){
        firstName = "";
        lastName = "";
        street = "";
        city = "";
        state = "";
        zip = 0;
        phone = "";
        email = "";
    };

    /**
     * Initializes all the information for an individual
     * @param firstname is persons first name
     * @param lastname is person's last name
     * @param theStreet is person's street address
     * @param theCity is person's city
     * @param theState is person's state
     * @param theZip is person's zip
     * @param thePhone is person's phone number
     * @param theEmail is person's personal email
     */
    AddressEntry(String firstname, String lastname, String theStreet, String theCity,
                 String theState, int theZip, String thePhone, String theEmail)
    {
        firstName = firstname;
        lastName = lastname;
        street = theStreet;
        city = theCity;
        state = theState;
        zip = theZip;
        phone = thePhone;
        email = theEmail;
    }
    /**
     * used to compare AddressEntries in order to be able to sort them
     * in alphabetical order
     * @param obj any AddressEntry object within an AddressBook
     */
    public int compareTo(AddressEntry obj)
    {
        return this.getLastName().compareToIgnoreCase(obj.getLastName());
    }
    /**
     * Formats the individuals information properly, ready to be printed
     * @return a String containing the individuals information well formatted
     */
    public String toString()
    {
        return firstName + " " + lastName + " \n" + street + " " + city + " \n" + state + " "
                +zip + " \n" + phone + " \n" + email + "\n";
    }

    /**
     * Sets the first name of the individual
     * @param name of the individual
     */
    public void setFirstName(String name)
    {
        firstName = name;
    }

    /**
     * Returns String of the first name
     * @return person's first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets last name of the individual
     * @param name is the individuals last name
     */
    public void setLastName(String name)
    {
        lastName = name;
    }

    /**
     * Returns String of person's last name
     * @return person's last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets the street address of the individual
     * @param theStreet is the street where person lives
     */
    public void setStreet(String theStreet)
    {
        street = theStreet;
    }

    /**
     * Returns String value containing the address
     * @return the street address
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * Sets the city of the individual
     * @param theCity is the city person lives in
     */
    public void setCity(String theCity)
    {
        city = theCity;
    }
    /**
     * Returns String value containing the city
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Sets state of the individual
     * @param theState is the state of the person
     */
    public void setState(String theState)
    {
        state = theState;
    }

    /**
     * Returns String value of the person's state
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets the zip of the individual
     * @param theZip is the person's zip
     */
    public void setZip(int theZip)
    {
        zip = theZip;
    }

    /**
     * Returns int of person's zip
     * @return the zip
     */
    public int getZip()
    {
        return zip;
    }

    /**
     * Sets the phone of the individual
     * @param thePhone is the person's phone
     */
    public void setPhone(String thePhone)
    {
        phone = thePhone;
    }

    /**
     * Returns String value of the phone number
     * @return the ohone number
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * Sets the email of the individual
     * @param theEmail is the person's email
     */
    public void setEmail(String theEmail)
    {
        email = theEmail;
    }

    /**
     * Returns String value of the email
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

}
