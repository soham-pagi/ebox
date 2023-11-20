class Customer {
    private int id;
    private String name;
    private String email;
    private String phoneNO;

    public Customer() {
    }

    public Customer(int id, String name, String email, String phoneNO) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNO = phoneNO;
    }

    // Getters and Setters

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-15s%-25s%-15s", id, name, email, phoneNO);
    }

}