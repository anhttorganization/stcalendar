package vn.edu.vnua.dse.stcalendar.security.model;

public enum Scopes {
    REFRESH_TOKEN;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}

