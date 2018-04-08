package main.java;

import java.io.Serializable;

public class Role implements Serializable{
    private String roleName;
    private  boolean mainRole;

    public Role(String roleName, boolean mainRole) {
        this.roleName = roleName;
        this.mainRole = mainRole;
    }

    public boolean isMainRole() {
        return mainRole;
    }

    public String getRoleName() {
        return roleName;
    }

    @Override
    public String toString() {
        return (roleName + ((mainRole) ? " is main role" : "is role of the second plan"));
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

        Role role = (Role)object;

        if (roleName == null){
            return false;
        }

        if (!roleName.equals(role.roleName) || mainRole != role.mainRole) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return (null != roleName ? roleName.hashCode() + (mainRole ? 1 : 0) : 0);
    }
}
