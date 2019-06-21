public class Main 
{
	public static GameSetup  game;
        public static Menu menu;
        public static DbConnection db;
        public static LoginMenu loginMenu;
        public static SignUpMenu signup;
        public static TableStats ts;
	public static void main(String[] args)
	{
              menu = new Menu();
              menu.setVisible(true);
              db = new DbConnection();
              loginMenu= new LoginMenu();
              signup= new SignUpMenu();
              ts = new TableStats();
              game = new GameSetup("Alien Hunter 1.0",460,560);
             // DbConnection db = new DbConnection();
              //db.getResultSet();
              //db.insertDb("fahmid", "k1234", 1300, 30, 3);
           
	}	
}
