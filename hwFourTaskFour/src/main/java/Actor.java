package main.java;

import java.io.Serializable;

public class Actor implements Serializable{

    private String firstName;
    private String secondName;

    public Actor(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object object) {
        if( this == object)
        {
            return true;
        }
        if (null == object)
        {
            return false;
        }
        if(getClass() != object.getClass())
        {
            return false;
        }

        Actor actor = (Actor)object;

        if (firstName == null || secondName ==  null) {
            return false;
        }
        if (!firstName.equals(actor.firstName) || !secondName.equals(actor.secondName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return (null != firstName && null!= secondName ? firstName.hashCode() + secondName.hashCode() : 0);
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, secondName);
    }
}
