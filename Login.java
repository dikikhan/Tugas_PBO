

class Login{
    
    //deklarasi variabel
    private String username, password;
    
    //deklarasi constructor. keyword this.
    public Login()
    {
        username = "Diki Wahyudy";
        password = "202113016";
    }
    public Login(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    //setter(membuat method setter untuk masing variabel, tujuan mengubah nilai variabel username dan password
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    //getter(fungsi mengambil nilai dari masing-masing variabel, tujuan mengambil nilai dari class login yang akan kembalikan pada Class Utama
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
}