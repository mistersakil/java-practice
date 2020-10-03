public class MysqlConnection {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded");
        }catch (ClassNotFoundException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
