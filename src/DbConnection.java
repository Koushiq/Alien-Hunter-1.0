
import java.awt.HeadlessException;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DbConnection
{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    //private LoginMenu loginMenu;
    private JFrame jf;
    private String username;
    private String password;
    private boolean flag;
    private String maximumScore;
    private String maximumLevel;
    private String maximumKills;
    //private final JFrame popupFrame;
    public DbConnection()
    {
       
        jf = new JFrame();
        flag=false;
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alien shooter 1.0","root","");
            System.out.println("Connection success !!");
            st = con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Error  here"+e);
        }
    }
    public void getResultSet()
    {
       /* try{
            String query= "select * from playersinfo";
            rs=st.executeQuery(query);
            while(rs.next()){
            String name = rs.getString("username");
            String password= rs.getString("password");
            String maxscore = rs.getString("maxscore");
            String killcount = rs.getString("killcount");
            String maxlevel = rs.getString("maxlevel");
            System.out.println("username = "+name);
            System.out.println("password = "+password);
            System.out.println("maxscore = "+maxscore);
            System.out.println("killcount = "+killcount );
            System.out.println("maxlevel = " + maxlevel);
            }
        }
        catch(Exception e)
        {
           System.out.println("Error me"+e);
        }*/
       
        
    }
    public void insertDb(String name,String password)
    {
        boolean mark=true;
        try
        {
            String query = "select username from playersinfo where username = '"+name+ "';";
            rs=st.executeQuery(query);
            while(rs.next())
            {
               username = rs.getString("username");
               if(name.equals(username))
               {
                   mark=false;
               }
            }
            
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(jf,"Wrong Username or password","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        if(!mark)
        {
            JOptionPane.showMessageDialog(jf,"Name Exists ! Try different name","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
        
        try
        {
            String query = "insert into playersinfo (username,password,maxscore,killcount,maxlevel) values ('"+ name + "','" + password + "','" + 0 + "','" + 0 + "','" + 0 + "');";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(jf,"Account Successfully Added");
            System.out.println(query);
        }
        catch(Exception e)
        {
            System.out.println("exception " + e);
        }
        }
    }
    public void resetValues(String name)
    {
        try
        {
            String query = "UPDATE `playersinfo` SET `maxscore` = '0', `killcount` = '0', `maxlevel` = '0' WHERE `playersinfo`.`username` = '"+username+"';";
            st.executeUpdate(query);
             JOptionPane.showMessageDialog(jf,"Stats have been reset");
            
        }
        catch(Exception e)
        {
            System.out.println("exception " + e);
        }
    }
    public void checkLogin(String userName,String Password)
    {
        flag=false;
        try
        {
           String query = "select username, password from playersinfo where username= '"+ userName +"' and password= '"+ Password + "';";
           rs=st.executeQuery(query);
           while(rs.next())
           {
                username = rs.getString("username");
                password = rs.getString("password");
                
               if(username.equals(userName) && password.equals(Password))
               {
                   flag=true;
               } 
           }
           if(flag==true)
           {
               
               Main.loginMenu.setVisible(true);
               Main.menu.setVisible(false);
           }
           else
           {
               JOptionPane.showMessageDialog(jf,"Wrong Username or password","ERROR",JOptionPane.ERROR_MESSAGE);
           }
           
           
           
        }
        catch(SQLException | HeadlessException e)
        {
              System.out.println(e);
              
        }
    }
    public void deleteAcc(String username)
    {
        this.username=username;
        String query = "DELETE FROM `playersinfo` WHERE `username` = '"+username+"';";
        try {
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(jf,"Account Successfully Deleted");
            Main.loginMenu.setVisible(false);
            Main.menu.setVisible(true);
            
        } catch (SQLException ex) {
            
        }
    }
    public void checkScore(long score,String username,long killCount,int maxLevel)
    {
       
        long scr=0;
        long kills=0;
        int maxlvl=0;
        String query1="select maxscore , killcount , maxlevel from playersinfo where username = '"+username+"';";
        
        try
        {
            rs=st.executeQuery(query1);
            System.out.println(query1);
            while(rs.next())
            {
                System.out.println("Ok");
                scr=Long.parseLong(rs.getString("maxscore"));
                kills=Long.parseLong(rs.getString("killcount"));
                maxlvl=Integer.parseInt(rs.getString("maxlevel"));
                
                if(scr>=score)
                {
                // JOptionPane.showMessageDialog(jf,"New HighScore");
                   
                   score=scr;
                }
                if(kills>=killCount)
                {
                   
                   killCount=kills;
                }
                if(maxlvl>=maxLevel)
                {
                   
                   maxLevel=maxlvl;
                }
            }
            
        }
        catch (Exception e) 
        {
            //Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query2= "UPDATE `playersinfo` SET `maxscore` = '"+score+"', `killcount` = '"+killCount+"', `maxlevel` = '"+maxLevel+"' WHERE `playersinfo`.`username` = '"+this.username+"'";
        try
        {
            st.executeUpdate(query2);
        }
        catch(Exception e)
        {
            
        }
         
    }
    public void info()
    {
        DefaultTableModel model = (DefaultTableModel)Main.ts.getTable().getModel();
        while(model.getRowCount() > 0)
        {
           model.removeRow(0);
        }
        
        try
        {
            String query="select * from playersinfo order by maxscore DESC";
            rs=st.executeQuery(query);
            while(rs.next())
            {
                username=rs.getString("username");
                maximumScore=rs.getString("maxscore");
                maximumKills=rs.getString("killcount");
                maximumLevel=rs.getString("maxlevel");
                model.addRow(new Object[]{username,maximumScore,maximumKills,maximumLevel
                });
                
            }
        }
        catch (Exception e)
        {
            
        }
    }
    
}
